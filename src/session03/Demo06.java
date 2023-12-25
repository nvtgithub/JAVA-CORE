package session03;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showMenu();
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Nhập vào số thứ nhất: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào số thứ hai: ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.printf("%d + %d = %d", a, b, tinhTong(a, b));
                break;
            case 2:
                break;
            default:
                System.out.println("Lựa chọn sai!");
        }
    }

    //Dinh nghia phuong thuc
    public static int tinhTong(int a, int b) {
        // kiem thu de hon
        int tong = a + b;
        return tong;

        // return a+b;
    }

    public static void showMenu(){
        System.out.println("=====MENU=====");
        System.out.println("1. Tính tổng 2 số");
        System.out.println("2. Tìm số lớn nất trong 3 số nhập vào");
        System.out.println("Nhập vào lựa chọn");
    }
}
