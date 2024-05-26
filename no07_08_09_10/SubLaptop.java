package no07_08_09_10;

public class SubLaptop extends SuperGadget {

    String merek;
    double harga;

    public SubLaptop() {
    }

    public SubLaptop(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    void Info() {
        System.out.println("Merk : " + merek);
        System.out.println("Harga : " + harga);
    }
}
