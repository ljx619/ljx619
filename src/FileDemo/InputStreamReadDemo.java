package FileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReadDemo {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file.txt"));
        //

//        int read;
//        while((read = isr.read())!=-1) {
//            System.out.print((char) read);
//        }
        char[] ch = new char[1024];
        int read;
        while((read = isr.read(ch))!=-1){
            System.out.println(new String(ch,0,read));
        }



        isr.close();
    }
}
