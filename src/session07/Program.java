package session07;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFullName("Nguyễn Văn Tiến");
        person.setAge(18);
        person.setSex(false);

        person.hello();

        // Khởi tạo đối tượng student
        Student student = new Student();

        student.setAge(18);
        student.setFullName("Ngô Thị Ngọc Ánh");
        student.setSex(false);

        student.hello();

        student.setStudentCode("646241");
        student.reLearn();
    }
}
