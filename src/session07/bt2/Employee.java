package session07.bt2;

public class Employee {
    private String employeeCode;
    private String fullName;
    private double salary;
    private float workingday;

    public double tinhLuong(){
        double money = (double) salary *workingday;
        return money;
    }

}
