package session07;

public class Person {
    private String fullName;
    private int age;
    private boolean sex;

    public Person() {
    }

    public Person(String fullName, int age, boolean sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void hello() {
        System.out.println(fullName + " Xin chào!");
    }
}
