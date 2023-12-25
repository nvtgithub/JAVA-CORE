package session08.demoAbstract;

public class SamSung extends Phone {

    public SamSung() {
    }

    public void send(){
        System.out.println("Hi lu");
        super.sendMessage();
    }

    @Override
    public void call() {
        System.out.println("SamSung nèee!!!");
    }

}
