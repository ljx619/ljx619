package FileDemo;


import java.io.*;

public class CopyFIle {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\FileDemo\\CopyAudio.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("copy.java"));

        char[] ch = new char[1024];
        int len;
        while((len = isr.read(ch))!=-1){
            osw.write(ch,0,len);
        }

        isr.close();
        osw.close();
    }
}
