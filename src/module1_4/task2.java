package module1_4;

import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array: ");
        int[] nums = new int[scanner.nextInt()];
        for(int i=0; i<nums.length; i++) {
            System.out.print("Integer "+(i+1)+": ");
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        
        int lastSum=0,maxSum=0;
        int[] indicies = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                for(int k=i; k<=j; k++) {
                    lastSum += nums[k];
                }
                if(lastSum>maxSum) {
                    maxSum = lastSum;
                    indicies[0] = i+1;
                    indicies[1] = j+1;
                }
                lastSum = 0;
            }
        }
        System.out.println("Max sum: "+maxSum+"\nIntegers: "+indicies[0]+"-"+indicies[1]);
    }
}
