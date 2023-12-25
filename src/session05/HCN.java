package session05;

import java.util.Scanner;

public class HCN {
    private float chieuDai;
    private float chieuRong;

    public HCN() {

    }

    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        chieuDai = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        chieuRong = Float.parseFloat(sc.nextLine());
    }

    public void tinhDienTich() {
        double dienTich = (double) chieuDai * chieuRong;
        System.out.printf("Diện tích hình chữ nhật là: %.3f",dienTich);
        System.out.println();
    }

    public void tinhChuVi() {
        double chuVi = (double) (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi hình chữ nhật là: %.3f",chuVi);
        System.out.println();
    }
}
