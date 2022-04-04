package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring) {
        this.bilanganstring = bilanganstring;
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        return true;
    }

    public boolean apakahLebihDari10(){
        return true;
    }
}
