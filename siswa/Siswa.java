/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.siswa;

import java.util.ArrayList;
/**
 *
 * @author SMK TELKOM 13
 */
public class Siswa implements user {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa(){
        this.namaSiswa.add("daniel");
        this.alamat.add("Sawojajar");
        this.telepon.add("08121345777");
        this.status.add(true);
        
        this.namaSiswa.add("damian");
        this.alamat.add("Sawojajar");
        this.telepon.add("08131266888");
        this.status.add(true);
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public Boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    public void editStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);
    }
    public int getJmlSiswa(){
        return this.status.size();
    }
    
    @Override
    public void setNama(String namaSiswa){
        this.namaSiswa.add(namaSiswa);
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
    public String getNama(int idSiswa){
        return this.namaSiswa.get(idSiswa);
    }
    
    @Override
    public String getAlamat(int idSiswa){
        return this.alamat.get(idSiswa);
    }
    
    @Override
    public String getTelepon(int idSiswa){
        return this.telepon.get(idSiswa);
    }
}
