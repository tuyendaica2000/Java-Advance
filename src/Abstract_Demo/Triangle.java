package Abstract_Demo;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " Triangle");
    }
}
