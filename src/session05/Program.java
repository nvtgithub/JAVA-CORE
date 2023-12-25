package session05;

public class Program {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ class Student
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentCode = "646241";
        student1.studentName = "Nguyễn Văn Tiến";
        student1.age = 22;

        student2.studentCode = "646021";
        student2.studentName = "Ngô Thị Ngọc Ánh";
        student2.age = 22;

        // st1
        System.out.println("Mã sinh viên của student 1 là: "+student1.studentCode);
        System.out.println("Tên của sinh viên của student 1 là: "+student1.studentName);
        System.out.println("Tuổi của sinh viên của student 1 là: "+student1.age);

        System.out.println("-----------------------------------");

        // st2
        System.out.println("Mã sinh viên của student 2 là: "+student2.studentCode);
        System.out.println("Tên của sinh viên của student 2 là: "+student2.studentName);
        System.out.println("Tuổi của sinh viên của student 2 là: "+student2.age);

        // Gọi phương thức st1
        System.out.println("---------");
        student1.test();

        Student student3 = new Student("646464","Nguyễn Thanh Vân", 20);
        System.out.println("Mã sinh viên của student 3 là: "+student3.studentCode);
        System.out.println("Tên của sinh viên của student 3 là: "+student3.studentName);
        System.out.println("Tuổi của sinh viên của student 3 là: "+student3.age);
        System.out.println("----------");
    }
}
