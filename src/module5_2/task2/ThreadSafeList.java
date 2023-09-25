package module5_2.task2;

import java.util.ArrayList;

public class ThreadSafeList extends ArrayList<Integer> {
    public ThreadSafeList(int num) {
        super(num);
    }

    public synchronized void addValue(int value) {
        this.add(value);
    }

    public synchronized int getValue(int index) {
        return this.get(index);
    }

    public int getSize() {
        return this.size();
    }
}
