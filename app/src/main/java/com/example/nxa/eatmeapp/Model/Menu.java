package com.example.nxa.eatmeapp.Model;

public class Menu {
    private String Harga;
    private String Nama;

    public Menu(String harga, String nama) {
        Harga = harga;
        Nama = nama;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public Menu() {

    }
}
