package FileDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("outdemo.txt"));

//        osw.write(97);
//        osw.flush();
//        osw.close();
        String s = "abcdef";
        char[] chars = {'1', '2', '2'};
        osw.write(s,2,4);
//        osw.flush();
        osw.close();


    }
}
