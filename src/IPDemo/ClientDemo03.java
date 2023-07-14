package IPDemo;

import java.io.*;
import java.net.Socket;

public class ClientDemo03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.199", 10000);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("count.txt"));

        String line;
        while ((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        socket.shutdownOutput();

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader1.readLine();
        System.out.println(s);

        socket.close();
        bufferedReader.close();
    }
}
