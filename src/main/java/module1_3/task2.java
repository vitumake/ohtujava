package module1_3;

import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args) {
        
        System.out.print("Enter binary number: ");
        Scanner scanner = new Scanner(System.in);
        String bin = scanner.nextLine();
        scanner.close();
        int dec = 0;

        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i)=='1') {
                dec += Math.pow(2, bin.length()-i-1);
            }
        }
        System.out.println("Number in decimals: " + dec);
    }

}
