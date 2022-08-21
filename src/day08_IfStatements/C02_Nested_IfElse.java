package day08_IfStatements;


import java.util.Scanner;

public class C02_Nested_IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " + "\n Kadin icin K erkek icin E yaziniz "  );/* emeklilik kontrolu yapan bir program yaziniz
       cinsiyet E(erkek) K(kadin) degiskenlerini kabul etsin
       farkli bir harf veya sembol girilirse hata mesaji versin
         emeklilik icin kadinlara yas siniri 60
          erkeklerde 65 olsun. negatif yas veya 80 den buyuk yas girilince hata yazisi versin
                   */
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");

            }


        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        }
    }   }