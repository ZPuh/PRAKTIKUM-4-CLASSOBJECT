package no07_08_09_10;

public class SubKelinci extends SuperHewan {

    String jenis;
    String makanan;

    public SubKelinci() {
    }

    public SubKelinci(String jenis, String makanan) {
        this.jenis = jenis;
        this.makanan = makanan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    void Info() {
        System.out.println("Jenis : " + jenis);
        System.out.println("Makanan : " + makanan);
    }
}
