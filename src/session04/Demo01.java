package session04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // Khai báo biến chuỗi
        String fullName = "Nguyễn Văn Tiến";
        String address = " Hà Nội";

        // gán lại
        fullName = "Ngô Thị Ngọc Ánh";

        // Một số phương thức để thao tác với chuỗi
        System.out.println("Chuỗi vừa khai báo là: " + fullName);
        System.out.println("Số lượng ký tự trong chuỗi :" + fullName.length());
            // chartAt() => Return the character at the specified index (position)
        System.out.println("Vị trí 1: " +fullName.charAt(0));
            // concat() =>
        String fullnameAddress = fullName.concat(address);
        System.out.println("fullnameAddress: " + fullnameAddress);

            // toUpCase() => Viết hoa

            // toLowCace() = > Viết thường

            // trim() =>  bỏ khoảng trắng ở 2 đầu chuỗi ký tự khi nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ tên: ");
        fullName = sc.nextLine();
        System.out.println("fullname mới: "+fullName.trim());

            // equal() = > So sánh chuỗi(cả hoa và thường), return true/false
        String s1 = "B11";
        String s2 = "B11";
        if(s1.equals(s2)){
            System.out.println("Chuỗi giống nhau");
        } else {
            System.out.println("Chuỗi khác nhau");
        }

            // equalsIgnoreCase() => so sánh chuỗi (k hoa thường)
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Chuỗi giống nhau");
        } else {
            System.out.println("Chuỗi khác nhau");
        }

        // compareTo() => so sánh giá trị ký tự bảng mã ascii trả về kiểu int
        String s3 = "Nguyen";
        String s4 = "Nguyen";
        String s5 = "Nguyen Van";
        String s6 = "nguyen";
        System.out.println(s3.compareTo(s4)); // => 0
        System.out.println(s3.compareTo(s5)); // => -4
        System.out.println(s5.compareTo(s2)); // => 12 ?
        System.out.println(s3.compareToIgnoreCase(s6)); // => 0

            // contains()
        s5 = s5.toLowerCase();
        if(s5.contains("nguyen")){ // => khong  //=> s5 = s5.toLowerCase(); => có
            System.out.println("Co");
        } else {
            System.out.println("khong");
        }

        // Người dùng nhập vào mã sản phẩm, ycau có ký tự B
        System.out.println("Nhập vào mã sản phẩm: ");
        String msp = sc.nextLine();
       do {
           System.out.println("Nhập vào mã sản phẩm: ");
           msp = sc.nextLine();
       } while (!msp.startsWith("B"));
    }
}
