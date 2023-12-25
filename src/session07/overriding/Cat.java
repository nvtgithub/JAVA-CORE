package session07.overriding;

public class Cat extends Animal{
//    public void eat(){
//        System.out.println("Mèo đang ăn nè");
//        super.eat();
//    }

    @Override
    public void eat() {
        System.out.println("mèo đang ăn nè");
        super.eat();
    }
}
