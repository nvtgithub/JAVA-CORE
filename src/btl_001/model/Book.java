package btl_001.model;

import btl_001.service.CategoryService;
import btl_001.validate.BookValidate;
import btl_001.validate.Color;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Book implements IEntity, Serializable {
    private static final long serialVersionUID = 1L;
    // ANSI escape code constants for text colors
    private final BookValidate BOOK_VALIDATE = new BookValidate();
    private final CategoryService CATEGORY_SERVICE = new CategoryService();
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    public Book() {
    }

    public Book(String id, String title, String author, String publisher, int year, String description, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    //    public void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap id:");
//        id = sc.nextLine();
//        System.out.println("Nhap tiêu đề:");
//        title = sc.nextLine();
//        System.out.println("Nhap tác giả:");
//        author = sc.nextLine();
//        System.out.println("Nhap publisher:");
//        publisher = sc.nextLine();
//        System.out.println("Nhap năm:");
//        year = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập id cate:");
//        System.out.println("Nhập mo ta");
//        description = sc.nextLine();
//        categoryId = Integer.parseInt(sc.nextLine());
//
//
//    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        // Id
        System.out.print("Nhập ID sách: ");
        do {
            id = sc.nextLine();
            if (!id.startsWith("B")) {
                System.out.println(Color.RED + "ID sách phải bắt đầu bằng ký tự B: " + Color.RESET);
                System.out.print("Nhập lại: ");
            } else {
                String regex = "^(?=\\s*\\S).{4,30}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher check = pattern.matcher(id);
                if (!check.matches()) {
                    System.out.println(Color.RED + "ID không hợp lệ. Phải có đủ 4 ký tự!" + Color.RESET);
                    System.out.print("Nhập lại: ");
                } else {
                    boolean flag = BOOK_VALIDATE.checkIsOnlyIDBook(id);
                    if (!flag) {
                        System.out.println(Color.RED + "ID sách đã tồn tại!" + Color.RESET);
                        System.out.print("Nhập lại: ");
                    } else
                        break;
                }
            }
        } while (true);

        //Tiêu đề
        System.out.print("Nhập tiêu đề sách: ");
        do {
            title = sc.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-Z\\d]{6,50}$");
            Matcher check = pattern.matcher(title);
            if (!check.matches()) {
                System.out.println(Color.RED + "Tiêu đề phải từ 6 - 50 ký tự!" + Color.RESET);
                System.out.print("Nhập lại: ");
            } else {
                boolean flag = BOOK_VALIDATE.checkIsOnlyTitleBook(title);
                if (!flag) {
                    System.out.println(Color.RED + "Tiêu đề sách đã tồn tại!" + Color.RESET);
                    System.out.print("Nhập lại: ");
                } else
                    break;
            }
        } while (true);

        // Tác giả
        System.out.print("Nhập tác giả: ");
        do {
            author = sc.nextLine();
            boolean flag = BOOK_VALIDATE.checkNullString(author);
            if (!flag) {
                System.out.println(Color.RED + "Tên tác giả không được để trống!" + Color.RESET);
                System.out.print("Nhập lại: ");
            } else
                break;
        } while (true);

        // Nhà xuất bản
        System.out.print("Nhập nhà xuất bản: ");
        do {
            publisher = sc.nextLine();
            boolean flag = BOOK_VALIDATE.checkNullString(publisher);
            if (!flag) {
                System.out.println(Color.RED + "Tên nhà xuất bản không đươc để trống!" + Color.RESET);
                System.out.print("Nhập lại: ");
            } else
                break;
        } while (true);

        // Năm xuất bản
        System.out.print("Nhập năm xuất bản: ");
        do {
            try {
                year = Integer.parseInt(sc.nextLine());
                boolean flag = BOOK_VALIDATE.checkYear(year);
                if (!flag) {
                    System.out.println(Color.RED + "Năm xuất bản phải lớn hơn 1970 và nhỏ hơn năm hiện tại!" + Color.RESET);
                    System.out.print("Nhập lại: ");
                } else
                    break;
            } catch (Exception e) {
                System.out.println(Color.RED + "Năm xuất bản không hợp lệ!" + Color.RESET);
                System.out.print("Nhập lại: ");
            }
        } while (true);


        // mô tả sách
        System.out.print("Nhập mô tả sách: ");
        do {
            description = sc.nextLine();
            boolean flag = BOOK_VALIDATE.checkNullString(description);
            if (!flag) {
                System.out.println(Color.RED + "Mô tả sách không được để trống!" + Color.RESET);
                System.out.print("Nhập lại: ");
            } else
                break;
        } while (true);


        //     Thể loại sách
        List<Category> list = CATEGORY_SERVICE.getAllFromFile();

        //  in ra danh sách thể loại
        System.out.println("\t\t\t\tDANH SÁCH THỂ LOẠI");
        System.out.printf("\t\t\t| %-2s | %-18s |%n", " ID ", " Tên thể loại ");
        System.out.printf("\t\t\t*-----------------------------*%n");
        for (int i = 0; i < list.size(); i++) {
            // in ra danh sách thể loại có trạng thái đang hoạt động
            if (list.get(i).isStatus()) {
                list.get(i).output2();
            }
        }

        // xử lý chọn id
        System.out.println("Nhập ID thể loại: ");
        System.out.print("Chọn ID từ danh sách trên. Bạn nhập: ");
        do {
            do {
                try {
                    categoryId = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(Color.RED + "ID bạn chọn không hợp lệ! " + Color.RESET);
                    System.out.print("Nhập lại: ");
                }
            } while (true);

            boolean flagIdCheck = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isStatus()) {
                    if (categoryId == list.get(i).getId()) {
                        flagIdCheck = true;
                        break;
                    }
                }
            }
            if (!flagIdCheck) {
                System.out.println(Color.RED + "ID bạn chọn không đúng!" + Color.RESET);
                System.out.print("Nhập lại:  ");
            } else
                break;
        } while (true);
        System.out.println();
    }

    @Override
    public void output() {
        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-12s| %-20s |%-11s |%n"
                , id, title, author, publisher, year, description, categoryId);
    }

    public void output2() {
        System.out.printf("\t\t\t\t\t| %-20s | %-20s | %-20s| %-12s| %-20s |%-11s |%n"
                , title, author, publisher, year, description, categoryId);
    }
}
