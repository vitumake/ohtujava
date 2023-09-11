package module3_2.task2;

public class VehicleDemo  {
    public static void main(String[] args) {
        Car car = new Car("car", "gasoline", "red");
        Bus bus = new Bus("bus", "diesel", "yellow");
        Motorcycle motorcycle = new Motorcycle("motorcycle", "gasoline", "black");

        AbstractVehicle[] vehicles = {car, bus, motorcycle};

        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            System.out.println(vehicle.getInfo());
            vehicle.stop();
            System.out.println();
        }
    }
}
