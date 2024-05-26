package no03;

import no03.Teknik.Informatika;
import no03.Teknik.PWK;
import no03.Teknik.Sipil;

public class Main02 {

    public static void main(String[] args) {
        Teknik teknik = new Teknik();
        
        Informatika informatika = teknik.new Informatika();
        informatika.setDosen("Dosen Informatika");
        informatika.setMahasiswa("Mahasiswa Informatika");
        
        Sipil sipil = teknik.new Sipil();
        sipil.setDosen("Dosen Sipil");
        sipil.setMahasiswa("Mahasiswa Sipil");
        
        PWK pwk = teknik.new PWK();
        pwk.setDosen("Dosen PWK");
        pwk.setMahasiswa("Mahasiswa PWK");
    }

}
