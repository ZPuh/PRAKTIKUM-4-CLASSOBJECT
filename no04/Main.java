package no04;
        /*
Keyword static digunakan untuk memanggil field atau method di kelas lain tanpa membuat object atau menginstan class.        
        */

public class Main {

    public static void main(String[] args) {
        newClass.setFields1("Fields 1");
        newClass.setFields2("Fields 2");
        
        System.out.println(newClass.getFields1());
        System.out.println(newClass.getFields2());
    }

}
