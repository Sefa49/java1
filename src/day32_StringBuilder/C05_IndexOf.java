package day32_StringBuilder;

public class C05_IndexOf {
    public static void main(String[] args) {

StringBuilder sb = new StringBuilder("Pay Attention Please");

        System.out.println(sb.indexOf("Pay"));//0
        System.out.println(sb);//Pay Attention Please
        System.out.println(sb.indexOf("e"));//7
        System.out.println(sb.indexOf("e",10));//16
        System.out.println(sb.lastIndexOf("e"));//19

        System.out.println(sb.lastIndexOf("e",10));//7
//10 dan  basa dogru arama ya basliyor  buldugu an da bastan sayip index i ni veriyor


    }
}
