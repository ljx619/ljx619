package FileDemo;

import java.io.*;

public class CopyDir {
    public static void main(String[] args) throws IOException {
        File fl1 = new File("C:\\Users\\李嘉欣\\Desktop\\CopyDemo");
        String name = fl1.getName();
        File fl2 = new File(name);
        if(!fl2.exists()){
            fl2.mkdir();
        }
        File[] files = fl1.listFiles();
        for(File flt:files){
            String name1 = flt.getName();
            File fl4 = new File(fl2, name1);
            //methos1(flt,fl4);
        }
    }

//    private static void methos1(File flt, File fl4) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(flt));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fl4));
//
//        byte[] bytes = new byte[1024];
//        int len;
//        while((len = bis.read(bytes))!=-1){
//            bos.write(bytes,0,len);
//        }
//        bis.close();
//        bos.close();
//    }
}
