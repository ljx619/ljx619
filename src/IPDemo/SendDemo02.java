package IPDemo;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = bw.readLine()) != null){
            if(line.equals("886")){
                break;
            }

            byte[] bt = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bt, bt.length, InetAddress.getByName("192.168.0.199"), 10086);

            ds.send(dp);
        }

        ds.close();
        bw.close();
    }
}
