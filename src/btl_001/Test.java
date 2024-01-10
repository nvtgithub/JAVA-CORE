package btl_001;

import btl_001.model.Category;
import btl_001.service.CategoryService;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap: ");
//        boolean b = false;
        do {
            try {
//                Scanner sc = new Scanner(System.in);
                boolean bn = Boolean.parseBoolean(String.valueOf(sc.nextBoolean()));

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            }
        } while (true);

    }
}
