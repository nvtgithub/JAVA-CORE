package session11.btdemo.service;

import session11.btdemo.model.Book;

public class BookService  implements IGeneric<Book> {
    @Override
    public void inputData(Book book) {
        System.out.println("Nhập mã sách: ");
    }

    @Override
    public void displayData(Book book) {
        System.out.println(".....");
    }
//    public void inputData(){
//        // Nhập thông tin
//        Book author = new Book();
//        System.out.println("");
//    }
//
//    public void displayData(){
//        // hiển thị thông tin tác giả
//
//    }
}
