package session12.demo03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Tiến",18,true));
        list.add(new Student(2,"Ánh",18,false));
        list.add(new Student(3,"Huy",18,true));

        File file = new File("student.txt");
        if(file.createNewFile()){
                FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            for (Student student : list) {
                outputStream.writeObject(student);
            }
            outputStream.close();
            System.out.println("Ghi thành công!!!");
        }
        else {
            System.out.println("Ghi thất bại!");
        }
    }
}
