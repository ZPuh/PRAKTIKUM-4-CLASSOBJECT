package no07_08_09_10;

public class SubGitar extends SuperAlatMusik {

    private String warna;
    private int harga;

    // constructor
    public SubGitar() {

    }

    // Overloading 
    public SubGitar(String warna, int harga) {
        this.warna = warna;
        this.harga = harga;
    }

    // Overridding
    void Mainkan() {
        System.out.println("Gitar Dimainkan");
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
