package module1_4;

import java.util.Scanner;
import java.util.ArrayList;

public class task3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array: ");
        int arrSize = scanner.nextInt();
        int[] nums = new int[arrSize];
        ArrayList<Integer> dupless = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            System.out.print("Integer "+(i+1)+": ");
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i:nums) if(!dupless.contains(i)) dupless.add(i);
        System.out.println("The array without duplicates:");
        dupless.forEach(x->System.out.print(x + " "));
    }
}
