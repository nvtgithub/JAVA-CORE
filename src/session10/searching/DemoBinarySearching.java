package session10.searching;

import java.util.Scanner;

public class DemoBinarySearching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // tìm kiếm nhị phân:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm: ");
        int num = Integer.parseInt(sc.nextLine());
        int mid;
        int low = 0;
        int high = arr.length - 1;
        boolean flag = false;
        while (low <= high) {
            // tìm mid ?
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                System.out.printf("Phần tử: %d ở vị trí %d ", num, mid);
                flag = true;
                break;
            }
            if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy phần tử: " + num + " trong mảng");
        }
    }
}
