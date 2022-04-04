package com.rplbo.utstokosedia;

public class MemberPremium {
    public double POTONGAN = 0.1;
    private String kodeVoucer = "TOKOSEDIA25";


    public MemberPremium(String nama, String alamat){
        super(nama, alamat);
    }

    @Override
    public void bayar(long tagihan) {
        tagihan -= (tagihan * this.POTONGAN);
        super.bayar(tagihan);
    }

    public void bayar(long tagihan, String voucher){
        if (voucher == this.kodeVoucer) {
            tagihan -= (tagihan * 2.5);
            bayar(tagihan);
        } else {
            System.out.println("Kode Tidak Valid ");
        }
    }

}
