package session15_Java8.default_method;

public class Cal implements ICal{
    @Override
    public double calculate(int a) {
        return a*a-a;
    }
}
