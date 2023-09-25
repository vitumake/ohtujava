package module5_1.task2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        final int numValues = scanner.nextInt();
        scanner.close();
        List<Integer> values = new ArrayList<>(numValues);
        
        // Populate list
        for(int i=0; i<numValues; i++) {
            values.add((int)(Math.random()*101)+1);
        }

        // Create threads and divide list to sublists
        int numCores = Runtime.getRuntime().availableProcessors();
        Calc[] threads = new Calc[numCores<=numValues?numCores:numValues/2];
        int subListSize = Math.round((float)numValues/threads.length);
        for(int i=0; i<threads.length; i++) {
            List<Integer> subList = values.subList(i*subListSize, i!=threads.length-1?(i+1)*subListSize:numValues);
            threads[i] = new Calc(subList);
            threads[i].start();
        }

        // Wait for threads to finish
        for(Calc th : threads) {
            try {
                th.join();
            } catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            result+=th.getResult();
        }
        
        System.out.println("Result: " + result);
    }
}
