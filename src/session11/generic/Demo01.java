package session11.generic;

public class Demo01 {
    public static void main(String[] args) {
        Cal<String> cal = new Cal<>();
        cal.display("xin chào!");
        Cal<Number> call = new Cal<>();
        call.display(1);
    }
}
