package FileDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.StubNotFoundException;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

        Student st = new Student(21,"李佳旭");

        oos.writeObject(st);

        oos.close();


    }
}
