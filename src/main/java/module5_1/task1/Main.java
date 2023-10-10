package module5_1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] range = new int[2];

        System.out.print("Enter the lower bound: ");
        range[0] = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        range[1] = scanner.nextInt();

        Thread t2 = new Thread(new Counter(range,false));
        Thread t1 = new Thread(new Counter(range,true));

        t1.start();
        t2.start();

        scanner.close();
    }
}
