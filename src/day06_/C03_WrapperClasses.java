package day06_;

import java.util.Scanner;

public class C03_WrapperClasses {

    public static void main(String[] args) {
        /*Wrapper class javanin haazir bir methodu kullanabilmemiz icn primitive
         data turlerininher biri icin actigi calass tir.
         */

            /*
            int--->Integer
            char---->Character
             digerleri primitive data turu ile ayni sadece bas harfi buyuk


             */

String str="Jva ile hayat ne guzeldir";
        System.out.println(str.toUpperCase());//JAVA ILE HAYAT NE GUZELDIR
boolean GuzelMi=true;
//guzelMi.boolean primitive oldugundan hazir method bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MAX_VALUE);//-32768
        System.out.println(Short.MIN_VALUE);//32767

        String ogrNo="12345";  //Kullanicidan bir sifre isteyin sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine(); //bu ekran goruntusu

        int sifreSayi=Integer.parseInt(sifre);//bu bize sayiya cevirip bize tamsayi olarak gosteriyor
                                              //Yani String bir ifadeyi wrapperclass sayesinde integer a cevirdik
        System.out.println("girilen sifrenin 3 fazlasi:"+ (sifre+3));
        System.out.println("girilen sifrenin 3 fazlasi:"+(sifreSayi+3));






    }
}