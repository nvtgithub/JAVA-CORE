package btl_001.model;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements IEntity, Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sách:");

        // Id
        try{
            System.out.println("Nhập ID sách: ");
            id = sc.nextLine();
        }
        catch (Exception e){

        }

        System.out.println("Nhập id sách: ");
        id = sc.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        title = sc.nextLine();
        System.out.println("Nhập tác giả: ");
        author = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        publisher = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mô tả sách: ");
        description = sc.nextLine();

    }

    @Override
    public void output() {

        System.out.println("ID sách: " + id);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Nhà xuất bản: " + publisher);
        System.out.println("Năm xuất bản: " + year);
        System.out.println("Mô tả: " + description);
        System.out.println("Mã thể loại: " + categoryId);
    }
}
