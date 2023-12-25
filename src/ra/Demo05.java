package ra;

public class Demo05 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 11; i++) {
            if (i == 10){
                System.out.print(i +".");
            } else {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        for (int j = 10 ; j >= 0; j--){
            if (j == 0) {
                System.out.print(j+ ".");
            } else {
                System.out.print(j +";");
            }
        }
    }
}
