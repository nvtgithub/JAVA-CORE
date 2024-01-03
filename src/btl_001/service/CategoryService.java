package btl_001.service;

import btl_001.model.Category;
import session10.bt.IStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryService {
    private Scanner sc = new Scanner(System.in);
    private final String FOLDER_FILE_CATEGORY = "data";
    private final String FILE_CATEGORY = "data/btl_001.txt";

    // Tạo contructor
    public CategoryService() {

        File folder = new File(FOLDER_FILE_CATEGORY);

        if (!folder.exists()) {
            // tạo đường dẫn thư mục
            folder.mkdir();
        }

        // Khởi tạo file

        File file = new File(FILE_CATEGORY);

        if (!file.exists()) {
            try {
                file.createNewFile();// Phải ném exception khi khởi tạo
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void saveToFile(List<Category> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_CATEGORY);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(list);
        } catch (IOException e) {
            System.out.println("Có lỗi khi thêm mới!");
        }
    }

    public List<Category> getAllFromFile() {
        List<Category> categories = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_CATEGORY);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            categories = (List<Category>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }

    public void addCategory() {
        System.out.println("Nhập thông tin thể loại sách:");
        List<Category> categories = getAllFromFile(); // Lấy dl từ file
        do {
            // Khoi tạo doi tuong category
            Category category = new Category();
            category.input();
            categories.add(category);
            System.out.println("Nhập tiếp 1.Có hoặc 0.Không");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0)
                break;
        } while (true);
        saveToFile(categories);
    }

    public void showCategory(){
        // tao bien để chứa dl từ file
        List<Category> categories = getAllFromFile();

        for (Category category : categories) {
            category.output();
        }
    }
}
