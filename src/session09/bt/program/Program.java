package session09.bt.program;

import session09.bt.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        do {
            System.out.println("======MENU=====");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. In ra danh sách");
            int i = 0;
            switch (i) {
                case 1:
                    do {
                        Book book = new Book();
                        book.inputData();
                        System.out.println("Muốn nhập tiếp không (1. Có) hoặc (2. Không)");
                        int check = Integer.parseInt(sc.nextLine());
                        if (check == 2) {
                            break;
                        }
                    } while (true);
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
