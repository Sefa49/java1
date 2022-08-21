package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Rakamlar_Toplami {

    public static void main(String[] args) {
         //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli positif bir tamsayi giriniz");
        int sayi=scan.nextInt();  //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;


                                    //Su anda sayi5267 bb=0 ve rt=0

        birlerBasamagi=sayi%10;   //7 rakamlarToplami+=birlerBasamagi;
         rakamlarToplami += birlerBasamagi;                              //sayi /=10;
                 sayi/=10;                        //rakamlarToplami+=birlerBasamagi;

                                         //su anda sayi 526     bb7    rt 7

                birlerBasamagi=sayi%10;  // bb 6
                rakamlarToplami+=birlerBasamagi;   // rt=7+6
               sayi/=10;
                                      //su anda sayi   52 bb 6 rt 13
                birlerBasamagi=sayi%10; //bb   2
                rakamlarToplami+=birlerBasamagi;  //  rt = 13+2+15

                sayi/=10;
                                 //su anda  sayi=5   bb  2 rt  15


                  birlerBasamagi=sayi%10;    //5
                  rakamlarToplami+=birlerBasamagi;  //15+5=20

    sayi/=10;  //su anda sayi 0 ve bb 5 rt 20

        System.out.println("sayinin rakamlar toplami : "  + rakamlarToplami );





    }
}
