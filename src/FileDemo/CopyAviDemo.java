package FileDemo;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();


        //复制视频
        //第一种 基本字节流一次读写一个字节
        String s = "C:\\Users\\李嘉欣\\Desktop\\8.线性代数课时.mp4";
        FileInputStream fis = new FileInputStream(s);
        FileOutputStream fos = new FileOutputStream(s);

         method1();
         method2();
         method3();
         method4();




        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("总共耗时:"+(endTime-startTime));

    }
    public static void method1() throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:\\Users\\李嘉欣\\Desktop\\8.线性代数课时.mp4"));
        BufferedOutputStream fos = new BufferedOutputStream( new FileOutputStream("8.线性代数课时.mp4"));

        byte[] bytes = new byte[1024];
        int by;
        while((by=fis.read(bytes))!=-1){
            fos.write(bytes,0, by);
        }

        fis.close();;
        fos.close();
    }
    public static void method2(){

    }
    public static void method3(){

    }
    public static void method4(){

    }

}
