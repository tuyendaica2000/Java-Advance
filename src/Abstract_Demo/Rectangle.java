package Abstract_Demo;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " Rectangle");
    }
}
