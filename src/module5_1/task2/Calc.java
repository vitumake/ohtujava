package module5_1.task2;

import java.util.List;

public class Calc extends Thread {
    List<Integer> values;
    int result;

    public Calc(List<Integer> list) {
        this.values = list;
    }

    public void run() {
        result = values.stream().reduce(0, (a, b)->a+b);
        System.out.println("Thread " + this.getName() + " result: " + result);
    }

    public int getResult() {
        return result;
    }
}
