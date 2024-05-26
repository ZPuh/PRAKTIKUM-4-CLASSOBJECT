package no07_08_09_10;

public class SubKerucut extends SuperBenda3D {

    int volume;
    int luasPermukaan;

    public SubKerucut() {
    }

    public SubKerucut(int volume, int luasPermukaan) {
        this.volume = volume;
        this.luasPermukaan = luasPermukaan;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuasPermukaan() {
        return luasPermukaan;
    }

    public void setLuasPermukaan(int luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    void Info() {
        System.out.println("Volume : " + volume);
        System.out.println("Luas Permukaan : " + luasPermukaan);
    }
}
