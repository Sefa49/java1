package day13_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

     terstenYazdir("kupeli");
    }

public static void terstenYazdir(String input){
        String tersInput =input.substring(5)+input.substring(4,5)+
            input.substring(3,4)+input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
    System.out.println("Verilen kelimenin tersten yazilisi:" + tersInput);

}


}
