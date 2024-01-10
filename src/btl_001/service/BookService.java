package btl_001.service;



import btl_001.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private final Scanner sc = new Scanner(System.in);
    private final String FOLDER_FILE_BOOK = "data";
    private final String FILE_BOOK = "data/book.txt";

    public BookService() {
        File folder = new File(FOLDER_FILE_BOOK);
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(FILE_BOOK);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void saveToFile(List<Book> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_BOOK);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            System.err.println("Có lỗi khi thêm mới");
        }
    }

    public List<Book> getAllFromFile() {
        List<Book> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_BOOK);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Book>) objectInputStream.readObject();
        } catch (EOFException e) {
            return list;
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void addBook() {
        System.out.println("----- THÊM MỚI SÁCH -----");
        List<Book> list = getAllFromFile();
        do {
            Book book = new Book();
            book.input();
            list.add(book);
            saveToFile(list);
            System.out.print("Nhập tiếp 1.Có - 0.Không.Bạn chọn: ");
            int choice = Integer.parseInt(sc.next());
            if(choice == 0)
                break;
        } while (true);
    }

    public void showBook(){
        List<Book> list = getAllFromFile();
        System.out.printf("\t\t\t\t\t|-------------------------------------------------|%n");
        System.out.printf("\t\t\t\t\t|------------- ❤️Danh sách Sách❤️----------------|%n");
        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n","ID","Tên thể loại","Trạng Thái");
        System.out.printf("\t\t\t\t\t|-------------------------------------------------|%n");
        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
        for (Book book : list) {
            book.output();
        }
    }
}
