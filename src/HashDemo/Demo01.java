package HashDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> sAH = new HashMap<>();
        ArrayList<String> st1 = new ArrayList<>();
        st1.add("李佳佳");
        st1.add("李佳");
        sAH.put("001",st1);
        ArrayList<String> st2 = new ArrayList<>();
        st2.add("李天宇");
        st2.add("李天");
        sAH.put("002",st2);
        ArrayList<String> st3 = new ArrayList<>();
        st3.add("李瑞强");
        st3.add("李瑞");
        sAH.put("003",st3);

        Set<String> strings = sAH.keySet();
        for(String st: strings){
            System.out.println(st);
            ArrayList<String> strings1 = sAH.get(st);
            for(String sA : strings1){
                System.out.println(sA);
            }
        }
    }
}
