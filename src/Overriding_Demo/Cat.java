package Overriding_Demo;

public class Cat extends Animals{
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("chóp chép");
    }

    @Override
    public void makeSound() {
        System.out.println("Meoowww");
    }
}
