package session15_Java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------");
        list.forEach(System.out::println);
        System.out.println("---------");

        // lambda trong for list
        list.forEach(item -> System.out.println(item));
    }
}
