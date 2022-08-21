
package day17_nestedForLoop;
public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */
        String input="Deniz";
        for (int i = 1; i <=input.length() ; i++) //satir oluyor <---burasi
                {
            for (int j = 1; j <=i ; j++)//sutun oluyor <---burasi
            {
                System.out.print(input.substring(j-1,j));  // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");
        }
    }
}
















