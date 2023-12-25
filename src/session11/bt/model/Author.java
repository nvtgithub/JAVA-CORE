package session11.bt.model;

import java.util.Scanner;

public class Author {
    private int code;
    private String name;

    public Author() {
    }

    public Author(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tác giả: ");
        code = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên tác giả: ");
        name = sc.nextLine();
    }

    public void displayData() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
