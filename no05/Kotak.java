package no05;

public class Kotak {

    String warna;
    double panjang;
    double lebar;
    double keliling;
    double luas;

    void setWarna(String w) {
        warna = w;
    }

    void setPanjang(double p) {
        panjang = p;
    }

    void setLebar(double l) {
        lebar = l;
    }

    void hitungLuas() {
        luas = panjang * lebar;
    }

    void hitungKeliling() {
        keliling = panjang + lebar + panjang + lebar;
    }
}
