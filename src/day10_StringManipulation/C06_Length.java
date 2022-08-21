package day10_StringManipulation;

public class C06_Length {


    public static void main(String[] args) {

        String str =" Java ogren, isi kap";

        System.out.println(str.length());//str in karakter sayisini dondurur ve bulur
        System.out.println(str.charAt(str.length()-1));// son karakteri yazdirir
        System.out.println(str.charAt(str.length()-3));

        /*java da null poiter isaretleyici bir deger degil, karsisina yazildigi variable in
         hic bir deger almadigindanin isareticisir*/
        String str2 = "";
        System.out.println(str2.length());
                               // bu deger burda hicliktir
    String str3=null;
                       //str3 e bir deger atanmamistir java buna isaret etmektedir.
        System.out.println(str3.length());

    }

}
