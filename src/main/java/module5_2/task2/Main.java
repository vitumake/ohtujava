package module5_2.task2;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList list = new ThreadSafeList(100);
        Thread[] threads = new Thread[10];

        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    list.addValue((int)(Math.random()*101)+1);
                    System.out.println("Added value: " + list.getValue(list.getSize()-1));
                }
            });
            threads[i].start();
        }
        System.out.println("List size: " + list.getSize());
    }
}
