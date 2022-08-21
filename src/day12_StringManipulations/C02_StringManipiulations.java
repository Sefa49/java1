package day12_StringManipulations;

public class C02_StringManipiulations {

    public static void main(String[] args) {
        //str i bugun jsvs cok guzel haline getirin
        //replaceall ( deki all un amaci ayni ozellikteki tum  karakterleri kapsamaktadir.
        //butun sayilari sil
        //butun ozel karakterleri sil
        //space leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        //"qazwsx"


String str="1Bu2gun3java4cok5guzel";




str=str.replaceAll("\\w","");//rakam ve sayilari ortadan kaldiriyor
        System.out.println(str);//1Bu2gun 3nJavacokguzel

    }







}
