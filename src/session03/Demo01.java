package session03;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // khai báo biến mảng chứa tuổi của sinh viên
        int[] ages = {18, 15, 20, 22};

        //truy cập phần tử thứ nhất
        System.out.println("Tuổi của sinh viên thứ nhất là: " + ages[0]);

        // khai báo mảng chứa tên sinh viên
        String[] studentName = new String[3];

        Scanner sc = new Scanner(System.in);
       for (int k = 0; k < studentName.length; k++){
           System.out.println("Nhập vào họ tên sinh viên thứ " + (k+1));
           studentName[k] = sc.nextLine();
       }
        System.out.println("Danh sách sinh viên là: (Vòng lặp for) ");
        for (int i = 0; i < studentName.length ; i++) {
            System.out.println(studentName[i]);
        }

        System.out.println("Danh sách sinh viên là: (Vòng lặp foreach) ");
        for (String j : studentName) {
            System.out.println(studentName[Integer.parseInt(j)]);
        }
    }
}
