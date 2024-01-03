package session14;

public class DemoMethodGeneric {
    public static <T> void printArrayElement(T[] arr1){
        for(T e:arr1){
            System.out.println(e);
        }
    }
}
