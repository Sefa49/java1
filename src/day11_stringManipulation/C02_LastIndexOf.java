
package day11_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // ve asagidaki uc durumdan uygun olani yazdirin
        // 1- cumle java icermiyor
        // 2- cumle 1 tane java iceriyor
        // 3- cumlede birden fazla java var

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime bir kere kullanilmis");

        }else {
            System.out.println("verilen kelime birden fazla kullanilmis");
        }
    }
}