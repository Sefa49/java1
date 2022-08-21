package day32_StringBuilder;

public class C02_Append {


    public static void main(String[] args) {




        StringBuilder sb= new StringBuilder ("Java daha ne yapsin");

        sb.append("?");
        System.out.println(sb);


//append istedigimiz Stringi en sona ekler  //java daha ne yapsin? yapar

sb.insert(4,"her seyi dusunmus daha,");

        System.out.println(sb);

        sb.insert(22,"Valla valla ",5,11);
        System.out.println(sb);

    }


}
