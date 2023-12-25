package session06;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MenuQuanlyNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employe> list = new ArrayList<>();
        do {
            menu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số lượng sinh viên n = ");
                    int n = Integer.parseInt(sc.nextLine());
                    inputData(list, n);
                    break;
                case 2:
                    displayData(list);
                    break;
                case 3:
                    System.out.println("Nhập vào mã nhân viên cần tìm kiếm: ");
                    String eCodeCheck = sc.nextLine();
                    checkInfoEmploye(list, eCodeCheck);
                    break;
                case 4:
                    System.out.println("Nhập tên nhân viên cần tìm kiếm: ");
                    String eSearch = sc.nextLine();
                    seachInfoEmploye(list, eSearch);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        while (true);
    }

    public static void menu() {
        System.out.println("=========MENU==========");
        System.out.println("1. Nhập vào số lượng nhân viên n. ");
        System.out.println("2. Hiển thị danh sách. ");
        System.out.println("3. Xem thông tin nhân viên theo mã nhân viên. ");
        System.out.println("4. Tìm kiếm (tương đối) nhân viên theo tên nhân viên.");
        System.out.println("5. Thoát chương trình!");
    }

    public static void inputData(List<Employe> listNV, int n) {
        System.out.println("Nhập vào thông tin nhân viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ: " + (i + 1));
            Employe e = new Employe();
            e.inputDataEmploye();
            listNV.add(e);
        }
    }

    public static void displayData(List<Employe> listNV) {
        System.out.println("Danh sách nhân viên: ");
        for (Employe e : listNV) {
            e.displayDataEmploye();
            System.out.println();
        }
    }

    public static void checkInfoEmploye(List<Employe> listNV, String employCodeCheck) {
        for (Employe e : listNV) {
//            if (Objects.equals(e.getEmployeCode(), employCodeCheck)) {
//                e.displayDataEmploye();
//            }


//            else (có vấn đề){
//                System.out.printf("Không tìm thấy nhân viên có mã nhân viên %s",employCodeCheck);
//                System.out.println();
//            }

            if (employCodeCheck.equals(e.getEmployeCode())) {
                e.displayDataEmploye();
                break;
            }
            else {
                System.out.printf("Không tìm thấy nhân viên có mã nhân viên %s",employCodeCheck);
                System.out.println();
            }
        }
    }

    public static void seachInfoEmploye(List<Employe> listNV, String employeCodeSearch){
        for (Employe e:listNV) {
            if (e.getFullName().contains(employeCodeSearch)){
                e.displayDataEmploye();
            }
        }
    }
}
