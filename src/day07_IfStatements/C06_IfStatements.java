package day07_IfStatements;
  import java.util.Scanner;
public class C06_IfStatements {

    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girinz");
        char harf = scan.next().charAt(0);;

        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf dir");
        }

        else {
            System.out.println("Girilen karakter bir harf degildir");
        }
        } }