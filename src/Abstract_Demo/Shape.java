package Abstract_Demo;

public abstract class Shape {
    public Shape() {
    }

    private String color = "Red";

    public abstract void draw();

    public String getColor() {
        return color;
    }
}
