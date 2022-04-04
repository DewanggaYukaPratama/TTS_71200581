package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan ;
    private Produk produk;
    private Member member;

    public Invoice(){
        this.produk = null;
        this.jumlah = 0;
        this.member = null;
        this.tagihan = 0;
    }


    public void printInvoice(){
        System.out.println("===Invoice===");
        System.out.println("Kepada Yth."+ member.getNama());
        System.out.println("Di "+ member.getAlamat());
        System.out.println(this.jumlah + "x "+ produk.getNamaProduk() + "Rp " + produk.getHarga());
    }

    public long getTagihan() {
        return tagihan;
    }

    public void buatInvoice(Produk produk, int jumlah, Member member){
        this.produk = produk;
        this.jumlah = jumlah;
        this.member = member;
        this.tagihan = produk.getHarga() * this.jumlah;
    }

    public Member getMember(){
        return member;
    }
}
