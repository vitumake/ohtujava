package module2;

import java.util.Scanner;

public class task3 {
    
    public static void main(String[] args) {
        
        final double LEIVISKA_MULT = 20.0;
        final double NAULA_MULT = 32.0;
        final double LUOTI_MULT = 13.28;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double val = scanner.nextDouble();
        scanner.close();
        System.out.printf("%1.0f grams is %1.0f leiviskä, %1.0f naula and %1.2f luoti.", 
                val,  
                Math.floor(val/LUOTI_MULT/NAULA_MULT/LEIVISKA_MULT),
                Math.floor(val/LUOTI_MULT/NAULA_MULT%LEIVISKA_MULT),
                val/LUOTI_MULT%NAULA_MULT%LEIVISKA_MULT
        );
    }
}
