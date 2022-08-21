package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verileen bir positif tam sayinin
        //tam bolenlerine yazdiralim?
        int input =20;

        for (int i = 1; i <= input; i++) {


            if (input%i==0){

                System.out.println(i+"");
            }
        }

    }


}
