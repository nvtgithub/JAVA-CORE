package ra;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soNguyen;
        System.out.println("Nhập số nguyên: ");
        soNguyen = Integer.parseInt(sc.nextLine());
        System.out.println("Số nguyên vừa nhập là: " + soNguyen);

        float soThuc;
        System.out.println("Nhập số thực: ");
        soThuc = Float.parseFloat(sc.nextLine());
        System.out.println("Số nguyên vừa nhập là: " + soNguyen);

        String str;
        System.out.println("Nhập ký tự: ");
        str = sc.nextLine();
        System.out.println("Ký tự là: " + str);
    }
}
