package module3_1.task3;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public int calculateArea() {
        return width*height;
    }

    @Override
    public String getParameters() {
        return "width: " + width + ", height: " + height;
    }
}
