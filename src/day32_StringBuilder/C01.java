package day32_StringBuilder;

public class C01 {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sbl2 =new StringBuilder("Java Candir");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        System.out.println(sbl2.length());//14
        System.out.println(sbl2.capacity());//30
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//10

        sb1.append("java");
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//16

        sb1.append(" Candir");
        System.out.println(sb1.length());//11
        System.out.println(sb1.capacity());//16

        sb1.append("Bilen bilir");
        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity());//34(16*2+2)



    }


}
