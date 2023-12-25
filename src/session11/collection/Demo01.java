package session11.collection;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove("B");

        List<String> deleted = new ArrayList<>();
        deleted.add("D");
        list.removeAll(deleted);
        for (String item:list) {
            System.out.println(item);
        }
    }
}
