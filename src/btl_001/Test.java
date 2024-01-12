package btl_001;

import btl_001.model.Category;
import btl_001.service.CategoryService;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        boolean b = false;
//        do {
//            try {
////                Scanner sc = new Scanner(System.in);
//                boolean bn = Boolean.parseBoolean(String.valueOf(sc.nextBoolean()));
//
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input!");
//            }
//        } while (true);

//        do {
//            String a = sc.next();
//            if(!a.startsWith("B")){
//                System.out.println("SAi - B");
//            } else {
//                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{4}$");
//                Matcher check = pattern.matcher(a);
//                if(!check.matches()){
//                    System.out.println("Loii -2 ");
//                } else
//                    break;
//            }
////        } while (true);
//        CategoryService categoryService = new CategoryService();
//        List<Category> list = categoryService.getAllFromFile();
//        boolean flag = false;
//        System.out.println("\t\t\t\tDANH SÁCH THỂ LOẠI");
//        System.out.printf("\t\t\t| %-2s | %-18s |%n", "- ID -", "--Tên thể loại--");
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).isStatus()) {
//                list.get(i).output2();
//            }
//        }
//        System.out.print("Chọn ID từ danh sách trên. Bạn chọn: ");
//        int id = 0;
//        do {
//            try {
//                id = Integer.parseInt(sc.nextLine());
//            } catch (Exception e) {
//                System.out.println("ID bạn chọn không hợp lệ! ");
//            }
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i).isStatus()) {
//                    if (id == list.get(i).getId()) {
//                        flag = true;
//                    }
//                }
//            }
//            if (!flag) {
//                System.out.print("Nhập lại: ");
//            } else {
//                System.out.println("ok");
//                break;
//            }
//        } while (true);
//
//    }
//        System.out.printf("\t\t\t\t\t|------------------------------------------------------------------------------------------------------------------------------|%n");
//        System.out.printf("\t\t\t\t\t|------------- ❤️Danh sách Sách❤️----------------|%n");
//        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
//        System.out.printf("\t\t\t\t\t| %-6s | %-20s | %-20s | %-20s| %-6s| %-20s |%-6s |%n","ID","Tiêu đề","Tác giả","Nhà xuất bản","Năm xuất bản","Mô tả","Mã thể loại");
//        System.out.printf("\t\t\t\t\t|-------------------------------------------------|%n");
//        System.out.printf("\t\t\t\t\t*-------------------------------------------------*%n");
        List<Category> list = new ArrayList<>();
        list.add(new Category(1,"con cho",true));
        list.add(new Category(1,"con meo",true));
        list.add(new Category(1,"ssss",true));
        list.add(new Category(1,"ssff",true));
//       for (Category category:list){
//           if()
//       }
//        if(str1.contains("cho")){
//            System.out.println("có");
//        } else
//            System.out.println("k");


    }
}
