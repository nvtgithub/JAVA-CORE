package session11.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        // kiểu dữ liệu theo cặp Key-Value, key không được trùng
        Map<String, String> list = new HashMap<>();
        list.put("Sv1: ", "Nguyễn Văn A");
        list.put("Sv2: ", "Nguyễn Văn B");
        list.put("Sv3: ", "Nguyễn Văn C");
        for (Map.Entry<String, String> entry : list.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer, String> list1 = new HashMap<>();
        list1.put(1, "Nguyễn Văn A");
        list1.put(2, "Nguyễn Văn B");
        list1.put(3, "Nguyễn Văn C");
        for (Map.Entry<Integer, String> entry : list1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
