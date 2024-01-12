package btl_001.view;

import btl_001.model.Book;
import btl_001.service.BookService;
import btl_001.service.CategoryService;

import java.util.Scanner;

public class Menu {
    private static final Scanner sc = new Scanner(System.in);

    private static final CategoryService CATEGORY_SERVICE = new CategoryService();
    private static final BookService BOOK_SERVICE = new BookService();

    public static void showMenu() {
        do {
            System.out.println("=========== QUẢN LÝ THƯ VIỆN ===========");
            System.out.println("1. Quản lý thể loại");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");
            System.out.print("\tChọn từ 1 đến 3. Bạn chọn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    menuCategory();
                    break;
                case 2:
                    menuBook();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!!!");
            }
        } while (true);
    }

    public static void menuCategory() {
        do {
            System.out.println("========== QUẢN LÝ THỂ LOẠI ==========");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên từ A - Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại ");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xoá thể loại");
            System.out.println("6. Quay lại");
            System.out.print("\tChọn từ 1 - 6. Bạn chọn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    CATEGORY_SERVICE.addCategory();
                    break;
                case 2:
                    CATEGORY_SERVICE.showCategory();
                    break;
                case 3:
                    CATEGORY_SERVICE.statistical();
                    break;
                case 4:
                    CATEGORY_SERVICE.updateCategory();
                    break;
                case 5:
                    CATEGORY_SERVICE.deleteCategory();
                    break;
                case 6:
                    showMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!!!");
            }
        } while (true);
    }

    public static void menuBook() {
        do {
            System.out.println("========== QUẢN LÝ SÁCH ==========");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xoá sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách theo nhóm thể loại");
            System.out.println("6. Danh sách");
            System.out.println("7. Quay lại");
            System.out.print("\tChọn từ 1 - 7. Bạn chọn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    BOOK_SERVICE.addBook();
                    break;
                case 2:
                    BOOK_SERVICE.updateBook();
                    break;
                case 3:
                    BOOK_SERVICE.deleteBook();
                    break;
                case 4:
                    BOOK_SERVICE.findBook();
                    break;
                case 5:
                    BOOK_SERVICE.showBookByCategory();
                    break;
                case 6:
                    BOOK_SERVICE.showBook();
                    break;
                case 7:
                    showMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!!!");
            }
        } while (true);
    }
}
