package module2_1.task4;

public class Car {
        /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private boolean cruise = false;
    private int cruiseSpeed = 40;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
                                    // The reference is useful if you want to use parameter names that are
                                    // identical to instance variable names (and for more, later on)
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        cruise=false;
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        cruise=false;
        if (gasolineLevel > 0) { // Quite the odd car that loses all breaking when you run out of fuel.
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    public void toggleCruise() {
        cruise = cruise?false:true;
        if(cruise) runCruise();
    }

    public boolean setCruise(int val) {
        if(val>100 || val<40) {
            System.out.println("Invalid target speed.\nValue must be between 100 and 40 kmh"); 
            return false;
        } else {
            cruiseSpeed = val;
            if(cruise) runCruise();
            return true;
        }
    }

    private void runCruise() {
        if(speed>cruiseSpeed) {
            float step = (speed-cruiseSpeed)/5;
            while(speed>cruiseSpeed) {
                speed+=-step;
                System.out.println(typeName + ": speed is " + speed + " km/h");
            }
        } else {
            float step = (cruiseSpeed-speed)/5;
            while(speed<cruiseSpeed) {
                speed+=step;
                System.out.println(typeName + ": speed is " + speed + " km/h");
            } 
        }
    }

    public int getCruise() {
        return this.cruiseSpeed;
    }
}
