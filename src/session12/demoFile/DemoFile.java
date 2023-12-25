package session12.demoFile;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) {
        String path = "D:\\java\\test";
        File file = new File(path);
        if(!file.exists()){
            file.mkdir(); // Tạo mới thư mục
        }
        // Xoá thư mục
//        if(file.exists()){
//            file.delete();
//        }

        // tạo file
        String fileName = "D:\\java\\demo.txt";
        File file1 = new File(fileName);
        try{
            if(file1.isFile()){
                file1.createNewFile();
            }
        } catch (IOException e){
            throw  new RuntimeException(e);
        }

    }
}
