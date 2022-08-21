package dayElifHoca;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir isci isi kac gunde bitirir");
        int birIsciBitirmeSuresi=scan.nextInt();

        System.out.println("toplam kac isci calisacak");
        double _isci_sayisi =scan.nextDouble();

        double CokluBitirmeSuresi=birIsciBitirmeSuresi/_isci_sayisi;
        System.out.println("coklu bitirme suresi="+ CokluBitirmeSuresi);
    }




}
