package FileDemo;


import java.io.*;

public class CopyFIle {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\FileDemo\\CopyAudio.java"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("copy.java"));
//        FileReader fileReader = new FileReader("file.txt");
//        FileWriter fileWriter = new FileWriter("filecopy.txt");

//        char[] chs = new char[1024];
//        int len;
//        while((len = fileReader.read(chs))!=-1){
//            fileWriter.write(chs,0,len);
//        }
        //
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt")));
//        char[] ch = new char[1024];
//        int len;
//        while((len = br.read(ch))!=-1){
//            System.out.println(new String(ch,0,len));
//        }
        //BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        //BufferedWriter bw = new BufferedWriter(new FileWriter("filecopy2.txt"));

        //
        //char[] ch = new char[1024];
        //int len;
       // while((len = br.read(ch))!=-1){
        //    bw.write(ch,0,len);
        //}

        //br.close();
        //bw.close();


        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("filecopy3.txt"));
        //遍历
        String st;
        while((st = br.readLine())!=null){
            bw.write(st);
            bw.newLine();
        }
        br.close();
        bw.close();


//        fileWriter.close();
//        fileReader.close();
    }
}
