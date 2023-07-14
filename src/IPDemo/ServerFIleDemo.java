package IPDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFIleDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器套接字
        ServerSocket serverSocket = new ServerSocket(10000);
        //侦听
        Socket accept = serverSocket.accept();
        //封装输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        //封装输出
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("s.txt"));
        //获取数据
        String line;
        while((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        serverSocket.close();
        bufferedWriter.close();

    }
}
