package no07_08_09_10;

public class SubPersegiPanjang extends SuperBangunDatar {

    private int Luas;
    private int Keliling;

    public SubPersegiPanjang() {
    }

    public SubPersegiPanjang(int Luas, int Keliling) {
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
