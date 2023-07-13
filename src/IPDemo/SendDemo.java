package IPDemo;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建数据报套接字
        DatagramSocket ds = new DatagramSocket();
        //数据  byte
        byte[] bt = "hello,world!!!!".getBytes();
        //打包数据
        DatagramPacket dp = new DatagramPacket(bt, bt.length, InetAddress.getByName("192.168.0.199"), 10086);
        //发送数据
        ds.send(dp);
        //关闭发送端
        ds.close();
    }

}
