package session01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // Nhập họ và tên từ bàn phím, sau đó in ra màn hình console

        // Khởi tạo đối tượng scanner  để
        Scanner sc = new Scanner(System.in);
        String fullName;
        System.out.println("Nhập họ và tên: ");
        fullName = sc.nextLine();

        System.out.println("Xin chào " + fullName);

        // Nhập xuất với kiểu dữ liệu int
        System.out.println("Nhập vào tuổi: ");
        int age = sc.nextInt();
        System.out.println("Năm sinh của bạn là: " +(2023-age)  );

        // Nhập xuất với float
        System.out.println("Nhập vào chiều cao:");
        float height = sc.nextFloat();
        System.out.println("Chiều cao của bạn là: " + height) ;

        //

    }
}
