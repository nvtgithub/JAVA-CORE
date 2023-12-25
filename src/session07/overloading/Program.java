package session07.overloading;

public class Program {
    public static void main(String[] args) {
        Cal cal = new Cal();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1,2,3));
    }
}
