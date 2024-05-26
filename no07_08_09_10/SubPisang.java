package no07_08_09_10;

public class SubPisang extends SuperBuah {

    private String nama;
    private String rasa;

    public SubPisang() {
    }

    public SubPisang(String nama, String rasa) {
        this.nama = nama;
        this.rasa = rasa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    void Info() {
        System.out.println("Nama : " + nama);
        System.out.println("Rasa : " + rasa);
    }
}
