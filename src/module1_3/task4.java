package module1_3;

import java.io.IOException;
import java.util.Scanner;

public class task4 {
 
    public static void main(String[] args) throws IOException {
        
        boolean loop = true;
        int[] vals = new int[2];
        int score;
        Scanner scanner = new Scanner(System.in);

        while(loop) {
            score = 0;
            for(int i=0; i<10; i++) {
                for(int j=0; j<2; j++) vals[j] = 1+(int)(Math.random()*((10-1) + 1));
                System.out.print("What is " + vals[0] + " x " + vals[1] + "? \n> ");
                if(scanner.nextInt() == vals[0]*vals[1]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. \n Right answer: " + vals[0]*vals[1] + "\n");
                }   
            }
            System.out.print("\033\143");
            if(score==10) loop = false; else {
                System.out.println("You got " + score + "/10 right. \nTry again!\n");
                scanner.nextLine();
            }
        }
        System.out.println("Congratulations! \nYou have mastered the multiplication tables.");
        scanner.close();
    }
}
