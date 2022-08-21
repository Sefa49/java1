package day21_Arrays;

import java.util.Arrays;

public class C09_BianarySearch {
    public static void main(String[] args) {

        /*binarySearch methodu siralanmis array de aradiginiz elementin  eger dizi de varasaindexinin dondurur
        Aradigimiz element yoksada -1 dondurur
       java binaryseach metoduyla
       Aradigimizin elementin olsaydi nerede olacagini da dondurur

       ama bunu index olarak degil siralama(dizideki sirasi ) olarak verir
        */

                //VARSA INDEX YOKSA    - SIRALAMAYI  VERIR

       int []sayilar ={3,7,15,4,27,10};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); //3,7,15,4,27,10
        System.out.println(Arrays.binarySearch(sayilar,4));//1

        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//3
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1

    }
}
