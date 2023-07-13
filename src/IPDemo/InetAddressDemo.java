package IPDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("LAPTOP-SAUH9HQU");
        InetAddress address = InetAddress.getByName("192.168.0.199");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
