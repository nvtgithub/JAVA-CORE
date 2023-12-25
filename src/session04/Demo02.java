package session04;

import ra.Menu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // Viết chương trình có menu
        // 1.Nhập vào mảng gồm họ tên của 5 sv
        // 2.Hiển thị danh sách
        // 3.Kiểm tra xem ds có bao nhiêu bạn tên 'Nguyen Van A'
        Scanner sc = new Scanner(System.in);

        String[] students = new String[5];

        do {
            Menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

                case 1:
                    System.out.println("Nhập vào họ tên sinh viên");
                    nhapMang(students);
                    break;
                case 2:
                    if(students[0] == null){
                        System.out.println("Chưa có danh sách sinh viên!Nhập lại!");
                    } else {
                        System.out.println("Danh sách sinh viên là:");
                        xuatMang(students);
                    }
                    break;
                case 3:
                    demMang(students);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai!Nhập lại");
                    break;
            }
        } while (true);
    }

    public static void Menu() {
        System.out.println("========MENU=======");
        System.out.println("1. Nhập vào mảng gồm tên của 5 sinh viên ");
        System.out.println("2. Hiển thị danh sách ");
        System.out.println("3. Kiểm tra danh sách có bao nhiêu bạn có họ tên 'Nguyễn Văn A' ");
        System.out.println("4. Thoát chương trình ");
        System.out.println("Mời lựa chọn từ 1-4 ");
    }

    public static void nhapMang(String[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Họ và tên sv thứ: " + (i + 1));
            arr[i] = sc.nextLine();
        }

    }

    public static void xuatMang(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("SV " + (i + 1) + ": " + arr[i]);
        }
    }

    public static void demMang(String[] arr) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("Nhập họ tên sinh viên cần kiểm tra:");
        String fullName = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (fullName.equals(arr[i])) {
                count++;
            }
        }
        if(count > 0){
            System.out.println("Họ tên sinh viên: '" + fullName + "' xuất hiện " + count+" lần!");
            System.out.printf("Số sinh viên có tên %s là %d",fullName, count);
        } else {
            System.out.printf("Không tìm thấy sinh viên %s", fullName);
        }

    }
}
