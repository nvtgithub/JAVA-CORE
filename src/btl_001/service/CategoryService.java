package btl_001.service;

import btl_001.model.Book;
import btl_001.model.Category;
import btl_001.validate.Color;

import java.io.*;
import java.util.*;

public class CategoryService implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String FOLDER_FILE_CATEGORY = "data";
    private final String FILE_CATEGORY = "data/category.txt";

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
            System.err.println("Có lỗi khi thêm mới!");
        }
    }

    public List<Category> getAllFromFile() {
        List<Category> categories = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_CATEGORY);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            categories = (List<Category>) objectInputStream.readObject();
        } catch (EOFException e) {
            return categories;
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }

    // 1.Thêm mới
    public void addCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Color.CYAN + "THÊM MỚI THỂ LOẠI SÁCH:" + Color.RESET);
        List<Category> categories = getAllFromFile(); // Lấy dl từ file
        do {
            // Khoi tạo doi tuong category
            Category category = new Category();
            category.input();
            categories.add(category);
            saveToFile(categories);
            System.out.print("Nhập tiếp (1.Có / 0.Không). Bạn chọn: ");
            System.out.println(Color.YELLOW + "Thêm thành công!" + Color.RESET);
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 0) break;
        } while (true);
    }

    //2.Hien thi A-Z
    public void showCategory() {
        // tao bien để chứa dl từ file
        List<Category> categories = getAllFromFile();
        System.out.println(Color.CYAN + "HIỂN THỊ DANH SÁCH THEO TÊN TỪ A - Z: " + Color.RESET);
        System.out.printf("\t\t\t\t\t|------------- ❤️Danh sách Thể loại ❤️-------------|%n");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n", "ID", "Tên thể loại", "Trạng Thái");
        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");

        // Sắp xếp theo name từ A-Z
        Collections.sort(categories, Comparator.comparing(Category::getId));

        for (Category category : categories) {
            category.output();
        }
    }

    //3.Thong ke
    public void statistical() {
        System.out.println(Color.CYAN + "THỐNG KÊ SỐ SÁCH CÓ TRONG TẤT CẢ THỂ LOẠI: " + Color.RESET);
        BookService bookService = new BookService();
        List<Category> categoryList = getAllFromFile();
        List<Book> bookList = bookService.getAllFromFile();
        System.out.printf("\t\t\t\t\t|--------------- ❤️Danh sách❤️ ---------------|%n");
        System.out.printf("\t\t\t\t\t| %-10s | %-20s | %-6s |%n", "Mã thể loại", "Tên thể loại", "Số sách");
        System.out.printf("\t\t\t\t\t*----------------------------------------------*%n");
        for (Category category : categoryList) {
            int count = 0;
            for (Book book : bookList) {
                if (book.getCategoryId() == category.getId()) {
                    count++;
                }
            }
            System.out.printf("\t\t\t\t\t| %-11s | %-20s | %-7s |%n", category.getId(), category.getName(), count);
        }
    }

    // 4.update
    public void updateCategory() {
        System.out.println(Color.CYAN + "CẬP NHẬT THỂ LOẠI: " + Color.RESET);
        Scanner sc = new Scanner(System.in);

        List<Category> list = getAllFromFile();

        // Có cần in lại danh sách không ?
        System.out.printf("\t\t\t\t\t|------------- ❤️Danh sách Thể loại ❤️-----------|%n");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n", "ID", "Tên thể loại", "Trạng Thái");
        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
        for (Category category : list) {
            category.output();
        }

        System.out.print("Nhập vào mã thể loại cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        Category category = findCategoryById(id, list);
        if (category == null) {
            System.out.println(Color.YELLOW + "Không tìm thấy thể loại với mã thể loại: " + id + Color.RESET);
        } else {
            // hiển thị lại
            System.out.println("Thông tin được sửa: ");
            System.out.printf("\t\t\t\t\t |%-20s | %-15s |%n", "Tên thể loại", "Trạng Thái");
            System.out.printf("\t\t\t\t\t *---------------------------------------*%n");
            category.output3();

            //sửa
            System.out.print("Nhập tên thể loại mới: ");
            category.setName(sc.nextLine());
//            String name = sc.nextLine();
//            if(!name.isEmpty()){
//                category.setName(name);
//            } else {
//                category.setName(category.getName());
//            }

            System.out.print("Nhập trạng thái mới (true/false): ");
            category.setStatus(Boolean.parseBoolean(sc.nextLine()));
            saveToFile(list);
            System.out.println(Color.YELLOW + "Sửa thành công! " + Color.RESET);

            // in lại
            System.out.println("DANH SÁCH THỂ LOẠI MỚI: ");
            System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n", "ID", "Tên thể loại", "Trạng Thái");
            System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
            List<Category> listNew = getAllFromFile();
            for (Category categoryNew : listNew) {
                categoryNew.output();
            }

        }

    }

    // 5.Xoá thể loại theo Mã
    public void deleteCategory() {
        System.out.println(Color.CYAN + "XOÁ THỂ LOẠI: " + Color.RESET);
        Scanner sc = new Scanner(System.in);
        List<Category> categoryList = getAllFromFile();
        BookService bookService = new BookService();
        List<Book> bookList = bookService.getAllFromFile();

        //in danh sách
        System.out.println("DANH SÁCH THỂ LOẠI:  ");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n", "ID", "Tên thể loại", "Trạng Thái");
        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
        for (Category cate : categoryList) {
            cate.output();
        }

        System.out.print("Nhập id thể loại cần xoá: ");
        int id = Integer.parseInt(sc.nextLine());
        // check id
        boolean flagCheckId = true;
        for (Book i : bookList) {
            if (i.getCategoryId() == id) {
                flagCheckId = false;
                System.out.println(Color.YELLOW + "Thể loại có id: " + id + " đang có sách. Không thể xoá!" + Color.RESET);
                break;
            }
        }
        if (flagCheckId) {
            Category category = findCategoryById(id, categoryList);
            if (category != null) {
                categoryList.remove(category);
                saveToFile(categoryList);

                System.out.println(Color.YELLOW + "Xoá thành công!" + Color.RESET);
                System.out.println("DANH SÁCH THỂ LOẠI MỚI:  ");
                System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-15s |%n", "ID", "Tên thể loại", "Trạng Thái");
                System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
                List<Category> categoryListNew = getAllFromFile();
                for (Category categoryNew : categoryListNew) {
                    categoryNew.output();
                }
            } else {
                System.out.println(Color.YELLOW + "Không tìm thấy id cần xoá là: " + id + Color.RESET);
            }
        }
    }

    // Tìm thể loại theo Mã thể loại
    public Category findCategoryById(int id, List<Category> list) {
        for (Category category : list) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

}
