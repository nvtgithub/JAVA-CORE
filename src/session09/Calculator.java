package session09;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số thứ nhất: ");
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Không hợp lệ. Phải là số nguyên! Nhập lại!!");
            }
        } while (true);


        do {
            System.out.println("Nhập số thứ 2: ");
            try {
                num2 = Integer.parseInt(sc.nextLine());
                break;
            } catch (ArithmeticException e) {
                System.err.println("Không hợp lệ. Phải là số nguyên! Nhập lại!!");
            }
        } while (true);
    }

    public void sum() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    public void div() throws Exception{

    }
}
