package demo;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayString = new ArrayList<>();
        System.out.println(arrayString);
        arrayString.add("abcde");
        arrayString.add("abcde");
        arrayString.add("abcde");
        System.out.println(arrayString);
        arrayString.add(1, "eee");
        System.out.println(arrayString);

        for (int x = 0; x < arrayString.size(); x++) {
            String s = arrayString.get(x);
            System.out.println(s);
        }
    }
}
