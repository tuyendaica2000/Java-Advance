package Abstract_Demo;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        rect.draw();
        System.out.println("   ");
        circle.draw();

    }
}
