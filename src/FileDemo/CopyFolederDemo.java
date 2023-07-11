package FileDemo;

import java.io.*;

public class CopyFolederDemo {
    public static void main (String[] args) throws IOException{
        File srcFile = new File("C:\\Users\\李嘉欣\\Desktop\\CopyDemo");
        File destFile = new File(".");

        //
        copyFolder(srcFile,destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFloder = new File(destFile,srcFileName);
            if(!newFloder.exists()){
                newFloder.mkdir();
            }
            File[] fileArray = srcFile.listFiles();
            for(File file:fileArray){
                copyFolder(file,newFloder);
            }
        }else {
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }


    public static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
