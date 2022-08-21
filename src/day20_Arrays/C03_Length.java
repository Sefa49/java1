package day20_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        // iki sekilde array ousturulur
        int sayilar[]={1,2,3};
        String harfler[]=new String[4];

        System.out.println("sayilar arrayinin uzunlugu:"+ sayilar.length); //3
        //Stringlength () methodunda parantez var Array da yok
        System.out.println("harfler Arrayi'nin uzunlugu:"+harfler.length); //4
        System.out.println(Arrays.toString(harfler));//null null null null

        //harfler arrayinin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); //ArrayIndexOutOfBoundsException  yani 5.index diye bir sey yok

    }
}
