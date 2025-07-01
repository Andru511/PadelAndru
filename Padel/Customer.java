/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padelrentalform;

/**
 *
 * @author ASUS
 */
public class Customer {
    private String name;
    private String nohp;
    private String tanggal;   
    private String jamMulai;
    private String jamSelesai;
    private boolean Lapangan;

    public Customer(String name, String nohp,String tanggal,String jamMulai, String jamSelesai, boolean Lapangan) {
        this.name = name;
        this.nohp = nohp;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.Lapangan = Lapangan;
    }

    public String getname() { return name; }
    public String getNohp() { return nohp; }
    public String gettanggal() { return tanggal; }
    public String getjamMulai() { return jamMulai; }
    public String getjamSelesai() { return jamSelesai; }
    public boolean getLapangan() { return Lapangan; }

    public void getname(String name) { this.name = name; }
    public void setNohp(String nohp) { this.nohp = nohp; }
    public void settanggal(String tanggal) { this.tanggal = tanggal; }
    public void setjamMulai(String jamMulai) { this.jamMulai = jamMulai; }
    public void setjamSelesai(String jamSelesai) { this.jamSelesai = jamSelesai; }
    public void setLapangan (Boolean Lapangan) { this.Lapangan = Lapangan; }

    public String getLapanganString() {
        return Lapangan ? "Lapangan 1" : "Lapangan 2" : "Lapangan3": "Lapangan4";
    }
}