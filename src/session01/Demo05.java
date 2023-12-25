package session01;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String str;

        System.out.println("Nhập vào 1 nguyên dương số bất kỳ: ");
        number = sc.nextInt();
        if ((number % 3 ==0) & (number % 5 == 0)){
            str = "Chia hết cho cả 3 và 5";
        } else if ((number % 3 ==0 ) & (number % 5 != 0)) {
            str = "Chia hết cho 3 nhưng không chia hết cho 5";
        } else if ((number % 3 !=0 ) & (number % 5 == 0)) {
        str = "Chia hết cho 5 nhưng không chia hết cho 3";
        } else {
            str = "Không chia hết cho 3 và 5";
        }
        System.out.println(str);
    }

}
