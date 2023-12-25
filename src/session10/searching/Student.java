package session10.searching;

public class Student {
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

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }
}
