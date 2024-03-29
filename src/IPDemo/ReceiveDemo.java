package IPDemo;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建数据报套接字
        DatagramSocket ds = new DatagramSocket(10086);
        //创建接收数组
        byte[] bt = new byte[1024];
        //创建接收数据包
        DatagramPacket dp = new DatagramPacket(bt, bt.length);
        //接收数据
        ds.receive(dp);
        //把数据输出在控制台
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        //关闭接收端
        ds.close();
    }

}
