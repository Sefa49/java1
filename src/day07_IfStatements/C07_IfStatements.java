package day07_IfStatements;

import java.util.Scanner;


public class C07_IfStatements {
    public static void main(String[] args) {
        //kullaniciya yasini sorun eger yas 65 den kucukse emekli olamazsin calismalisin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 65) {
            System.out.println("emekli olamazsin ," + (65 - yas) + " yil daha  calismalisin");

        } else {
            System.out.println("Emekli olabilirsin");
        }
    } }