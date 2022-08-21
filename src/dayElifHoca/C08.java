package dayElifHoca;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        //Scannerkullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz
        //yukaridaki ornekte verilen ilk ve ikinci degiskenleronin ilk harflerini atip birlestiriniz


                  Scanner scan=new  Scanner(System.in);
                  System.out.println("string1 :");
                  String str1= scan.nextLine();

        System.out.println("string2 :");
        String str2= scan.nextLine();

        System.out.println("1.yontem :" + str1+ "" + str2);
        System.out.println("2.yontem:" +str1.concat(""+ str2));

        String str1_0indextenSonrasi=str1.substring(1);
        String str2_0indextenSonrasi=str2.substring(1);

        System.out.println("manipulationdan sonraki hali:"+ str1_0indextenSonrasi+""+str2_0indextenSonrasi);

    }
}
