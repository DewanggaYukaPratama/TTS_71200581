package com.rplbo.utstokosedia;

public class Produk {
    private String namaProduk;
    private long harga;

    public Produk(String namaProduk, long harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public long getHarga() {
        return harga;
    }
}
