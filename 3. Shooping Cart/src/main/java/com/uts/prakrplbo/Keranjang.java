package com.uts.prakrplbo;


import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah;

    public void tambahProduk(Buah buah){
       daftarBuah.add();

    }

    public void hapusProduk(Buah buah){
        daftarBuah.remove(buah);
    }

    public void getKeranjang(){
        System.out.println(daftarBuah);
    }

}
