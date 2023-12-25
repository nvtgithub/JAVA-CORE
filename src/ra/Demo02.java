package ra;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập số nguyên a: ");
        a = Integer.parseInt(sc.nextLine());

        if(a%2 == 0){
            System.out.println("Số bạn nhập là: " + a + " chia hết cho 2");
        } else {
            System.out.println("Số bạn nhập là: " + a + " không chia hết cho 2");
        }
    }
}
