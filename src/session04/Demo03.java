package session04;

public class Demo03 {
    public static void main(String[] args) {
        StringBuilder fullName = new StringBuilder();
        StringBuilder address = new StringBuilder("Hà Nội");

            // append() => thêm chuỗi
        address.append(" Nam Từ Liêm");

            // insert()
        // fullName = "Nguyen Van" // =>Không gán được
        fullName.append(" Van"); // =>Van
        fullName.insert(0, "Nguyen"); // => Nguyen Van
        fullName.insert(fullName.length()," Tien");// Nguyen Van Tien

            // delete() =>  xoá từ vị trí index -> index
        fullName.delete(10,11); // => Nguyen VanTien
        fullName.delete(6,10);  // =>NguyenTien

            // reverse()
//        fullName.reverse(); // =>neitnaV ...
        System.out.println(fullName);
        System.out.println(address);
    }
}
