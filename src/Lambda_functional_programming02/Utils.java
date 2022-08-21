package Lambda_functional_programming02;

public class Utils {


    public static void AyniSatirdaBoslukLuYazdir(Object obj){

        System.out.print(obj+ " ");

    }

    public static boolean CiftElemaniSec(int x ){
        return x %2==0;


    }

    public static boolean tekElemaniSec(int y){
        return y %2!=0;

    }

public static int karesinial(int  z){

        return z*z;


}
public static int kupunual (int a){
        return a*a*a;

}

public static double yarisinal(int a ){


        return a/2.0;
}


public static char sonKaarakterAl(String str){
        return str.charAt(str.length()-1);


}

public static char ilkKarakteriAl(String str){


        return  str.charAt(0);

}

    public static int rakamlarToplaminiAl(int x){

        int toplam = 0;

        while(x>0){
            toplam += x%10;
            x /= 10;

        }
        return toplam;
    }



}
