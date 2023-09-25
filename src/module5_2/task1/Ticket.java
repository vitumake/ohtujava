package module5_2.task1;

public class Ticket {
    private int available;

    public Ticket(int num) {
        this.available = num;
    }

    public int getAvailable() {
        return available;
    }

    public synchronized void reserve(int num) {
        if(num>available) {
            System.out.println("Not enough tickets available for " + Thread.currentThread().getName());
            return;
        }
        available-=num;
        System.out.println(Thread.currentThread().getName());
        System.out.println("Reserved " + num + " tickets");
    }
}
