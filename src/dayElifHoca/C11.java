package dayElifHoca;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("cumle olusturmak icin anlamli 1. kelimeyi yaziniz");

        String str1=scan.next();

        System.out.println("cumle olusturmak icin anlamli 2. kelimeyi yaziniz");

        String str2=scan.next();

        System.out.println("cumle olusturmak icin anlamli 3. kelimeyi yaziniz");

        String str3=scan.next();

        System.out.println("cumle olusturmak icin anlamli 4. kelimeyi yaziniz");

        String str4=scan.next();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) + ""
        + str2+ "" + str3 + "" + str4 +".");


    }
}
