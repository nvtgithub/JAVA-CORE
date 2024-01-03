package session15_Java8.lambda;

public class Program {
    public static void main(String[] args) {
        IDrawable iDrawable = new IDrawable() {
//            @Override
//            public void draw(String name) {
//                System.out.println("Xin chào!!!" + name);
//            }

            @Override
            public void draw1(String name, int age) {
                System.out.println(name + age);
            }

        };
//        iDrawable.draw("hi");
    }
}
