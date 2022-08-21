package day10_StringManipulation;

public class C01_charAt {

    public static void main(String[] args) {


        String str ="java ogrenmek ne guzel" ;

        System.out.println(str.charAt(0));  // ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7));

          System.out.println(str.charAt(21));

            //System.out.println(str.charAt(22));
            //java bu ustteki kodda hata  veriyor cunku java ogrenmek ne guzel 21 karakter
            //dolayisiyla biz string i mizin uzunlugunu gectik.

    }         //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
              // String methodlarından kullanmamiz gereken bir method varsa 
              // charAt() 'den önce kullanmaliyiz
             // son harfi bulmak icin st'in uzunlugunun 1 eksigini index olarak gireriz
}           // eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir
