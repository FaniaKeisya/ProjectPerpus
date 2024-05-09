/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.siswa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SMK TELKOM 13
 */
public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku  = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Peminjaman (){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }
    
    public void prosesPeminjaman (Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan){
        Scanner key = new Scanner(System.in);
        System.out.println("======== Silahkan meminjam buku =======");
        System.out.println("======= Ketik 99 untuk keluar ======");
        System.out.print("Masukkan ID Siswa : ");
        int idSiswa = key.nextInt();
        System.out.println("Selamat Datang "+siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        
        do{
            System.out.print("Masukkan kode buku : ");
            temp = key.nextInt();
            
            if (temp!=99) {
                idBuku.add(temp);
                System.out.print (buku.getNamaBuku(idBuku.get(i))+" sebanyak : ");
                banyak.add(key.nextInt());
                
                if (banyak.get(i) > buku.getStok(idBuku.get(i))){
                    System.out.println("Sisa stok tidak mencukupi");
                    System.exit(0);
                }
                i++;
                i++;
            }
        } while (temp!=99);
        
        System.out.println("\n======Peminjaman Buku "+siswa.getNama(idSiswa)+" Sebagai Berikut======");
        System.out.println("Nama Buku    \tQty    \tHarga    \tJumlah \t");
        
        int total = 0;
        int x = idBuku.size();
        
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += jumlah;
            System.out.println(buku.getNamaBuku(idBuku.get(j))+"\t"
                    + banyak.get(j)+ "\t"
                    + "Rp." + buku.getHarga(idBuku.get(j))+"\t"
                    + "Rp." + jumlah);
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }
        
        System.out.println("\nTotal Peminjaman Buku : "+"Rp."+total);
        siswa.editStatus(idSiswa, true);
        System.out.println("Status "+siswa.getNama(idSiswa)+ " : "+ siswa.getStatus(idSiswa));
        
        if (siswa.getStatus(idSiswa)== true){
            System.out.println("DAPAT MEMINJAM BUKU");
        } else{
            System.out.println("TIDAK BOLEH MEMINJAM BUKU LAGI");
        }
        
        laporan.laporan(buku);
        System.out.print("\n Apakah Anda Ingin Mengembalikan Buku? : \n(yes/no)");
        String answer = key.next();
        
        if ("yes".equals(answer)){
            siswa.editStatus(idSiswa, true);
            System.out.println("Status "+ siswa.getNama(idSiswa)+ " : "+ siswa.getStatus(idSiswa));
            
            for (int j = 0; j < x; j++){
                peminjaman.setPengembalian(buku, idSiswa, idBuku.get(j), banyak.get(j));
                System.out.println("Dapat Meminjam Buku Lagi");
            }
        } else{
            System.out.println("ANDA BELUM MENGEMBALIKAN BUKU");
            laporan.laporan(buku);
            laporan.laporan(siswa);
            System.exit(0);
        }
    }
    
    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku)- banyaknya);
    }
    
    public void setPengembalian(Buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
    }
    
    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }
    
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
}
