package session15_Java8.lambda;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        String name1 = "Nguyen Tien";

//        IDrawable iDrawable =() -> {
//            System.out.println("Xin chào!!!");
//        };

      IDrawable iDrawable = (name, age) -> {
          System.out.println(name + age);
      };
    }
}
