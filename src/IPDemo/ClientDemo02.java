package IPDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.199", 10000);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("nihao".getBytes());

        socket.close();
    }
}
