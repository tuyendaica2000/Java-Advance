package Overriding_Demo;

public class Dog extends Animals{
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }

    @Override
    public void eat() {
        System.out.println("Nhoằm nhoằm");
    }
}
