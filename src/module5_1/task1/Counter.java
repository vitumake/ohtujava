package module5_1.task1;

public class Counter implements Runnable {
    private int count;
    private int[] range = new int[2];

    public Counter(int[] range,boolean isEven) {
        this.range = range;
        if(range[0]%2 != 0) range[0]++;
        if(!isEven) range[0]--;
        count = range[0];
    }

    public void run() {
        while(count <= range[1]) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Val: " + count);
            count+=2;
        }
    }
}
