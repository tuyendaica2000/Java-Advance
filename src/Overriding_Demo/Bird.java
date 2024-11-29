package Overriding_Demo;

public class Bird extends Animals{
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Bặp bặp");
    }

    @Override
    public void makeSound() {
        System.out.println("Líu lo");
    }
}
