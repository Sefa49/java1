package day10_StringManipulation;

public class C07_IndexOf {


    public static void main(String[] args) {
        String str ="Java ogrenmek cok guzel";

        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//-1 cunku yok....


        // 0 dersek j nin index i dir.
        //- bir deger donerse biz aranan string in str da olmadigini anlariz.
        //JAVA -1 DONDURMEYI TERCIH ETMISTIR. olmayan element -1 ciktisi  aliriz javadan

        String str5 ="wertyuio;lsdfgpoiuytrwsghjkl";

                          //str5 te p harfi varmidir?"
             if (str5.indexOf("p")==-1)  {

            System.out.println("str5 de istenen karakter kullanilmamis");

    }  else {
            System.out.println("str5 de istenen karakter kullanilmis");

}}}
