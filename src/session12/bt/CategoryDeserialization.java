package session12.bt;

import session11.generic.Cal;

import java.io.*;

public class CategoryDeserialization {
    public static void main(String[] args) throws IOException {
        System.out.println("DL đọc từ file: category.txt");
        try{
            FileInputStream fileInputStream = new FileInputStream("category.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Category category = (Category) inputStream.readObject();
            while (true){
                System.out.println(category.toString());
                category = (Category) inputStream.readObject();
            }
        }  catch (EOFException e){
            System.out.println("Đã đọc xong!");
        }
        catch (IOException e) {
            throw new RuntimeException("Có lỗi khi đọc.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Định dạng dl đọc k đúng");
        }
    }
}
