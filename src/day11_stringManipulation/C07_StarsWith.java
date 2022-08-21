package day11_stringManipulation;

public class C07_StarsWith {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith("Java"));
        System.out.println(input.startsWith("gun", 5));
    }
}