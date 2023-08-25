package module1;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        
        // Params
        int rowNum = 4;
        char charP = '*';
        char charN = ' ';

        // List of rows to print
        ArrayList<String> rows =  new ArrayList<>(rowNum);

        // Populate rows
        for (int i=0; i < rowNum; i++) {
            
            String row = "" + charN;

            for (int j=0; j < rowNum*2-1; j++) {
                if(j < i) {
                    row = row + charN;
                } else if(j < rowNum*2-1-i) {
                    row = row + charP;
                }
            }
            rows.add(i, row);
        }

        //Print rows
        for (int i=rows.size(); i > 0; i-- ) {
            System.out.println(rows.get(i-1));
        }

    }
}
