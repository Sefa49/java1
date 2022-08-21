package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
 int toplam =0;
        int sayilar[]={1,2,3,4,5,6,7,};
        //arrayini tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar));//   [1, 2, 3, 4, 5, 6, 7 ]

               //Arrayin tum elementlerini yazdiralim

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i]+" ");
            toplam+=sayilar[i];

        }
        System.out.println(" toplam= " +toplam);
    }
}
