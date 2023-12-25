package session08.demoInterface;

public class HpPrinter implements IPrinter,IScanner {
    @Override
    public void print() {
        System.out.println("Máy in HP đang in");
    }

    @Override
    public void copy() {
        System.out.println("Máy in HP đang copy");
    }

    @Override
    public void scan() {

    }
}
