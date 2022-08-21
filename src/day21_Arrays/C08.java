package day21_Arrays;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {
        /*
Binary search javada eleman aramanin kisa yoludur
ancak binary search'un calismasi icin once
array'in sirali hale getirilmesi gerekir.
eger sirali hale getirmezseniz binary Search yaparsaniz
sonucu bulamayabilir veya yanlis bulabilir
 */


        String[] harfler={ "Y","B","D","G","O"};
        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


        //binarySearch bize aradigimiz elemanin indexini dondurur
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort methodunu uygulamaliyiz sonra binarysearch
        Arrays.sort(harfler);
        System.out.println(Arrays.toString((harfler)));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }





}
