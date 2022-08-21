package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //Baslangic noktasindan bitis sartina varmiyorsak sonsuz loop olusur(teknik olarak)
        //

/*
        for (int i = 0; i >-10 ; i++) {
            System.out.println(i);
*/

        for (int i = 0; i>5  ; i++) {
            System.out.println(i);
            //i ye 0 degerinin verirsek   i(0)>5 olamayacagi icin forloop kirilir ve
            // alt suslu paranteze gecer ve (for body si calismaz)
        }



    }


}
