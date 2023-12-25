package session01;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float diemToan,diemLy,diemHoa,diemVan,diemAnh,diemTB;

        System.out.println("Nhập vào điểm Toán: ");
        diemToan = sc.nextFloat();

        System.out.println("Nhập vào điểm Lý: ");
        diemLy = sc.nextFloat();

        System.out.println("Nhập vào điểm Hoá: ");
        diemHoa = sc.nextFloat();

        System.out.println("Nhập vào điểm Văn: ");
        diemVan = sc.nextFloat();

        System.out.println("Nhập vào điểm Anh: ");
        diemAnh = sc.nextFloat();

        diemTB = (diemToan + diemLy + diemHoa + diemVan + diemAnh)/5;
        System.out.println("Điểm trung bình của bạn là: " + diemTB);

        if(0 <= diemTB  & diemTB < 5) {
            System.out.println("Bạn xếp loại Yếu!");
        } else if (5<= diemTB & diemTB < 6.5) {
            System.out.println("Bạn xếp loại Trung bình!");
        } else if (6.5 <= diemTB & diemTB < 8 ) {
            System.out.println("Ban xếp loại Khá!");
        } else if (8<= diemTB & diemTB < 9 ){
            System.out.println("Bạn xếp loại Giỏi!");
        } else {
            System.out.println("Ban xếp loại Xuất sắc!");
        }
    }
}