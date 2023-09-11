package module3_2.task3;

import module3_2.task2.*;

public class ElectricCar extends AbstractVehicle implements ElectricVehicle {
    
    private int batteryCharge = 0;

    public ElectricCar(String typeName, String fuelType, String color) {
        super(typeName, fuelType, color);
    }

    public void charge() {
        System.out.println("Charging battery...");
        batteryCharge = 100;
    }

    @Override
    public void start() {
        if(batteryCharge>0) System.out.println("Starting " + typeName + "...");
        else System.out.println("Battery is dead. Please charge.");
    }
}
