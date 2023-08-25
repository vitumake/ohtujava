package module1;

import java.util.Scanner;
import java.util.Arrays;

public class task3 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vals = new int[3];

        for(int i=0; i < vals.length; i++) {
            System.out.println("Give the " + (i+1) + " number:");
            vals[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(
            "The sum of the numbers is " + Arrays.stream(vals).sum() + "\n" +
            "The product of the numbers is " + Arrays.stream(vals).reduce((i, j) -> i * j).getAsInt() + "\n" +
            "The average of the numbers is " + Arrays.stream(vals).average().getAsDouble()
        );
    }
}
