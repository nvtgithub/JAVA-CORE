package session08.bt.program;

import session08.bt.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        do {
            menu();

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());

                    inputData(list, n);
                    break;
                case 2:
                    tinhDiemTB(list);
                    break;
                case 3:
                    checkPassStudent(list);
                    break;
                case 4:
                    display(list);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!!!");
            }
        }
        while (true);
    }

    public static void menu() {
        System.out.println("===========QUẢN LÝ SINH VIÊN==========");
        System.out.println("1. Nhập thông tin n sinh viên.");
        System.out.println("2. Tính điểm trung bình sinh viên.");
        System.out.println("3. Xét điểm qua cho sinh viên.");
        System.out.println("4. Hiển thị thông tin cho sinh viên.");
        System.out.println("5. Thoát.");
    }

    public static void inputData(List<Student> list, int n) {
        System.out.println("Nhập thông tin sinh viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ: " + (i + 1));
            Student std = new Student();
            std.inputData();
            list.add(std);
        }
    }

    public static void tinhDiemTB(List<Student> list) {
        for (Student std : list) {
            std.tinhDiemTB();
        }
    }

    public static void checkPassStudent(List<Student> list) {
        for (Student std: list) {
            std.checkPassFail();
        }
    }

    public static void display(List<Student> list) {
        for (Student std : list) {
            std.displayData();
        }

    }
}
