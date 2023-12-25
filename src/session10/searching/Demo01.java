package session10.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Nguyen Van Tien", 10));
        list.add(new Student(2,"Ngo Thi Ngoc Anh", 9));
        list.add(new Student(3,"Nguyen Quang Huy", 8));

        // tìm kiếm sv theo mã sv
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên cần tìm kiếm: ");
        int code = Integer.parseInt(sc.nextLine());

        boolean flag = false;
        for (Student std : list) {
            if(std.getStudentCode() == code){
                System.out.println(std.getStudentName());
                flag = true;
            }
//            else
//                flag = false;
        }
        if(!flag){
            System.out.println("Không tìm thấy sv");
        }
    }
}
