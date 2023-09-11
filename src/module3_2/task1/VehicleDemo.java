package module3_2.task1;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("car", "gasoline", "red");
        Bus bus = new Bus("bus", "diesel", "yellow");
        Motorcycle motorcycle = new Motorcycle("motorcycle", "gasoline", "black");

        Vehicle[] vehicles = {car, bus, motorcycle};

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            System.out.println(vehicle.getInfo());
            vehicle.stop();
            System.out.println();
        }
    }
}
