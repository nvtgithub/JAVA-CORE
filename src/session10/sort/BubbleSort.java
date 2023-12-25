package session10.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Sắp xếp nổi bọt
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 1, 3, 4, 6, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    // đổi vị trí
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
}
