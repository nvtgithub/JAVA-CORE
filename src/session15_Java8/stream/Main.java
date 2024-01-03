package session15_Java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // tính tổng các số chia hết cho 2
        int sum = 0;
        for (Integer i : list) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // dùng stream
        long count = list.stream().filter(num->num%2==0).count();
        System.out.println(count);
    }
}
