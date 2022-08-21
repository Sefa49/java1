package day12_StringManipulations;

import java.util.Locale;

public class C03_SubString {

    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(soyisim.length()-1)); //l

        System.out.println(isim.substring(2,4)); //le

        //// isim ve soyisim ilk harf buyuk , geriye kalan *
        // kredi karti ilk dort rakam gorunsun, gersi *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w","*");

        String kkilk4=kartNo.substring(0,4);
        String kkGeriyekalan=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "+
                soyisimIlkHarf+soyisimGeriyeKalan+"\n"+
                kkilk4+kkGeriyekalan);

    }
}