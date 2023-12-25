package session07.overriding;

import session05.Dog;

public class Program {
    public static void main(String[] args) {
        Animal meo = new Cat();
        meo.eat();
        Cat meo1 = new Cat();
        meo1.eat();
    }
}
