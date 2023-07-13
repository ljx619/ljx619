package IPDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s = new Socket(InetAddress.getByName("192.168.0.199"),12345);
    }
}
