package day12_StringManipulations;

public class C01_Replace {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok gu zel ";
        System.out.println(str.replace(" ", ""));//Bugunhavacokguzel

        /// hava kelimesini java yapalim

        System.out.println(str.replace("h","j").replace(" ", ""));
        //Bugunjavacokguzel


        //guzel yerine harika yazdirlim

        System.out.println(str.replace("gu zel","harika"));//Bu gun ha va cok harika
        //cumleyi replace kullanak bugun Java cok guzel yapilim

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("gu zel", "guzel");
        System.out.println(str); //Bugun Java cok guzel




    }

}