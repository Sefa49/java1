package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        //EGER BIR KLASIN ICERISINDE herhangi bir hessaplama yapip bunuda kalici olarak saklamak istersek
        //kodumuzu sade ve anlasilir tutmak icin islemi bir main methoda dondurebiliriz
        //Return type i void olmayan bir methodun sonucunu main method da bir variable a atama yaparsak
        //programin geri kalaninda bu yeni degeri kullanma sansimiz olur.

        //Kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun.
        //sehir ismini programimizda buyuk harf olarak,
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz


        String sehir =sehirAl();

        String tarih = tarihAl();

        System.out.println("Girdiginiz sehir :"+ sehir);
        System.out.println("Girdiginiz tarih :"+ tarih);

    }

    public  static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();

        if (yil > 1900 && yil < 2100) {
            tarih = yil + "=";

        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak yazmalisiniz");
            int ay = scan.nextInt();

            if (ay < 0 || ay > 12) {

                System.out.println("Ay no 1-12 arasinda olmalidir");
            } else if (ay < 10) {
                tarih = tarih + "0" + ay + "-";

            } else {
                tarih = tarih + ay + "-";
            }
            System.out.println("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");

            int gun = scan.nextInt();
            if (gun <= 0 || gun > 31) {

                System.out.println("Gun no olarak 1-31 aarasinda sayi girilmelidir");
            } else if (gun < 10) {
                tarih = tarih + "0" + gun;

            } else {
                tarih = tarih + gun;


            }
            return tarih;

        }

        public static String sehirAl () {
            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen sehir adi giriniz");
            String sehirAdi = scan.next().toUpperCase();

            return sehirAdi;
        }
    }



