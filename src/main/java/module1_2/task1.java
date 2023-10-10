
package module1_2;

import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give temeprature in fahrenheit: ");
        double val = scanner.nextFloat();
        System.out.printf("%1.2f \u00B0F is %1.2f \u00B0C", val, (val-32)/1.8);
        scanner.close();
    }

}
