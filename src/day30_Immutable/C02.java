package day30_Immutable;


import java.time.LocalDate;


public class C02 {

    public static  void main(String[] args) {
        LocalDate tarih= LocalDate.now();

        System.out.println(tarih);//2022-07-23
        System.out.println(tarih.getDayOfYear());//yilin 204 .gunu olarak bize bugunun yilin kacinci gun u old soyluyor
        System.out.println(tarih.getDayOfWeek());//Saturday
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear());//false

        LocalDate tarih2 = LocalDate.of(2001,8,15);//
        System.out.println("tarih2 = " + tarih2);
        System.out.println(tarih.plusDays(100));//100 gun sonra tarih 2022-10-31
        System.out.println(tarih.minusWeeks(15));



    }

}
