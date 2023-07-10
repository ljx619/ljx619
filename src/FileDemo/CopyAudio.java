package FileDemo;

import java.io.*;

public class CopyAudio {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\李嘉欣\\Desktop\\8.线性代数课时.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("8.线性代数课时.mp4"));

        byte[] bt = new byte[1024];
        int by;
        while ((by = bis.read(bt)) != -1) {
            bos.write(bt, 0, by);
        }
        bis.close();
        bos.close();
    }
}
