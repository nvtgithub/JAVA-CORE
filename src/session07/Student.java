package session07;

public class Student extends Person{
    private String studentCode;
    public Student() {
    }

    public Student(String fullName, int age, boolean sex, String studentCode) {
        super(fullName, age, sex);
        this.studentCode = studentCode;
        // super() -> gọi lại constructor của obj Person. Hiện tại đang gọi đến Pesron 3 tham số
     }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void reLearn(){
        super.hello();
        // this.hello() ->
        System.out.println("Sinh viên tên"+getFullName()+"Mã sinh viên "+studentCode+ " đang học lại");
    }
}
