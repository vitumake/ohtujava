package module3_1.task3;

public class Circle extends Shape {
    private int radius;
    
    public Circle(int radius) {
        this.radius=radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI*radius*radius);
    }

    @Override
    public String getParameters() {
        return "radius: " + radius;
    }
}
