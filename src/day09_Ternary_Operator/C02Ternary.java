package day09_Ternary_Operator;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin sayi pozitifse "sayi pozitif yazdirin
        //negatifse sayinin karresini yazdirin.
       Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen bir say giriniz");
        double sayi=scan.nextDouble();


        System.out.println(sayi>0?"sayi pozitif":(sayi*sayi));


    }
}
