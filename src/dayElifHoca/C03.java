package dayElifHoca;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo =scan.nextInt();

        if (yas>0 && yas <18) {
            System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
        }else if (yas>=18){
        if (kilo>0 && kilo<50) {
            System.out.println("kilosu 50 den az olanlar kan bagisi yapamaz");
        } else if (kilo>=50){
            System.out.println("kan bagisi yapabilirsiniz");

    }



}}}
