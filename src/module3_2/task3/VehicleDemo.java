package module3_2.task3;

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ElectricCar = new ElectricCar("ElectricCar", "electricity", "red");
        ElectricMotorcycle ElectricMotorcycle = new ElectricMotorcycle("ElectricMotorcycle", "electricity", "yellow");

        ElectricVehicle[] vehicles = {ElectricCar, ElectricMotorcycle};

        for (ElectricVehicle vehicle : vehicles) {
            vehicle.start();
            System.out.println(vehicle.getInfo());
            vehicle.stop();
            System.out.println();
        }
    }
}
