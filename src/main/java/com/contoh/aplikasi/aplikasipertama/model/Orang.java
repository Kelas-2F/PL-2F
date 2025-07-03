package com.contoh.aplikasi.aplikasipertama.model;

public class Orang {
    private Long id;
    private String nama;
    private int umur;

    public Orang() {
    }

    public Orang(Long id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "orang{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }
}
