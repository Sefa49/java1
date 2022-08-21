package day13_MethodCreation;

public class C04_MethodCreation {


    public static void main(String[] args) {

      //  String str = "Java her gecen gun guzellesiyor ";

        // System.out.println (str.substring(0,4) ) ; // java
     //input olarak verilen iki int eri toplayip sonucunu yazdiran metod olusturun.
     int input1=200;
     int input2 =120;


     // Metod 4 adim da olusturulur
        // 1= metod call
     //2 argument eklenmesi gerekiyorsa ekle
     //eger metodun return type void  den farkli olacaksa bir variable olusturup method call u assign et.
        //
    topla(input1,input2);

    }

        public static void topla(int input1, int input2) {
        //3.Adim da method deklarasyonunda degistirilmesi gereken bolumleri degistir (acces,modifier,return type vs)
        //4 eger return type void disinda birsey se return key word u ve donecek deggeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami" + (input1+input2) );

    }
}
