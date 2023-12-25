package session11.bt2.model;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Product() {
    }

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println(" Nhập tên sp: ");
        name = sc.nextLine();
        System.out.println("Nhập giá tiền: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        qty = Integer.parseInt(sc.nextLine());
    }

    public void displayData() {
        System.out.println("Mã sản phẩm: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá tiền: " + price);
        System.out.println("Số lượng: " + qty);
        System.out.println("----------");
    }
}

