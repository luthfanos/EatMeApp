package com.example.nxa.eatmeapp.Pegawai;

public class Pegawai {
    private String Name;
    private String Password;

    public Pegawai() {
    }

    public Pegawai(String name, String password) {
        Name = name;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
