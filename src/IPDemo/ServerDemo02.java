package IPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] bt = new byte[1024];
        int read = inputStream.read(bt);

        System.out.println(new String(bt, 0, read));

        serverSocket.close();
        accept.close();
    }
}
