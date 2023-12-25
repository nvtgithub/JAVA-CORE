package ra;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======Tính chu vi và diện tích=====");
            System.out.println("1. Hình vuông");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("4. Hình chữ nhật");
            System.out.println("5. Thoát");
            System.out.println("Chọn (1-5)");

            int choice = Integer.parseInt(sc.nextLine());
            int x, y, z;

            switch (choice) {
                case 1:
                    HV();
                    break;
                case 2:
                    HTG();
                    break;
                case 3:
                    System.out.println("Xin chào! <3");
                    break;
                case 4:
                    HCN();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    System.out.println();
            }
        } while (true);
    }

    public static void HCN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn chọn hình chữ nhật");
        System.out.println("Nhập vào chiều dài: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào chiều rộng: ");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Chu vi hình vuông là: " + (x + y) * 2);
        System.out.println("Diện tích hình vuông là: " + x * y);
        System.out.println();
    }

    public static void HV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn chọn hình vuông");
        System.out.println("Nhập vào chiều dài: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Chu vi hình vuông là: " + x * 4);
        System.out.println("Diện tích hình vuông là: " + x * x);
        System.out.println();
    }

    public static void HTG() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn chọn hình tam giác");
        System.out.println("Nhập vào chiều dài 3 cạnh:  ");
        System.out.println("Cạnh a:");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Cạnh b:");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Cạnh c:");
        int z = Integer.parseInt(sc.nextLine());

        if ((x + y > z) & (x + z > y) & (y + z > x)) {
            System.out.println("Chu vi tam giác là: " + (x+y+z));
            System.out.println("Diện tích tam giác là: ");


        } else {
            System.out.println("3 cạnh không hợp lệ!");
        }
    }
}
