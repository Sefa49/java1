package dayTraining;

public class C02_MantiksalOperatorler {
    public static void main(String[] args) {

        System.out.println( "Sonuc"+ ((3>4 ) || ("team11"=="team11")));
        System.out.println( "Sonuc"+ ((3>4 ) && ("team11"=="team11")));
        System.out.println( "Sonuc"+  !("team11"=="team111"));

    }
    /*Mantisal Operatorler
1_!(not)   degil    kullanimi: !(3>4)--->true  !(Sefa==Vefa)
2_&&    & (And)---->Verilen iki degiskeninde dogru  olmasi gerekir ki true versin.
yoksa herhangi birinin yanlis olmasindan dolayi sonucumuz false olur.

(3>5)  && ("team11"=="team11")---->false

3_|| (Or) veya --->verilen degiskenlerin herhangi birisinin dogru olmasi halinde sonucumuzu true verir.
yalnizca iki degiskenimizin de yanlis olmasi halinde sonucumuz false olur.



    */


}
