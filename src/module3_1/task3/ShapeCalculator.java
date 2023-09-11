package module3_1.task3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(10, 5);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(10, 5);

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " with parameters " + shape.getParameters() + " is " + shape.calculateArea());
        }
    }
}
