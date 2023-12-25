package session08.demoAbstract;

public abstract class Phone {
    // chứa các phương thức trìu tượng
    public abstract void call();

    // chứa phương thức bình thường
    public void sendMessage(){
        System.out.println("Xin chào!");
    }

    public Phone() {
    }
}
