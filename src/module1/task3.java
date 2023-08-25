package module1;

import java.util.Scanner;
import java.util.Arrays;

public class task3 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vals = new int[3];

        System.out.println("Give the first number:");
        vals[0] = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        vals[1] = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        vals[2] = Integer.parseInt(scanner.nextLine());

        System.out.println(
            "The sum of the numbers is " + Arrays.stream(vals).sum() + "\n" +
            "The product of the numbers is " + Arrays.stream(vals).reduce((i, j) -> i * j).getAsInt() + "\n" +
            "The avergae of the numbers is " + Arrays.stream(vals).average().getAsDouble()
            );
    }
}
