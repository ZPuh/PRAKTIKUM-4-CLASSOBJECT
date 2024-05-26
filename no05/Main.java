package no05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kotak> arraylist = new ArrayList<>();
        
        Kotak kotak1 = new Kotak();                
        arraylist.add(kotak1);
        
        Kotak kotak2 = new Kotak();               
        arraylist.add(kotak2);
        
        arraylist.get(0).setWarna("Pink");
        arraylist.get(0).setLebar(5);
        arraylist.get(0).setPanjang(7);
        
        arraylist.get(1).setWarna("Black");
        arraylist.get(1).setLebar(4);
        arraylist.get(1).setPanjang(10);
        
        System.out.println(arraylist.get(0).panjang);
        System.out.println(arraylist.get(0).lebar);
        System.out.println(arraylist.get(0).warna);
        
        System.out.println(arraylist.get(1).panjang);
        System.out.println(arraylist.get(1).lebar);
        System.out.println(arraylist.get(1).warna);
    }
    
}
