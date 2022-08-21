package dayElifHoca;

import java.util.Locale;
import java.util.Scanner;
              //kullanicidan ismini ve soyismini girmesini isteyin sonrasinda
            // konsala tam ismini buyukharflerle yazdirin

public class C07_ {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi yaziniz :");
         String firstName= scan.nextLine(), lastname= scan.nextLine();

         String fullName=firstName.concat("" + lastname).toLowerCase();
        System.out.println(" fullName = "  + fullName);
    }
}
