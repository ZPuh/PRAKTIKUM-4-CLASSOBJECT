package no07_08_09_10;

public class SubManajer extends SuperKaryawan {

    String nama;
    double gaji;

    public SubManajer() {
    }

    public SubManajer(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    void Info() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }

}
