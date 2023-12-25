package session11.generic;

import java.util.ArrayList;

public class TestDemo02 {
    public static void main(String[] args) {
        Demo02<String, String> list = new Demo02<>();
        list.setKey("Họ tên: ");
        list.setValue("Nguyễn Văn Tiến");
        System.out.println(list.toString());

        Demo02<Integer,String> list2 = new Demo02<>();
        list2.setKey(1);
        list2.setValue("Ngô Thị Ngọc Ánh");
        System.out.println(list2.toString());
    }
}
