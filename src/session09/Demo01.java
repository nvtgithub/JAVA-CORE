package session09;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // Try catch
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int num1 = 0;

        // Check num1 phải là số nguyên
        do {
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("num1 không phải số. Nhập lại!!");
            }
        } while (true);

        // check num2 là số nguyên và khác 0
        System.out.println("Nhập vào số thứ hai: ");
        int num2 = 0;
            do {
            try {
                num2 = Integer.parseInt(sc.nextLine());
                if (num2 == 0) {
                    System.err.println("num 2 phải khác 0. Nhập lại!!!");
                } else
                    break;
            } catch (Exception e) {
                System.err.println("num2 không phải là số. Nhập lại!!");
            }
        } while (true);

/*        do {
            try{
                num2 = Integer.parseInt(sc.nextLine());
                if(num2 == 0){
                    System.err.println("num 2 phải khác 0. Nhập lại!!!");
                }
            } catch (Exception e){
                System.err.println("num2 không phải là số. Nhập lại!!");
            }
        } while (num2 == 0);
      */

        // Check phép chia 1 số cho 0
        try {
            System.out.println("Kết quả chia: " + num1 / num2);
        } catch (Exception e) {
            System.err.println("không có phép chia cho số 0");
        } finally {
            System.out.println("đây là finally");
        }
        System.out.println("done!!");
    }
}
