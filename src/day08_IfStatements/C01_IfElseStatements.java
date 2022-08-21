package day08_IfStatements;
import java.util.Scanner;
public class C01_IfElseStatements {

    public static void main(String[] args) {




        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.nextLine().toLowerCase();




        if (gun.equals("pazartessi")) {
            System.out.println("Paztesi");}

  else if(gun.equals("sali")) {
            System.out.println("Sal");

        }

/*
else if (gun.equals("carsamba");   {System.out.println("Car");}
else if (gun.equals("persembe") ;  {System.out.println("Per");}
else if (gun.equals("cuma")  ; {System.out.println("Cum");}

  else if (gun.equals("cumartesi") ; {System.out.println("Cumartesi");}

        else {System.out.println("Pazar")};   */

    }


}



