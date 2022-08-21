package day32_StringBuilder;

public class C04 {
    public static void main(String[] args) {


        StringBuilder sb= new StringBuilder("Kayra");

        sb.substring(0,3);
                          //Bu method String dondurdugu icin Stringbuilder in eski halini degistirmez
        System.out.println(sb);//Kayra

        sb.subSequence(0,3);
        System.out.println(sb);//Kayra
    }
}
