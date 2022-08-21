package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen Stringdeki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz


        String input="Java her zaman guzel ";

        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {
        String bezersizInput="";


        String islenecekKelime=input.replaceAll("\\W" , ""); // Javaherzamanguzel

        System.out.print(islenecekKelime.substring(0,1)); // J

        bezersizInput+=islenecekKelime.substring(0,1); // J

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (! bezersizInput.contains(islenecekKelime.substring(i,i+1))){

                System.out.print(" ," + islenecekKelime.substring(i,i+1));
                bezersizInput+=islenecekKelime.substring(i,i+1);

            }

        }

        System.out.println(" ");
        System.out.println("input :" + input);
        System.out.println("benzersiz input :" + bezersizInput);

    }


}