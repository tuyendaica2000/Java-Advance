package Abstract_Demo;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " Circle");
    }
}
