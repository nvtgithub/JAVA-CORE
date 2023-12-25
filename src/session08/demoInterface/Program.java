package session08.demoInterface;

public class Program {
    public static void main(String[] args) {
        IPrinter iPrinter = new HpPrinter();
        iPrinter.print();

        HpPrinter hpPrinter = new HpPrinter();
        hpPrinter.copy();

    }
}
