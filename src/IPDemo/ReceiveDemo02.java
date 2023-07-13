package IPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bt = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bt, bt.length);

        while(true) {

            ds.receive(dp);

            String s = new String(dp.getData(),0,dp.getLength());

            System.out.println(new String(s));

            if(s.equals("886")){
                break;
            }
        }

        ds.close();
    }
}
