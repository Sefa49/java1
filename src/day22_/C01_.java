package day22_;

import java.util.Arrays;

public class C01_ {
    public static void main(String[] args) {

//tek katli Arraylarde Array i direk yazdiramiyoruz cunku
//Array non primitive data turu dur. her non primitiv data turu direk yazdiralamaz


        //Ancak Arrayin icerisindeki elementleri direk yazdirabiliyorduk
        // cunku genelde primitive data turu veya string elementler kullaniliyordu.
        //MUlti dimensional arraylarde en dikkat edecegimiz konu ulasmak
        //istedigimiz elementin bir array mi yoksa primitive datami oldugudur

int [][]sayilar={{1,2,4,5},{3,4}};
        System.out.println(sayilar[0]);// bu sekilde bize referans gosterir


        System.out.println(Arrays.toString(sayilar[0]));//bu sekilde autorun 1. elementin kendini yazdirir
        System.out.println(sayilar[0][1]);//--->2  innerin 1.inci index ini yazdirir.
        System.out.println(sayilar[1][0]);//--->3
        System.out.println(Arrays.toString(sayilar));//--->ref no  ,ref no
        System.out.println(Arrays.deepToString(sayilar));//--->hepsini yazdirir

        /*
Array'i iki sekilde declare edebiliyorduk
1- Elemanlari direkt yazabiliriz
int [] [] sayilar = {{1, 2, 4, 5}, {3, 4}}

2- Outer ve inner array'lerin uzunluklarini belirtere olusturabiliriz
int [][] sayilar = new int [3][4];

Ancak ikinci yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
Bu ornek icin outer array'in 3 tane inner array'i vardir
Her bir inner array'in ise 4'er elemani vardir.

Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
mecburen 1.yontemi kullanmalisiniz
 */
    }
}
