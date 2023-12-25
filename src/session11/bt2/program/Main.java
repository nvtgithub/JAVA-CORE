package session11.bt2.program;

import session11.bt2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Thêm mới.");
            System.out.println("2. Danh sách.");
            System.out.println("3. Cập nhật sản phẩm theo id truyền vào.");
            System.out.println("4. Xoá sản phẩm theo id truyền vào.");
            System.out.println("5. Thoát.");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sản phẩm: ");
                    do {
                        Product product = new Product();
                        product.inputData();
                        list.add(product);

                        System.out.println("Nhập thông tin sản phẩm mới (1.Yes or 0.No)");
                        int check = Integer.parseInt(sc.nextLine());
                        if (check == 0)
                            break;
                    } while (true);
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm: ");
                    for (Product item : list) {
                        item.displayData();
                    }
                    break;
                case 3:
                    System.out.println("Cập nhật danh sách sản phẩm.");
                    System.out.println("Nhập id = ");
                    break;
                case 4:
                    // hiển thị danh sách trc và sau xoá
                    getAll(list);

                    System.out.println("Xoá sản phẩm.");
                    System.out.println("Nhập id = ");

                    int code = Integer.parseInt(sc.nextLine());
                    for (Product item: list) {
                      if(item.getId() == code){
                          list.remove(item);
                          break;
                      }
                    }
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!!!");
            }
        } while (true);
    }
    public static void getAll(List<Product> list){
        for (Product item : list) {
            item.displayData();
        }
    }
}
