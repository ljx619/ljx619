package IPDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("s2.txt"));

        String line;
        while((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter1.write("文件上传成功");
        bufferedWriter1.newLine();
        bufferedWriter1.flush();

        serverSocket.close();
        bufferedWriter1.close();
        bufferedWriter.close();

    }
}
