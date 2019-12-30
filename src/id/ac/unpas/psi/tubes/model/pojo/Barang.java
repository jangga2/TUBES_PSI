/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpas.psi.tubes.model.pojo;

/**
 *
 * @author Ryan
 */
public class Barang {
   
    private String idBarang;
    private String nama;
    private int harga;
    private String tglMasuk;
    private String tglKeluar;
    private int stok;
    
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public Barang() {
    }
    public Barang(String idBarang, String nama, int harga, String tglMasuk, String tglKeluar, int stok) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.harga = harga;
        this.tglMasuk = tglMasuk;
        this.tglKeluar = tglKeluar;
        this.stok = stok;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
