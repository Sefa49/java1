package day18_while_dowhile;

public class C02_WhileLoop {


    public static void main(String[] args) {
//Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

int input=543;

int rakamlarToplami=0;
int birlerBasamagi=0;
int temp=input;




        while (temp > 0) {

            birlerBasamagi =temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;// burda iki den kurtulmak icin 10 a boldukki 543,2 olsun
                       // sonuc int oldugundan int 543 olur ve sondaki ikden kurtuluruz her basamak ta bu boyle devam eder
        }

        System.out.println(input +"sayisinin rakamlar toplami:" + rakamlarToplami);

    }
}
