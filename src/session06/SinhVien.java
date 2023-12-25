package session06;

import java.util.Scanner;

public class SinhVien {
    private String msv;
    private String hoTen;
    private String sdt;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoTen, String sdt, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void inputDataSinhVien() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mã sinh viên: ");
        msv = sc.nextLine();
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Số điện thoại");
        sdt = sc.nextLine();
        System.out.println("Lớp: ");
        lop = sc.nextLine();
    }

    public void displayDataSinhVien() {
        System.out.println("Mã sinh viên: " + msv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Lớp: " + lop);
        System.out.println();
    }
}
