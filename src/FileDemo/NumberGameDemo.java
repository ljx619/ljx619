package FileDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class NumberGameDemo {
    public static void main(String[] args) throws IOException {
        //NumberGame.start();
        Properties pt = new Properties();

        FileReader fr = new FileReader("count.txt");
        //从文件中读取键值对
        pt.load(fr);
        fr.close();//释放

        String count = pt.getProperty("count");
        int number = Integer.parseInt(count);

        if(number >= 3){
            System.out.println("你的试用次数已用完");
        }else {
            NumberGame.start();
            number++;
            pt.setProperty("count",String.valueOf(number));
            FileWriter fileWriter = new FileWriter("count.txt");
            pt.store(fileWriter,null);
            fileWriter.close();
        }

    }
}
