package IPDemo;

import java.io.*;
import java.net.Socket;
import static java.lang.System.in;

public class ClientDemo02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.199", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
        }


        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("nihao".getBytes());

        //接收服务器的反馈
        InputStream inputStream = socket.getInputStream();
        byte[] bt = new byte[1024];
        int read = inputStream.read(bt);
        System.out.println(new String(bt,0,read));
        //

        socket.close();
    }
}
