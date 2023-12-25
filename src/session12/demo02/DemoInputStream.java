package session12.demo02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputStream {
//    public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream inputStream = new DataInputStream(fileInputStream);
        System.out.println("Đọc file data.txt");
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readBoolean());
    }
}
