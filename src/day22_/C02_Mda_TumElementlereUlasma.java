package day22_;

public class C02_Mda_TumElementlereUlasma {
    public static void main(String[] args) {
        // Verilen bir multi dimensional arrayin 
        // tum elementlerini yazdiran bir method olusturun
        
        int [][] sayilar = {{1,5,6,9},{2,5,},{3,1,6}};
        elementleriYazdir(sayilar);
        
        
    }

    private static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {  //i =0,1,2, degerlerini alacak
            for (int j = 0; j <sayilar[i].length ; j++) {

                System.out.print(sayilar[i][j] + " " );
            }


        }
        
        
        
    }
}
