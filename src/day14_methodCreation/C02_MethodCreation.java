package day14_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Verilen 3 basamakli bir sayinin rakamlari toplamini yapan method

        int input =789;

        rakamlariTopla(input);
        C01_MethodCreation.terstenYazdir("sefa");

    }

    private static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp= input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("Girdiginiz " + temp+" sayisinin rakamlar toplami:"+rakamlarToplami);  ;



    }


}
