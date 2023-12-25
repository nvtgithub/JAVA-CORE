package session10.bt;

import java.util.Scanner;

public class Student implements IStudent{
    private int studentCode;
    private String studentName;
    private double avgMark;

    public Student() {
    }

    public Student(int studentCode, String studentName, double avgMark) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.avgMark = avgMark;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        studentCode = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ tên: ");
        studentName = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        avgMark = Double.parseDouble(sc.nextLine());

    }

    @Override
    public void displayData() {
//        System.out.println("Mã sinh viên: " +studentCode);
//        System.out.println("Họ tên: "+studentName);
//        System.out.println("Điểm trung bình: "+avgMark);
//        System.out.println("-----------");
        System.out.println(toString());
        System.out.println("--------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                ", avgMark=" + avgMark +
                '}';
    }
}
