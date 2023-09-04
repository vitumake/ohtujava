package  module2_1.task4;

public class CarDriver {

public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        myCar.setCruise(100);
        System.out.println(myCar.getCruise());
        myCar.toggleCruise();
        myCar.setCruise(40);
    }
}