package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        int sayilar[]=new int[3];


        sayilar[2]=10;
        sayilar[1]=3;
        sayilar[0]=5;



        System.out.println(sayilar);// I@7699a589 <----ref no
                                    // non primitive daata turundeki datalari her zaman
                                      //direk yazdiramayabiliriz
        System.out.println(Arrays.toString(sayilar));  //[0, 0, 0]



            String siniflist[]={"Ali","Ayse","Ahmet"};

            siniflist[1]="Hasan";  //Mesala aysenin yerine hasan yaptik oldu  :)

           System.out.println(Arrays.toString(siniflist));
        System.out.println(siniflist[2]);
        System.out.println(siniflist[0]);
    }
}
