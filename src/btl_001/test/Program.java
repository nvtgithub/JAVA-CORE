package btl_001.test;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Test ký tự: ");
            String str = sc.nextLine();
            System.out.println("1. Yes or 2.No");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 2 )
                break;
        } while (true);

    }
}
