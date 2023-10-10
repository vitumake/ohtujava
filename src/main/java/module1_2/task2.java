package module1_2;

import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] vals = new double[2];
        System.out.println("Give length of first leg");
        vals[0] = scanner.nextDouble();
        System.out.println("Give length of second leg");
        vals[1] = scanner.nextDouble();
        scanner.close();
        System.out.println("The length of the hypotenuse is: " + Math.sqrt(Math.pow(vals[0], 2)+Math.pow(vals[1], 2)));
    }
}
