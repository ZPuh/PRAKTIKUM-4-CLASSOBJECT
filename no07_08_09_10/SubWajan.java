package no07_08_09_10;

public class SubWajan extends SuperPeralatanMasak {

    private String bahan;
    private String Warna;

    public SubWajan() {
    }

    public SubWajan(String bahan, String Warna) {
        this.bahan = bahan;
        this.Warna = Warna;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void Info() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Warna : " + Warna);
    }
}
