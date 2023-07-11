package FileDemo;

/*
* 随机点名器  在文件中抽取数据
* 放到集合中来随机读取
* */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class FiletoArrayDemo  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("filecopy.txt"));
        ArrayList<String> strings = new ArrayList<>();
        String s;
        while((s = bf.readLine())!=null){
            strings.add(s);
        }
        bf.close();

        Random random = new Random();
        int index = random.nextInt(strings.size());

        System.out.println(strings.get(index));
    }
}
