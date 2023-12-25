package session04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào họ tên: "); // Nhập không có ký tự số
        String fullName = sc.nextLine();
        Pattern patternName = Pattern.compile("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$");
        Matcher check = patternName.matcher(fullName);

        System.out.println(check.matches());

//       // Xây dựng REGEX
        // 03...|09...|08...
//        System.out.println("Nhập vào phone");
//        String phone = sc.nextLine();
//        Pattern patternPhone = Pattern.compile("((03|08|09])+[0-9]{8})");
//        Matcher check = patternPhone.matcher(phone);
//
//        System.out.println(check.matches());
    }
}
