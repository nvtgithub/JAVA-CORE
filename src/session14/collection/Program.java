package session14.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //add()
        list.add("Nguyen Tien");

        //collection.add()
        Collection<String> collection = new ArrayList<>();
        collection.add("Tien Nguyen");

        //Duyệt phần tử
        for (String s : list) {
            System.out.println(s);
        }

        // Xoá toàn bộ phần tử: clear()
        collection.clear();

        // Kiểm tra trong list có chứa phần tử: contain()
        System.out.println(list.contains("No")); // -> False
        System.out.println(list.equals("a")); // -> có thể sai khi mà so sánh 1 list với 1 phần tử trong list => dùng list.equals(collection)

        // remove() -> có 2 TH: 1 là truền 1 đối tươg cụ thể, 2 là truyền index
//        list.remove("Nguyen Tien");
//        list.remove(1);

        // sửa theo vị trí
        list.set(0, "New Name");

        // Linked
    }
}
