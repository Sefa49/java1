package day06_;

public class C02_Concatenation_2 {
    public static void main(String[] args) {
String str1 ="Java ";
String str2="Guzeldir";
int sayi1 =5;
int sayi2 =4;



          //yukaridaki leri kullanara istenen metinlreri yaziniz.

     //   System.out.println(str1+" "+str2+" "+sayi1+sayi2"); //Java Guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2) );   //Java Guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);  //9 java
        System.out.println(""+sayi1+sayi2+" "+str2);  //54 Guzeldir

      //  System.out.println(str1.concat(str2));
    //    System.out.println(str1.concat(" ").concat(str2));


        System.out.println(str1.concat(str2));                //javaGuzeldir
        System.out.println(str1.concat("").concat(str2)); //Java Guzeldir

    }




}
