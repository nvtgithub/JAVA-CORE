package session03;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào các phần tủ mảng: ");
        int[][] arr = new int[2][2];
//        arr[0][0] = sc.nextInt();
//        arr[0][1] = sc.nextInt();
//        arr[1][0] = sc.nextInt();
//        arr[1][1] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%d][%d] = " , i, j);
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j] + " ");
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
