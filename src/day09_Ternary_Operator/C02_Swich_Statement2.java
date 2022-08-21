package day09_Ternary_Operator;


import java.util.Scanner;

public class C02_Swich_Statement2 {

    public static void main(String[] args) {
        int bakiye=1000;

       Scanner scan =new Scanner(System.in);


        System.out.println("1: Bakiye goruntule");
        System.out.println("2:Para Yatirma ");
        System.out.println("3: ParaCekme");
        System.out.println("4:Sistemden Cikis");

       int islem=scan.nextInt();

       switch ( islem)  {

            case 1:
            System.out.println("Bakiyeniz:" + bakiye+ "tl dir");
             break;
                  case 2:

          System.out.println("Ne kadar yatiracaksiniz?");
            int miktar=scan.nextInt();
            bakiye+= miktar;

          System.out.println( "Bakiyeniz :"+ bakiye+ "tl dir");
               break;

            case 3 :
                System.out.println("Ne kadar para cekeceksiniz");
                miktar=scan.nextInt();
                bakiye-=miktar;

              if (miktar<=bakiye){
             System.out.println("Bakiyeniz:"+bakiye+ "tl dir");
}
                else   {
                    System.out.println("En fazla 1000 tl cekebilirisiniz");
                }

                // 1000 yerine bakiyede yazilabilir
                // else kismi yazilmayada bilir
                break;
            case 4 :
                System.out.println("Sistemden Cikiliyor");
             break;
                default :
                    System.out.println("Gecersiz islem");
                      break;
        }


    }
}
