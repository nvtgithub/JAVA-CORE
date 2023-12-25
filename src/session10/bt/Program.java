package session10.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("========MENU===========");
            System.out.println("1. Nhập số lượng sinh viên");
            System.out.println("2. Hiển thị danh sách số lượng");
            System.out.println("3. Tìm kiếm sinh viên theo studentCode nhập từ bàn phím");
            System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    System.out.println("Nhập số lượng sinh viên n=: ");
//                    int n = Integer.parseInt(sc.nextLine());
//                    for (int i = 0; i < n; i++) {
//                        Student std = new Student();
//                        std.inputData();
//                        list.add(std);
//                    }
//                    break;
                    do {
                        System.out.println("Nhập thông tin sv");
                        Student std = new Student();
                        std.inputData();
                        list.add(std);
                        System.out.println("Muốn nhập thêm mới sinh viên không ? 1.Có or 0.Không");
                        int check = Integer.parseInt(sc.nextLine());
                        if (check == 0) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên là: ");
                    for (Student std : list) {
                        std.displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần tìm kiếm: ");
                    int code = Integer.parseInt(sc.nextLine());
                    boolean flag = false;
                    for (Student std : list) {
                        if (std.getStudentCode() == code) {
                            flag = true;
                            System.out.println("Sinh viên cần tìm là: " + std.getStudentName());
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Không tìm thấy sinh viên có mã: " + code);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sinh viên có điểm giảm dần: ");
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j < list.size() - 1 - i; j++) {
                            if (list.get(j).getAvgMark() < list.get(j + 1).getAvgMark()) {
                                Student studentTemp = list.get(j);
                                list.set(j, list.get(j + 1));
                                list.set(j + 1, studentTemp);
                            }
                        }
                    }

                    for (Student std : list) {
                        std.displayData();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không hợp lệ. Nhập lại!!!");
            }

        } while (true);
    }


}
