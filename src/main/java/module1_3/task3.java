package module1_3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a starting value: ");
        int start = scanner.nextInt();
        System.out.print("Give an ending value: ");
        int end = scanner.nextInt();
        System.out.println("");
        scanner.close();

        for(int i=start; i<=end; i++) {
            for(int j=i-1; j>0; j--) {     
                if (j==1) {
                    System.out.print(i + " ");
                }
                if(i%j==0) {
                    break;
                }
            }
        }
    }
}
