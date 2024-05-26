package no07_08_09_10;

public class SubBunga extends SuperTumbuhan {

    private String nama;
    private String jenis;

    public SubBunga() {
    }

    public SubBunga(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void Info() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}
