package dayElifHoca;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {

        //Kullanicinin isim ve soyisimini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz:\nisim");
        String isim = scan.next();
        System.out.println("soyisim");
        String soyisim = scan.next();

        if (isim.length() > soyisim.length()) {
            System.out.println("isminiz soyisiminizden buyuktur");

        } else if (isim.length() == soyisim.length()) {
            System.out.println("soyisiminiz isiminize esittir");
        } else System.out.println("soyisiminiz isiminizden buyuktur");
    }
}