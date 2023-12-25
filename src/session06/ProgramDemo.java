package session06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        do {
            System.out.println("-------MENU------");
            System.out.println("1. Nhập vào n tên sinh viên: ");
            System.out.println("2. Hiển thị danh sách sinh viên: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số lượng muốn thêm");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập vào họ tên sinh viên thứ: " + (i + 1));
                        list.add(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên: ");
                    for (String item : list) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
        while (true);
    }
}
