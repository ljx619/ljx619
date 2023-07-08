package HashDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> hashMaps = new ArrayList<>();
        HashMap<String, String> stringStringHashMap1 = new HashMap<>();
        HashMap<String, String> stringStringHashMap2 = new HashMap<>();
        HashMap<String, String> stringStringHashMap3 = new HashMap<>();
        stringStringHashMap1.put("李佳佳","21");
        stringStringHashMap2.put("李佳","22");
        stringStringHashMap3.put("李","23");
        hashMaps.add(stringStringHashMap1);
        hashMaps.add(stringStringHashMap2);
        hashMaps.add(stringStringHashMap3);

        for(HashMap<String,String> hs: hashMaps){
            Set<String> strings = hs.keySet();
            for(String st : strings){
                String s = hs.get(st);
                System.out.println(st+","+s);
            }
        }
    }
}
