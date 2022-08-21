package dayTraining;

import java.util.Scanner;

public class C03_Example {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Kullanici adi:");

        String kullaniciAdi =scan.nextLine();

        String kulAdi="team11";
        String Sifre="12345";


        System.out.println("sifre:");
        String kulparol=scan.nextLine();

        if (!( kulAdi.equals(kullaniciAdi) )&&  !(Sifre.equals(kulparol) )) {

            System.out.println("Kulanici adi ve Sifre yanlis");


        } else if ( !(kulAdi.equals(kullaniciAdi)) && (Sifre.equals(kulparol))) {
            System.out.println("Kullanici adi yanlis");
        }
        else if ((kullaniciAdi.equals(kullaniciAdi)) && !(Sifre.equals(kulparol))){
            System.out.println("Kullanici Sifre yanlis");


}      else{
            System.out.println("Kullanici Adi ve Sifre dogru");
        } }
}