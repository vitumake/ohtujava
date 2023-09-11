package module3_2.task1;

public class Car implements Vehicle {
    private String typeName;
    private String fuelType;
    private String color;

    public Car(String typeName, String fuelType, String color) {
        this.typeName = typeName;
        this.fuelType = fuelType;
        this.color = color;
    }

    public void start() {
        System.out.println("Starting " + typeName + "...");
    }

    public void stop() {
        System.out.println("Stopping " + typeName + "...");
    }

    public String getInfo() {
        return "This is a " + color + " " + typeName + " that runs on " + fuelType + ".";
    }
}
