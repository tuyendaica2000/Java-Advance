package Overriding_Demo;

public class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(" Toi dang an ....");
    }

    public void makeSound() {
        System.out.println(" ..... ");
    }

    public void sleep() {
        System.out.println("ZzzzzZ");
    }
}
