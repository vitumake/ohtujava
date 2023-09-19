# Calculator

```java
public class Calculator {
    private int value;
    
    public Calculator() {
        this.value = 0;
    }

    // This method adds the given value to the value of the calculator and throws an IllegalArgumentException if the value is negative.
    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
        this.value += value;
    }

    // This method returns the value of the calculator.
    public int getValue() {
        return this.value;
    }

    // This method resets the value of the calculator to zero.
    public void reset() {
        this.value = 0;
    }
}
```

The class Calculator has a method add(int value) for adding to the calculator's value, a method getValue() for getting the value and a method reset() for resetting the value to zero.

Implement the class Calculator. The class must have a public parameterless constructor and the following methods: add(int value), getValue() and reset(). The method add(int value) throws an IllegalArgumentException if the parameter is negative.
