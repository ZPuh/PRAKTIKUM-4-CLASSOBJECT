package no03;

import no03.Teknik.Informatika;
import no03.Teknik.PWK;
import no03.Teknik.Sipil;

public class Main {

    public static void main(String[] args) {
        Teknik teknik = new Teknik();
        
        Informatika inf = teknik.new Informatika();
        inf.setDosen("Dosen inf");
        inf.setMahasiswa("Mahasiswa inf");
        
        Sipil spl = teknik.new Sipil();
        spl.setDosen("Dosen Sipil");
        spl.setMahasiswa("Mahasiswa Sipil");
        
        PWK pwk = teknik.new PWK();
        pwk.setDosen("Dosen PWK");
        pwk.setMahasiswa("Mahasiswa PWK");       
        
    }

}
