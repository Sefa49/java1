
package day11_stringManipulation;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        /*
        Verilen bir String'de herhangi bir String veya char'ın ilk kullanıldıgı index'i bize dondurur

         */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));;//7
        System.out.println(str.indexOf("j"));//-1 olmadıgı icin - 1 dondurur
        System.out.println(str.indexOf("mek"));// 10  kelimenin ilk harfini baz olarak onun indexini verir

        //eger istedigimiz index'ten sonrasini kontrol etmek istersek
        //O zaman ayni methodu iki parametreli olarak kullanabiliriz.

        System.out.println(str.indexOf("g",(6+1)));//18    not: 7.indexten itibaren "g" nin indexine bakacagını döndürür
        //yukaridaki str'da 2.ve 3. e'nin indexlerini bulun        // "g" yi bulmamasi icin ilk buuldugu
                                                                   // (cunku ilk sordugumuzda g zaten 6 nci index te vardi ayni

                                                                    // dgeri bir artirip oradan itibaren aramasini sagladik)
        // 2.ci e'yi bulabilmek icin 1.e nin index'ine ihtiyacim var

        int firste=str.indexOf("e");
        int seconde=str.indexOf("e",firste+1);

        //eger 2. e varsa 3. enin olup olmadigini ve indexini yazdiralim
        if (seconde==-1){
            System.out.println("verilen str'da 2.e yok");
        }else {
            int thirde=str.indexOf("e",seconde+10);
            if(thirde==-1){
                System.out.println("verilen str'da 3.e yok");
            }else {
                System.out.println("verilen str da 3. enin indexi: "+ thirde);
            }
        }
    }
}