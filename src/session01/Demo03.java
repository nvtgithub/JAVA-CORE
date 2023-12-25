package session01;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // Tính chu vi và diện tích hình vuông

        // Nhập vào chiều dài
        Scanner sc = new Scanner(System.in);
        double height;
        System.out.println("Nhập vào chiều dài hình vuông: " );
        height = sc.nextDouble();
        System.out.println("Hình vuông có chiều dài : " + height);
        System.out.println("Chu vi hình vuông là: " + (height*4));
        System.out.println("Diện tích  hình vuông là: " + (height*height));
    }
}
