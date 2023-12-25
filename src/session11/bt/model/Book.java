package session11.bt.model;

import java.util.Scanner;

public class Book {
    private String id;
    private String name;
    private double price;

    public Book() {
    }

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách:");
        id = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        name = sc.nextLine();
        System.out.println("Nhập giá tiền:");
        price = Double.parseDouble(sc.nextLine());
    }

    public void displayData(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
