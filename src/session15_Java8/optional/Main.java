package session15_Java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student std1 = null;
    }

    public static Student findStudentById(int id) {
        Optional<Student> student = Optional.of(new Student());
        return student.orElse(null);
    }
}
