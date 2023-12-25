package session05;

public class Student {
    // thuộc tính
    public String studentCode;
    public String studentName;
    public int age;

    // phương thức khởi tạo: -> khởi tạo các giá trị ban đầu cho class
    public Student(){
    }

    public Student(String studentCode, String studentName, int age){
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
    }

    // phương thức khác:
    public void test(){
        System.out.println("Chúc bạn "+studentName+" thi tốt! <3");
    }
}
