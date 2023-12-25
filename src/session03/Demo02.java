package session03;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // Khai báo mảng có 10 phần tử
        int[] nums = new int[10];

        //Nhập vào 10 phần tử
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            nums[i] = Integer.parseInt(sc.nextLine());
        }

        // In ra danh sách mảng
        System.out.println("Danh sách phần tử là: ");
        for (int j = 0; j < nums.length; j++) {
            if (j == 9) {
                System.out.print(nums[j]);
            } else {
                System.out.print(nums[j] + ",");
            }
        }

        // tính tổng phẩn tử mảng
        System.out.println("");
        int sum = 0;
        for (int s = 0; s < nums.length; s++) {
            sum += nums[s];
        }
        System.out.println("Tổng các phần tử mảng là: " + sum);

        // in ra các phần tử chia hết cho 2
        System.out.println();
        System.out.println("Các phần tử chia hết cho hai là: ");
        for (int k = 0; k < nums.length; k++) {
            if ((nums[k] > 0) & (nums[k] % 2 == 0)) {
                System.out.print(nums[k] + " ");
            }
        }

        // Tìm ra phần tử lớn nhất
        // int tg = nums[0];
        int max = nums[0];
        System.out.println();
        for (int m = 1; m < nums.length; m++) {
            if (nums[m] > max) {
                max = nums[m];
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
