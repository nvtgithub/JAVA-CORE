package session09;

import java.util.Scanner;

public class Demo02 {
    private int num;

    public void inputData() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập num: ");
            num = Integer.parseInt(sc.nextLine());
            if (num <= 0) {
                throw new Exception("num phải lớn hơn 0");
            }
        System.out.println("num là: " + num);
    }
}
