package day09_Ternary_Operator;

import java.util.Scanner;

public class C01_Ternary_Operator {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
         double sayi =scan.nextDouble();
        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.


        System.out.println(sayi>=0?sayi:(-1*sayi));

    }




}
