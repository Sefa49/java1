package day09_Ternary_Operator;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin kucuk harf ise consola "kucukharf ,
        //buyuk harf ise "buyukharf"
        //yoksa "girdiginiz karakter harf degil"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter =scan.next().charAt(0);

        String sonuc =(karakter>='a'&& karakter<='z')?("Kucuk Harf"):
        ((karakter>='A'&& karakter<='Z')?"Buyuk Harf " : "gecersiz karakter");

        System.out.println("sonuc");

    }
}
