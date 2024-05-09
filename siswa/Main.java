/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.siswa;

import java.util.Scanner;

/**
 *
 * @author SMK TELKOM 13
 */
public class Main {
    
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int main = 0;
        
        do{
            Buku buku = new Buku();
            Laporan laporan = new Laporan();
            Siswa siswa = new Siswa();
            Peminjaman peminjaman = new Peminjaman();
            laporan.laporan(buku);
            peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);
            laporan.laporan(peminjaman, buku);
            laporan.laporan(siswa);
            
            main = key.nextInt();
        }while (main != 99);
            System.exit(0);
    } 
    
}
