package IPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器对象的Socker对象  用的是ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);
        //获取输入流，显示在控制台
        Socket accept = serverSocket.accept();  //监听套接字

        InputStream is = accept.getInputStream();

        byte[] bt = new byte[1024];
        int len = is.read(bt);
        //
        System.out.println(new String(bt,0,len));

        accept.close();
        serverSocket.close();

    }
}
