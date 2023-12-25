package ra;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // Nhập vào ký tự, kiểm tra xem nó là nguyên âm hay phụ âm
        Scanner sc = new Scanner(System.in);

        String kyTu;
        System.out.println("Nhập vào ký tự");
        kyTu = sc.nextLine();

        switch (kyTu){
            case "u":
            case "e":
            case "o":
            case "a":
            case "i":
                System.out.println(kyTu + " Là nguyên âm");
                break;
            default:
                System.out.println(kyTu + " Là phụ âm");
                break;
        }
    }
}
