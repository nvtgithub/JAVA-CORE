package session15_Java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        List<Integer> list = integerStream.collect(Collectors.toList());
//        List<Integer> list2 = integerStream.toList();
//        .......
    }
}
