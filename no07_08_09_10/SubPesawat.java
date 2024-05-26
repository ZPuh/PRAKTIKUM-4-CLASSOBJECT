package no07_08_09_10;


public class SubPesawat extends SuperKendaraan {

    private String merk;
    private double kecepatan;

    public SubPesawat() {
    }

    public SubPesawat(String merk, double kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    void Info() {
        System.out.println("Merk : " + merk);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
