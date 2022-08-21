package Lambda_functional_programming02;

import java.util.stream.IntStream;

public class Fp04 {


    public static void main(String[] args) {

        System.out.println(get7den100etoplam());
        System.out.println(get7den100etoplam2());
        System.out.println(get2den11ecarpim());
        System.out.println(faktoriyelhesapla(0));






    }
    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static int get7den100etoplam() {

        return IntStream.range(7, 101).reduce(0, Math::addExact);


    }//2. yol


    public static int get7den100etoplam2() {


        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();


    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2den11ecarpim(){

    return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();

    }
//3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun.
// (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelhesapla(int x){
if (x>0&&x<15){
    return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();


}
        System.out.println("O dan buyuk deger giriniz");
           return 0;

    }
//4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

   // public static int VerilenikiSayiArasindakiCiftlarinToplamini(int x, int y) {
     //   int z = 0;
       // if (x > y)
         //   z = x;
        //x = y;
        ///y = z;

    }







