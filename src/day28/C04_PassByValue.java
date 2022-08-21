package day28;

public class C04_PassByValue {
    public static void main(String[] args) {
        /*
        Verilen bir fiyat icin %10 indirim yapan bir method olusturun
        Method'da indirim uygulayan fiyati yazdirin
        Method Call sonrasi orjinal fiyati yazdiran ve
        method'da yapilan degisikligin orjinal degeri
        degistirip degistirmedigini kontrol edin.
         */
        double satisFiyat=100;
        double indirimOrani=10;
        double indirimliFiyat= indirimiYap(satisFiyat, indirimOrani);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("satisFiyat = " + satisFiyat);
    }
    private static double indirimiYap(double satisFiyat, double indirimOrani) {
        double indirimliFiyat=satisFiyat*0.90;
        return indirimliFiyat;
    }
}
