package com.rplbo.utstokosedia;

public class Member {
    private String alamat;
    private String nama;
    private Dompet dompet;

    public Member(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.dompet = new Dompet();
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public void cekSaldo(){
        System.out.println("Saldo anda: " + dompet.getSaldo());
    }

    public void bayar(long tagihan){
        if (dompet.getSaldo() >= tagihan){
            System.out.println("Pembayaran Sukses");
            int saldoSekarang = dompet.getSaldo()- (int)tagihan;
            dompet.setSaldo(saldoSekarang);
        } else {
            System.out.println("Pembayaran Gagal");
        }
    }

    public void topUp(long nominal){
        if (nominal > 0){
            int saldoTotal = (int)(dompet.getSaldo() + nominal);
            dompet.setSaldo(saldoTotal);
            System.out.println("Top Up Sukses");
        } else {
            System.out.println("Top Up Gagal! Saldo harus lebih dari 0");
        }
    }
}
