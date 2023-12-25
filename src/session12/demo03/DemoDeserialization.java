package session12.demo03;

import java.io.*;

public class DemoDeserialization {
    public static void main(String[] args) throws IOException {
        System.out.println("Danh sách đọc được từ file: student.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream("student.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Student student =(Student) inputStream.readObject();
            while (true){
                System.out.println(student.toString());
                student = (Student) inputStream.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Đã đọc xong!");
        } catch (IOException e) {
            throw new RuntimeException("Có lỗi khi đọc.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Định dạng dl đọc không đúng.");
        }


//        FileInputStream fileInputStream = new FileInputStream("student.txt");

    }
}
