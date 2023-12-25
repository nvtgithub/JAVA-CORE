package session05;

import java.util.Scanner;

public class Cat {
    private String catName;
    private int age;
    private String color;
    private Boolean sex;

    public Cat() {
    }

    public Cat(String catName, int age, String color, Boolean sex) {
        this.catName = catName;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void hello() {
        System.out.println(catName + " Xin chào!!!");
    }

    public void display() {
        System.out.println("Thông tin");
        System.out.println("Tên là: " + catName);
        System.out.println("Tuổi là: " + age);
        System.out.println("Màu lông là: " + color);
        System.out.println("Màu lông là: " + color);
        System.out.println("Giới tính" + (sex ? "Mèo đực" : "Mèo cái"));
//        if(sex){
//            System.out.println("Mèo đực");
//        } else {
//            System.out.println("Mèo cái");
//        }
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên mèo: ");
        catName = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập màu lông: ");
        color = sc.nextLine();
        System.out.println("Nhập vào giới tính: ");
        sex = Boolean.parseBoolean(sc.nextLine());
    }
}
