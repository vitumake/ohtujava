package module3_1.task3;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base=base;
        this.height=height;
    }

    @Override
    public int calculateArea() {
        return base*height/2;
    }

    @Override
    public String getParameters() {
        return "base: " + base + ", height: " + height;
    }
}
