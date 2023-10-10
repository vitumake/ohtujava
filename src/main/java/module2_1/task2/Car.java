package module2_1.task2;

public class Car {
        /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    protected float speed;
    protected float gasolineLevel;
    private String typeName;
    private int gasolineCapacity;
    private int topSpeed;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
                                    // The reference is useful if you want to use parameter names that are
                                    // identical to instance variable names (and for more, later on)
    }

    public Car(int topSpd, int gasCap) {
        this.gasolineCapacity = gasCap;
        this.topSpeed = topSpd;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    public float getSpeed() {
        return speed;
    }
    public String getTypeName() {
        return typeName;
    }
    public void fillTank() {
        gasolineLevel = 100;
    }
    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void setSpeed(float val) {
        this.speed=val;
    }
}
