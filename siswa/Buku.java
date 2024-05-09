/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.siswa;

import java.util.ArrayList;
/**
 *
 * @author SMK TELKOM 13
 */
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku() {
        this.namaBuku.add("Private Bodyguard");
        this.stok.add(5);
        this.harga.add(99000);
        this.namaBuku.add("Hold On, It Hurts");
        this.stok.add(4);
        this.harga.add(99000);
        this.namaBuku.add("Iyan Bukan Anak Tengah");
        this.stok.add(3);
        this.harga.add(99000);
    }
    
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    
    public void setNamaBuku (String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
}
