package btl_001.itf;

import btl_001.entity.IEntity;

import java.util.Scanner;

public class Book implements IEntity {

    // id: bắt đầu bằng 'B', độ dài 4 ký tự, duy nhất
    private String id;

    // title: 6-50 ký tự, duy nhất
    private String title;

    // author: not null
    private String author;

    // publisher: not null
    private String publisher;

    // year: từ 1970 và k lớn hơn 2023
    private int year;

    // description : not null
    private String description;

    // Lấy từ danh sách thể loại
    private int categoryId;

    public Book() {
    }

    public Book(String id, String title, String author, String publisher, int year, String description, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public void input() {
        // validate
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        id = sc.nextLine();
        System.out.println("Nhập tiêu đề: ");
        title = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        author = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        publisher = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn mã thể loại sách: ");
    }

    @Override
    public void output() {
        System.out.println("Mã sách: " + id);
        System.out.println("Tiêu đề sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Nhà xuất bản: " + publisher);
        System.out.println("Năm xuất bản: " + year);
        System.out.println("Mã thể loại: " + categoryId);
    }
}
