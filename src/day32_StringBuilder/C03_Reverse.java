package day32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {

        //Verilen bir inputu tersine cevirip donduren  bir methodu  olusturun

        String input = "Hey gidi for loop gunleri";

        String tersInput = tersineCevir(input);

        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();
    }
}
