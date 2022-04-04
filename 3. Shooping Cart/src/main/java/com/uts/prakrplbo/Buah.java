package com.uts.prakrplbo;

public class Buah {
    private String nama;
    private int jumlah;
    private int harga;

    public Buah(String nama, int jumlah, int harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
}
