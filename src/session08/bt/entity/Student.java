package session08.bt.entity;

import session08.bt.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Mã sinh viên: ");
        studentId = sc.nextLine();
        System.out.println("Nhập Họ và tên: ");
        studentName = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm Toán: ");
        diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm Hoá: ");
        diemHoa = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm Lý: ");
        diemLy = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ và tên: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Hoá: " + diemHoa);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Trung bình: " + diemTB);
        System.out.println("Tình trạng sinh viên: " + (checkPassFail() ? "ĐÃ ĐỖ!!!" : "TRƯỢT"));
        System.out.println("----------");
    }

    public float tinhDiemTB() {
        return diemTB = (diemToan + diemHoa + diemLy) / 3;
    }

    public boolean checkPassFail() {
        if (diemTB > IStudent.MARK_PASS) {
            return true;
        }
        return false;
    }
}
