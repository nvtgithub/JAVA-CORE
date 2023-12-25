package session11.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        // không chấp nhận phần tử trùng lặp
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        for (String item : set) {
            System.out.println(item);
        }

    }
}
