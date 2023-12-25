package yt;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
       /* System.out.println("\t Lùi vào 1 tab");
        System.out.println("\n Xuống dòng");
        System.out.println("Xin chào \"Dùng nháy kép\" ");

//cmt 1 dòng => shift + \
        *//* cmt nhiều dòng: => ctrl + shift + / *//*

        // Scanner
        System.out.println("Nhập tên: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Tên là: "+name );

        System.out.println("Nhập tuổi: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Tuổi là: ");
*/
        int a =0;
        int b= 10;

        try {
            int c= b/a;
            System.out.println("c= " + c);
        }
        catch (Exception e){
            System.out.println("Có lỗi rồi");
            e.printStackTrace();
        }
        finally {
            System.out.println("Có lỗi hay không vẫn chạy");
        }
        System.out.println("Đoạn code sau");
        System.out.println("Xin chào");
    }
}
