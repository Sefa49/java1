package Lambda_functional_programming02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniAyniSatirdaYazdiranMethod(liste);
        System.out.println(" ");
        ciftElemanlariYazdir(liste);
        System.out.println(liste);
        System.out.println(" ");
        tekElemanlarininKareleriniYazdir(liste);
        System.out.println(" ");
        tekrarsizTekElemanlarinKupYazdir(liste);
        System.out.println(" ");
        tekrarsizCiftElemalarinKarekleriToplamYazdir01(liste);
        System.out.println(" ");
        tekrarsizCiftElemalarinKarekleriToplamYazdir02(liste);
        System.out.println(" ");
        tekrarsizCiftElemalarinKarekleriToplamYazdir03(liste);
        TekrarsizCiftElemanlarinKupleriniCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMinimum(liste);

        tekrarsizTersSirali5denBuyukElemanlarinYarisi(liste);


    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun
    // .(Functional ve method reference)

    public static void listElemanlariniAyniSatirdaYazdiranMethod(List<Integer> list) {

        list.stream().forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdir(List<Integer> ciftlist) {
        ciftlist.stream().filter(Utils::CiftElemaniSec).forEach(Utils::AyniSatirdaBoslukLuYazdir);

    }
//3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarininKareleriniYazdir(List<Integer> tekKarelist) {
        tekKarelist.stream().filter(Utils::tekElemaniSec).map(Utils::karesinial).forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }

    public static void tekrarsizTekElemanlarinKupYazdir(List<Integer> TeklilerinKupList) {

        TeklilerinKupList.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunual).forEach(Utils::AyniSatirdaBoslukLuYazdir);


    }
//5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemalarinKarekleriToplamYazdir01(List<Integer> CiftKarelerToplist) {

        Integer toplam = CiftKarelerToplist.stream().distinct().filter(Utils::CiftElemaniSec).
                map(Utils::karesinial).reduce(0, Math::addExact);


        //Integer toplam=  CiftKarelerToplist.stream().distinct().filter(Utils::CiftElemaniSec).
        //      map(Utils::karesinial).reduce(Math::addExact).get();---> bu methodda ayni islemi yapiyor
        System.out.println(toplam);


    }


    public static void tekrarsizCiftElemalarinKarekleriToplamYazdir02(List<Integer> CiftKarelerToplist) {

        Integer toplam = CiftKarelerToplist.stream().distinct().filter(Utils::CiftElemaniSec).
                map(Utils::karesinial).reduce(Math::addExact).get();


        System.out.println(toplam);
    }

    public static void tekrarsizCiftElemalarinKarekleriToplamYazdir03(List<Integer> CiftKarelerToplist) {

        Integer toplam = CiftKarelerToplist.stream().distinct().filter(Utils::CiftElemaniSec).
                map(Utils::karesinial).reduce(0, Integer::sum);


        System.out.println(toplam);


    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void TekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer>TCekupToplamlist){

        Integer carpim =TCekupToplamlist.stream().distinct().filter(Utils::CiftElemaniSec).
                map(Utils::kupunual).reduce(1,Math::multiplyExact);
        System.out.println(carpim);



    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer>Maxlist){


  Integer maxvalue=Maxlist.stream().distinct().reduce(Math::max).get();

        System.out.println(maxvalue);
    }

    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun

    public static void yedidenBuyukCiftMinimum(List<Integer>list){

            Integer min= list.stream().distinct().filter(t->t>7)
                .filter(Utils::CiftElemaniSec).reduce(Math::min).get();
        System.out.println(min);

    }
//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini
// (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

public static void tekrarsizTersSirali5denBuyukElemanlarinYarisi(List<Integer>list){

                        List<Double> sonuc =list.stream().
                        filter(t->t>5).
                        map(Utils::yarisinal).
                        sorted(Comparator.
                                reverseOrder()).
                       collect(Collectors.toList());

    System.out.println(sonuc);


}

}