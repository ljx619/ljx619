package IPDemo;

import java.io.*;
import java.net.Socket;

public class CilentFIleDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端套接字
        Socket socket = new Socket("192.168.0.199", 10000);
        //创建输入对象读取数据
        BufferedReader bufferedReader = new BufferedReader(new FileReader("count.txt"));
        //创建输出对象写数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //读数据
        String line;
        while((line = bufferedReader.readLine())!=null){  //这是字符串  返回的就是读取的数据 如果是字节的话  参数是字节数组 返回值是字节的长度
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        //释放
        socket.close();
        bufferedWriter.close();

    }
}
