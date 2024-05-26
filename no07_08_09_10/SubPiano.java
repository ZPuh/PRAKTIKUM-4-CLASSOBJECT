package no07_08_09_10;

public class SubPiano extends SuperAlatMusik {

    private String warna;
    private int harga;

    // Constructor
    public SubPiano() {
    }

    // Overloading
    public SubPiano(String warna, int harga) {
        this.warna = warna;
        this.harga = harga;
    }

    // Overloading
    void Mainkan() {
        System.out.println("Piano Dimainkan");
    }

    // Getter dan Setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
