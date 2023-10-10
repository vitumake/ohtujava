package module1_3;

import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        
        double[] coeffs = new double[3];
        double[] roots = new double[2];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            System.out.print("Give " + String.valueOf((char)(i + 'A')) + " coefficient: ");
            coeffs[i] = scanner.nextDouble();
        }
        scanner.close();

        for(int i=0; i<2; i++) {
            roots[i] = ((-1)*coeffs[1]+((Math.sqrt(Math.pow(coeffs[1], 2)-4*coeffs[0]*coeffs[2]))*(i<1?1:-1)))/(2*coeffs[0]);
        }  
        if(!Double.isNaN(roots[0]) && !Double.isNaN(roots[1])) {
            System.out.print("Roots: " + (!Double.isNaN(roots[0])?roots[0]:"") + ", " + (!Double.isNaN(roots[1])?roots[1]:""));
        } else {
            System.out.print("No real roots");
        }

    }
}
