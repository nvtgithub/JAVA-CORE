package ra;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======Menu======");
            System.out.println("1.Món gà");
            System.out.println("2.Món bò");
            System.out.println("3.Món heo");
            System.out.println("4.Món thỏ");
            System.out.println("5.Món cá");
            System.out.println("6.Thoát");
            System.out.println("Mời bạn chọn (1-6)");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("GÀ");
                    break;
                case 2:
                    System.out.println("BÒ");
                    break;
                case 3:
                    System.out.println("HEO");
                    break;
                case 4:
                    System.out.println("THỎ");
                    break;
                case 5:
                    System.out.println("CÁ");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        } while(true);
    }
}
