package session06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuQuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        do {
            menu();

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    inputData(list);
                    break;
                case 2:
                   displayData(list);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        while (true);
    }

    public static void menu() {
        System.out.println("----------MENU----------");
        System.out.println("1. Nhập vào n sinh viên ");
        System.out.println("2. Hiển thị danh sách sinh viên: ");
        System.out.println("3. Thoát chương trình");
    }

    public static void inputData(List<SinhVien> listSV ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số lượng sinh viên n = ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tinh sinh viên thứ: " + (i + 1));
            SinhVien std = new SinhVien();
            std.inputDataSinhVien();
            listSV.add(std);
        }
    }

    public static void displayData(List<SinhVien> listSV){
        System.out.println("Danh sách sinh viên là:");
        for (SinhVien sv:listSV ) {
            sv.displayDataSinhVien();
        }
    }
}
