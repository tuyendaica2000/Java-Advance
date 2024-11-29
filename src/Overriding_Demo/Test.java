package Overriding_Demo;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Dog");
        d.makeSound();
        d.eat();
        System.out.println("Make Sound and Eat by: " + d.getName());

        System.out.println(" ");
        Bird b = new Bird();
        b.setName("Bird");
        b.makeSound();
        b.eat();
        System.out.println("Make Sound and Eat by: " + b.getName());

        System.out.println(" " );
        Cat c = new Cat();
        c.setName("Cat");
        c.makeSound();
        c.eat();
        System.out.println("Make Sound and Eat by: " + c.getName());
    }
}
