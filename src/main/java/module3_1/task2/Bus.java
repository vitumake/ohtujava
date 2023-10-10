package module3_1.task2;

import module3_1.Car;

public class Bus extends Car {

    private int passengers;

    public Bus(String type) {
        super(type);
    }

    public void passengerEnter(int passengers) {
        this.passengers += passengers;
    } 

    public void passengerExit(int passengers) {
        this.passengers -= passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Bus");
        bus.passengerEnter(10);
        bus.passengerExit(5);
        System.out.println(bus.getPassengers());
    }
}
