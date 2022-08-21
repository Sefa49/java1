package dayTraining;

import java.util.Scanner;

public class C01_Conditional {
    public static void main(String[] args) {

/* Karsilastirma Operatorleri

1_   a == b esit mi degil mi(true degilse False)
2-   a !=b esit degil mi(true eger esitse False)
3_   a>b  a b den buyuk mu ( true eger buyuk degilse False)
4_  a<b  a b den kucuk mu (true degilse False)
5    a <= b a b ye esit mi veya kucuk mu (true degilse False)
6_  a>= b  a b ye esit mi veya buyuk mu (true degilse False )
             int not1=4;
                int not2 =5;
        System.out.println("Sonuc "+ (not1>not2));
 //  if ( kosul){
//   Burada kosul saglaniyor mu saglanmiyor mu bu kontrol ediliyor

*/
        Scanner scan = new Scanner (System.in);

        System.out.println("Notunuzu giriniz");

        int  note =scan.nextInt();
        if (note>=90){
            System.out.println("Dersten gectiniz +  ders notunuz AA ");
    }
        else if (note>75) {
            System.out.println("Dersten gectiniz + ders notunuzz BB");

        }

        else {
            System.out.println("dersten kaldiniz");

        }
}}
