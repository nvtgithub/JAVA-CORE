package ra;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhâp vào số nguyên từ 1 đến 10:");
        a = Integer.parseInt(sc.nextLine());

        switch (a){
            case 0:
                System.out.println("Số không!");
                break;
            case 1:
                System.out.println("Số một!");
                break;
            default:
                System.out.println("Số từ 1 đến 9");
                break;
        }
    }
}
