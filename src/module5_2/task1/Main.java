package module5_2.task1;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(10);
        Thread[] threads = new Thread[5];

        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    ticket.reserve((int)(Math.random()*5)+1);
                }
            });
            threads[i].start();
        }
    }
}
