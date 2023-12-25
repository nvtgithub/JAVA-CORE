package session07.bt2;

public class Teacher extends Employee{
    private double ptSalary;
    private float ptWorkingDay;

    @Override
    public double tinhLuong() {
        double money = (double) ptWorkingDay*ptSalary;
        return super.tinhLuong() + money;
    }
}
