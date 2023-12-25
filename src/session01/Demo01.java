package session01;

public class Demo01 {
    public static void main(String[] args) {
        // để xuất ra màn hình
//        System.out.println("Hello World!");
//        String fullname = "Nguyen Van Tien";
//        System.out.print(fullname);

        // Khai báo biến kiểu int
        int soNguyen = 10;
        soNguyen = 100;
        System.out.println("Giá trị biến số nguyên là: " + soNguyen);
        // Khai báo kiểu sô thực
        float banKinh = 3.15F;
        System.out.println("Giá trị biến banKinh là: "+banKinh);
        //Khai báo biến kiểu double
        double chuVi = 3.3333;
        System.out.println("Giá trị của biến chuVi là: " + chuVi);
        // Kiểu string
        String fullName = "Nguyễn Văn A";
        System.out.println("Họ và tên là : " + fullName);

        // Khai báo hằng
        final double PI = 3.14;

        final String color = "#FFFFFF";
        System.out.println("Số pi là: " + PI);
        System.out.println("Mã màu là: " + color);
    }
}
