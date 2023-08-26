package module1_4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        String[] firstNames = {"Leo", "Väinö", "Eino", "Oliver", "Elias", "Onni", "Emil", "Eeli", "Toivo", "Leevi"};
        String[] lastNames = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä", "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen"};
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of names to generate: ");
        int numNames = scanner.nextInt();
        scanner.close();
        for(int i=0; i<numNames; i++) {
            for(int j=0; j<2; j++) {
                int randint = (int)(Math.random()*9);
                System.out.print(j<1?"\n"+firstNames[randint] +" ":lastNames[randint]);
            }
        }
    }
}
