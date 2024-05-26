package no07_08_09_10;

public class SubLingkaran extends SuperBangunDatar {

    private int Luas;
    private int Keliling;

    public SubLingkaran() {
    }

    public SubLingkaran(int Luas, int Keliling) {
        this.Luas = Luas;
        this.Keliling = Keliling;
    }

    public int getLuas() {
        return Luas;
    }

    public void setLuas(int Luas) {
        this.Luas = Luas;
    }

    public int getKeliling() {
        return Keliling;
    }

    public void setKeliling(int Keliling) {
        this.Keliling = Keliling;
    }

    void Info() {
        System.out.println("Luas : " + Luas);
        System.out.println("Keliling : " + Keliling);
    }
}
