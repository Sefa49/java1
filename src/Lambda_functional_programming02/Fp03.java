package Lambda_functional_programming02;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {


    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarflrYazdir(liste);
        System.out.println(liste);
        System.out.println(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println(" ");
        uzunlugaGoreYazdir2(liste);
        System.out.println(" ");
        sonKaraktoreGoreSirala(liste);
        System.out.println(" ");
        UzunlikVeHarfeGoreSirala(liste);
        System.out.println(" ");
        //bestenBuyukleriSil(liste);
        System.out.println("");
        // bestenBuyukleriSi(liste);
        //baslangiciAyadaSonuNolanSil

        System.out.println("Uzunlugu12den azmi " + uzunlmiugu12denAzmi(liste));

        System.out.println("x ile baslamiyormu? "+ xilebaslamiiyormu(liste) );
        System.out.println("R ile biten varmi? "+    Rilebitenvarmi(liste));



    }

    public static void buyukHarflrYazdir(List<String> Buyukliste) {
        Buyukliste.stream().map(String::toUpperCase).forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }

    public static void uzunlugaGoreYazdir2(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).
                reversed()).forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }

    public static void sonKaraktoreGoreSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKaarakterAl)).forEach(Utils::AyniSatirdaBoslukLuYazdir);

    }

    // Elemanları önce uzunluklarına göre ve sonra
// ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void UzunlikVeHarfeGoreSirala(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).
                thenComparing(Utils::ilkKarakteriAl)).//thenComparing() :==>siralam icin bir kosul daha belirtir
                forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }
    //6)// Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    // public  static void bestenBuyukleriSil(List<String>list){

    //list.removeIf(t->t.length()>5);

    // System.out.println(list);

//list===> ,mutable oldugundan elemanlari kalici degisiklige ugratir o yuzden calistirmadik







   // public static void baslangiciAyadaSonuNolanSil(List<String>list){

        //list.removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a'||t.charAt(t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1) =='n');
//System.out.print.ln(list);

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

public static boolean uzunlmiugu12denAzmi(List <String>list){

        return list.stream().allMatch(t->t.length()<12);




}
//10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xilebaslamiiyormu(List<String>list){

        return list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));




    }
//11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
public static boolean Rilebitenvarmi(List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));


}



    }

