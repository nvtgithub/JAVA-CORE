package session15_Java8.datetimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
//        String d1Str = d1.format(DateTimeFormatter.ISO_OFFSET_DATE);
        String d1Str2 = d1.format(DateTimeFormatter.ISO_DATE);

        System.out.println(d1);
//        System.out.println(d1Str);
        System.out.println(d1Str2);
    }
}
