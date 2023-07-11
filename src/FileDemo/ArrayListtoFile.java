package FileDemo;

import java.io.*;
import java.util.ArrayList;

public class ArrayListtoFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> sts = new ArrayList<>();

        sts.add("abcd");
        sts.add("efg");
        sts.add("hijklmn");

        BufferedWriter bos = new BufferedWriter(new FileWriter("fileto.txt"));


        for(String st:sts) {
           bos.write(st);
           bos.newLine();
           bos.flush();
        }
        bos.close();
    }
}
