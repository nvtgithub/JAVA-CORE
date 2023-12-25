package session03;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao mang
        int[][] arr = new int[3][3];

        //Nhap mang
        System.out.println("Nhap mang: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // In ra mang
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        // tong cac phan tu
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Tong cac phan tu la: " + sum);

        // in ra duong cheo chinh
        System.out.println("Đường chéo chính của ma trận là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.printf("%3d", arr[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }

        // in ra duong cheo phu
        System.out.println("Đường chéo phụ của ma trận là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == arr.length - 1) {
                    System.out.printf("%3d", arr[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }

        // in ra duong vien ma tran
        System.out.println("Đường viền ma trận là: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0) | (j == 0) | (i == arr.length - 1) | (j == arr.length - 1)) {
                    System.out.printf("\t%d", arr[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
}
