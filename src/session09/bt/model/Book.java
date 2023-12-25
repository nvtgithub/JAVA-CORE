package session09.bt.model;

import java.util.Scanner;

public class Book implements IBook {
    private String bookId;
    private String bookName;

    private double price;
    private String author;

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookId, String bookName, double price, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập mã sách: ");
            try {
                bookId = sc.nextLine();
                if (bookId.charAt(0) == 'B') {
                    if (bookId.length() == 4) {
                        break;
                    } else {
                        System.out.println("Mã không hợp lệ. Mã phải đủ 4 ký tự! Nhập lại!!");
                    }
                } else {
                    System.err.println("Mã không hợp lệ! Mã bắt đầu bằng ký tự 'B'. Nhập lại!!");
                }

//                if(bookId.startsWith("B")){
//
//                }
            } catch (Exception e) {

            }

        } while (true);
    }

    @Override
    public void displayData() {

    }
}
