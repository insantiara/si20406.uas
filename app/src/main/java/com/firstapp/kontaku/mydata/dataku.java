package com.firstapp.kontaku.mydata;

public class dataku {

    String kunci;
    String isi;

    public dataku(){

    }

    public dataku(String kunci, String isi) {
        this.kunci = kunci;
        this.isi = isi;
    }

    public String getKunci() {
        return kunci;
    }

    public void setKunci(String kunci) {
        this.kunci = kunci;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
