package FileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleDemo01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("file.txt");
        f1.createNewFile();
        FileOutputStream f2 = new FileOutputStream(f1);
        f2.write(97);
        byte[] Cb1 = {97, 2, 3, 4, 5};
        f2.write("abcdefg".getBytes());
        f2.close();

        FileInputStream finput = new FileInputStream(f1);


            int by;
            while ((by = finput.read()) != -1) {
                System.out.print((char) by);
            }

        finput.close();
    }

}
