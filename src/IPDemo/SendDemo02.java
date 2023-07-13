package IPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendDemo02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        byte[] bt = s.getBytes();
        DatagramPacket dp = new DatagramPacket(bt, bt.length, InetAddress.getByName("192.168.0.199"), 10086);

        ds.send(dp);

        ds.close();
    }
}
