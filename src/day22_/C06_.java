package day22_;

import java.util.ArrayList;
import java.util.List;



public class C06_ {
    public static void main(String[] args) {

/* arrayi array yapan sembol [] dir
arraylist de ise <> diamond (elmas) kullaniriz
*/
        List<String> isimler =new ArrayList<>();
        System.out.println("isimler = " + isimler); //  []
//bir liste elemaa eklemek issterek

        isimler.add("basak");
        System.out.println(isimler.add("Ayse"));


        System.out.println(isimler);
// list deki ozellikte add le ekleme ozelligi var ve en altta
// listeyi yazdirirken ekli olarak cikti




    }
}
