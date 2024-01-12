package btl_001.service;

import btl_001.model.Book;
import btl_001.model.Category;
import btl_001.validate.Color;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String FOLDER_FILE_BOOK = "data";
    private final String FILE_BOOK = "data/book.txt";
    private final CategoryService CATEGORY_SERVICE = new CategoryService();

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
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(list);
        } catch (IOException e) {
            System.err.println("Có lỗi khi thêm mới!");
            e.printStackTrace();
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
            System.err.println("Lỗi khi đọc file!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    //1.them moi
    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println(Color.CYAN + "THÊM MỚI SÁCH" + Color.RESET);
        List<Book> list = getAllFromFile();
        do {
            Book book = new Book();
            book.input();
            list.add(book);
//            saveToFile(list);
            System.out.println(Color.YELLOW + "Thêm thành công!" + Color.RESET);
            System.out.print("Nhập tiếp (1.Có / 0.Không). Bạn chọn: ");
            int choice = Integer.parseInt(sc.next());
            if (choice == 0)
                break;
        } while (true);
        saveToFile(list);
    }

    //2.update
    public void updateBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Color.CYAN + "CẬP NHẬT THÔNG TIN SÁCH: " + Color.RESET);
        CategoryService categoryService = new CategoryService();
        List<Category> categoryList = categoryService.getAllFromFile();

        // in danh sách:
        System.out.println("DANH SÁCH:");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        List<Book> list = getAllFromFile();
        for (Book book : list) {
            book.output();
        }
        System.out.print("Nhập mã sách cần sửa: ");
        String id = sc.nextLine();

        System.out.println("Thông tin sửa: ");
        System.out.printf("\t\t\t\t\t| %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*---------------------------------------------------------------------------------------------------------------------*%n");
        Book book = findBookById(id, list);
        if (book != null) {
            book.output2();

            System.out.print("Nhập tiêu đề mới (Nhấn Enter để bỏ qua): ");
            String title = sc.nextLine();
            if (!title.isEmpty()) {
                book.setTitle(title);
            } else {
                book.setTitle(book.getTitle());
            }
//            book.setTitle(sc.nextLine());
            System.out.print("Nhập tác giả mới (Nhấn Enter để bỏ qua): ");
            String author = sc.nextLine();
            if (!author.isEmpty()) {
                book.setAuthor(author);
            } else {
                book.setAuthor(book.getAuthor());
            }
            //            book.setAuthor(sc.nextLine());
            System.out.print("Nhập nhà xuất bản mới (Nhấn Enter để bỏ qua): ");
            String publisher = sc.nextLine();
            if (!publisher.isEmpty()) {
                book.setPublisher(publisher);
            } else {
                book.setPublisher(book.getPublisher());
            }
//            book.setPublisher(sc.nextLine());
            System.out.print("Nhập năm xuất bản mới: ");
            book.setYear(Integer.parseInt(sc.nextLine()));

            System.out.print("Nhập mô tả mới (Nhấn Enter để bỏ qua): ");
            String description = sc.nextLine();
            if (!description.isEmpty()) {
                book.setDescription(description);
            } else {
                book.setDescription(book.getDescription());
            }
//            book.setDescription(sc.nextLine());

            // Cần nhập lại id thể loại không ?
            System.out.println("Danh sách thể loại: ");
            for (Category category : categoryList) {
                if (category.isStatus()) {
                    category.output2();
                }
            }
            System.out.print("Chọn ID thể loại. Bạn chọn: ");
            book.setCategoryId(Integer.parseInt(sc.nextLine()));

            // luu
            saveToFile(list);
            System.out.println(Color.YELLOW + "Cập nhật thành công!" + Color.RESET);
            System.out.println("DANH SÁCH MỚI:");
            List<Book> bookListNew = getAllFromFile();
            System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
            System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
            for (Book book1 : bookListNew) {
                book1.output();
            }
        } else {
            System.out.println(Color.YELLOW + "Không tìm thấy sách có mã sách là: " + id + Color.RESET);
        }
    }

    //3.Xoa sach
    public void deleteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Color.CYAN + "XOÁ DANH SÁCH: " + Color.RESET);

        List<Book> list = getAllFromFile();
        System.out.println(" Danh sách: ");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        for (Book book : list) {
            book.output();
        }
        System.out.print("Nhập id cần xoá: ");
        String id = sc.nextLine();
        Book book = findBookById(id, list);
        if (book != null) {
            list.remove(book);
            saveToFile(list);
            System.out.println(Color.YELLOW + "Xoá thành công!" + Color.RESET);
        } else {
            System.out.println(Color.YELLOW + "Không tìm thấy id sách cần xoá là: " + id + Color.RESET);
        }

        // in lại danh sách mới
        List<Book> bookListNew = getAllFromFile();
        System.out.println("DANH SÁCH MỚI:");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        for (Book book1 : bookListNew) {
            book1.output();
        }
    }

    //4.Tim kiem sach gần đúng : tiêu đề, nhà xuất bản, tên tác giả
    public void findBook() {
        System.out.println(Color.CYAN + "TÌM KIẾM SÁCH(TÌM KIẾM GẦN ĐÚNG): " + Color.RESET);
        Scanner sc = new Scanner(System.in);
        List<Book> list = getAllFromFile();
        System.out.print("Nhập từ khoá tìm kiếm: ");
        String str = sc.nextLine().toLowerCase();

        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        boolean flagCheckNull = false;
        for (Book book : list) {
            String title = book.getTitle().toLowerCase();
            String author = book.getAuthor().toLowerCase();
            String publisher = book.getPublisher().toLowerCase();
            if (title.contains(str) || author.contains(str) || publisher.contains(str)) {
                flagCheckNull = true;
                Book book1 = findBookById(book.getId(), list);
                book1.output();
            }
        }
        if (!flagCheckNull) {
            System.out.println(Color.YELLOW + "Không tìm thấy kết quả!" + Color.RESET);
        }
    }

    //5.Hien thi danh sach theo nhom the loai
    public void showBookByCategory() {
        System.out.println(Color.CYAN + "HIỂN THỊ DANH SÁCH THEO NHÓM THỂ LOẠI: " + Color.RESET);
        List<Book> bookList = getAllFromFile();
        List<Category> categoryList = CATEGORY_SERVICE.getAllFromFile();

        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println("\t" + (i + 1) + "." + " Thể loại: " + Color.BLUE + categoryList.get(i).getName() + Color.RESET);
            Boolean flag = false;
            for (Book book : bookList) {
                if (book.getCategoryId() == categoryList.get(i).getId()) {
                    flag = true;
                    System.out.println("\t\t - " + Color.GREEN + book.getTitle() + Color.RESET);
                }
            }
            if (!flag) {
                System.out.println(Color.PURPLE + "\t\t'Không có sách nào!'" + Color.RESET);
            }
        }
    }

    public Book findBookById(String id, List<Book> list) {
        for (Book book : list) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void showBook() {
        List<Book> list = getAllFromFile();
        System.out.printf("\t\t\t\t\t|------------------------------------------------------------------------------------------------------------------------------|%n");
        System.out.printf("\t\t\t\t\t|--------------------------------------------- ❤️Danh sách Sách❤️ -------------------------------------------------------------|%n");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-10s| %-20s |%-6s |%n", "ID", "Tiêu đề", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Mô tả", "Mã thể loại");
        System.out.printf("\t\t\t\t\t*------------------------------------------------------------------------------------------------------------------------------*%n");
        for (Book book : list) {
            book.output();
        }
    }
}
