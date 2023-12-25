package session07.bt;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Tien", "Hà Nội");
        System.out.println(person.toString());
        Student student = new Student("Ngọc Ánh", "HD", "Java",1,500);
        System.out.println(student.toString());
    }
}
