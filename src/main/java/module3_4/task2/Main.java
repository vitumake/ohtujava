package module3_4.task2;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        // BIG int so we don't go negative
        BigInteger[] fib = new BigInteger[100];

        // Very readable :)
        for(int i=0; i<fib.length; i++) fib[i] = (i==0||i==1)?new BigInteger("1"):fib[i-1].add(fib[i-2]);

        try {
            FileWriter fW = new FileWriter("fibonacci.csv");
            BufferedWriter bW = new BufferedWriter(fW);

            for(int i=0; i<fib.length; i++) bW.write(fib[i]+"\n");
            bW.close();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
