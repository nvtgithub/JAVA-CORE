package session07.overloading;

public class Cal {
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloading (nạp chồng)
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
