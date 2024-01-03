package session15_Java8.lambda;

public class Demo03 {
    public static void main(String[] args) {
        IDemo03 iDemo03 = name -> System.out.println(name);

        // Dùng method references ->
        IDemo03 iDemo04 = System.out::println;

        iDemo03.hello("hí anh em!");
    }
}
