package IPDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        //Socket s = new Socket(InetAddress.getByName("192.168.0.199"), 10000);
        Socket sk = new Socket("192.168.0.199", 10000);
        //获取输出流，写数据
        OutputStream outputStream = sk.getOutputStream();

        outputStream.write("heeloworld!".getBytes());

        sk.close();
    }
}
