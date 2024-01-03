package session15_Java8.default_method;


//@FunctionalInterface public interface ICal {
 // -> sẽ lỗi bởi vì funtionalInterface chỉ có duy nhất 1 phương thức trừu tượng
    public interface ICal {
        // phương thức trìu tượng
    double calculate(int a);

    // Java 8: cho phép dùng method k trừu tượng trong interface
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
