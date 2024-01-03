package btl_001.service;

import btl_001.model.Category;
import session10.bt.IStudent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class CategoryService {
    private Scanner sc = new Scanner(System.in);
    private final String FOLDER_FILE_CATEGORY = "btl_001";
    private final String FILE_CATEGORY = "btl_001/data.txt";

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

    public void addCategory(){

    }

}
