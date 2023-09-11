package module3_1.task1;

import module3_1.Car;

public class SportCar extends Car {

    public SportCar(String typeName) {
        super(typeName);
    }
    
    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            gasolineLevel-=5;
            speed+=25;
        } else {
            speed = 0;
        }
    }

    public static void main(String[] args) {
        SportCar car1 = new SportCar("Rx7");
        car1.fillTank();
        car1.accelerate();
        System.out.println(car1.getSpeed());
        System.out.println(car1.getTypeName());
        car1.decelerate(20);
        System.out.println(car1.getSpeed());
    }

}
