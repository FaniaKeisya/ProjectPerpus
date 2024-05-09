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
public class Petugas implements user {
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas() {
        this.namaPetugas.add("mimin");
        this.alamat.add("Kedung Kandang");
        this.telepon.add("08177888888");
    }
    
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
}
