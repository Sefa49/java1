package Lamda_functional_programming01;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fp01 {

/*
1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
3) Functional Programming, Arrays ve Collections ile kullanılır.
4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

 */

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method

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
        lisElemanlariniYazdirStructured(liste);
        System.out.println(" ");
        System.out.println("Fuctional");
        lisElemanlariniYazdirfuctional(liste);
        System.out.println(" ");
        ciftElemeanlariYazdirStructured(liste);
        System.out.println(" ");
        System.out.println("Functional");
        ciftElemeanlariYazdirFunctional(liste);
        System.out.println(" ");
        System.out.println("functional");
        tekElemanlarinkareleriniYazdir(liste);
        System.out.println(" ");
        System.out.println("functional");
        tekElemanlarinKupleriniTekrarsizYazdir(liste);
        System.out.println(" ");
        System.out.println("functional");
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println(" ");
        System.out.println("functional");
        tekrarsizCiftelemKupCarpim(liste);
        System.out.println(" ");
        System.out.println("functional");
        getMaxeleman(liste);
        System.out.println(" ");
        System.out.println("functional");
        getYedidenBuyukCiftMin(liste);
        System.out.println(" ");
        getYedidenBuyukCiftMin2(liste);

        System.out.println(" ");
        getYedidenBuyukCiftMin3(liste);
        System.out.println(" ");
        getTersSiralamaTekrarsizElemanlarinYarisi(liste);

    }
    public static void lisElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");

        }

    }


    public static void lisElemanlariniYazdirfuctional(List<Integer>list ){
 list.stream().forEach(t-> System.out.print(t+ " "));


    }
//2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)

    public static void ciftElemeanlariYazdirStructured(List<Integer>ciftlist) {

for(Integer w : ciftlist){
    if (w%2==0) {

        System.out.print(w+" ");
    }

}


    }

   // çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
      // bir method oluşturun.(Functional)


    public static void ciftElemeanlariYazdirFunctional(List<Integer>ciftlistFunctional){

        ciftlistFunctional.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

}
//3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak
// yazdıran bir method oluşturun.(Functional)
public static void tekElemanlarinkareleriniYazdir(List<Integer>tekElemanlarinkareleriList){
tekElemanlarinkareleriList.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));


}
//4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.


    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer>Kuplist){
     Kuplist.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print (t +" "));



    }

//5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan
// bir method oluşturun.
public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>KareToplamList){
    Integer toplam=KareToplamList.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
    System.out.print(toplam);

    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftelemKupCarpim(List <Integer>KupCarpimList){

     Integer carpim=   KupCarpimList.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.print(carpim);

    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
public  static void getMaxeleman(List<Integer>Maxlist){


    Integer Max=Maxlist.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u );


    System.out.println(Max);

   // public static void getMaxEleman02(List<Integer> Maxlist2){

     //   Integer max2 =Maxlist2.str


    }

//Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void getYedidenBuyukCiftMin(List<Integer> listCift7){
       Integer min7= listCift7.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println(min7);

    }
          //2.yol
          public static void getYedidenBuyukCiftMin2(List<Integer> listCift7_2){

        Integer min_2=listCift7_2.stream().distinct().filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
              System.out.println(min_2);




          }
            //3. Yol
    public static void getYedidenBuyukCiftMin3(List<Integer> listCift7_3){

       Integer min3= listCift7_3.stream().filter(t->t%2==0).
               filter(t->t>7).sorted().findFirst().get();

        System.out.println(min3);


    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların
// yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

public static void getTersSiralamaTekrarsizElemanlarinYarisi( List<Integer>listYari){

        List <Double> sonuc=listYari.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

             System.out.println(sonuc);
    }





}










