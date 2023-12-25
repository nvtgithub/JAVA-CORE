package session06;

import java.util.Scanner;

public class Employe {
    private String employeCode;
    private String fullName;
    private int age;
    private Boolean sex;
    private float salary;
    private String phone;

    public Employe() {
    }

    public Employe(String employeCode, String fullName, int age, Boolean sex, float salary, String phone) {
        this.employeCode = employeCode;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.phone = phone;
    }

    public String getEmployeCode() {
        return employeCode;
    }

    public void setEmployeCode(String employeCode) {
        this.employeCode = employeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputDataEmploye() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mã nhân viên: ");
        employeCode = sc.nextLine();
        System.out.println("Họ và tên: ");
        fullName = sc.nextLine();
        System.out.println("Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Giới tính: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Lương: ");
        salary = Float.parseFloat(sc.nextLine());
        System.out.println("Số điện thoại: ");
        phone = sc.nextLine();
    }

    public void displayDataEmploye() {
        System.out.println("Mã nhân viên: " + employeCode);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lương: " + salary);
        System.out.println("Số điện thoại:" + phone);
    }
}
