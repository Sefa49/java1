package day11_stringManipulation;

public class C04_Contains {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir cumle isteyin. Cumle "buyuk" kelimesi iceriyorsa
        tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor" yazdirin.
         */

        String  cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();

        // requirements'de buyuk harf kucuk hassasiyeti hakkinda birsey soylenmemis
        //ikinci olarak da her iki kelomeyi de icerme durumu aciklanmamis
        //bu durum gorevi verene sormak lazim

        //ek requirements :ikisini de iceriyorsa "karar ver buyuk u yazdiryim kucuk mu
        //case sensitiv olmasin
  if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
      System.out.println("karar ver buyuk u yazdiryim kucuk mu");
  }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}