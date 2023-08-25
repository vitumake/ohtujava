package module1;

public class task2 {
    public static void main(String[] args) {
        
        // Params
        int rowNum = 4;
        char charP = '*';
        char charN = ' ';

        // List of rows to print
        String[] rows =  new String[rowNum];

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
            rows[i] = row;
        }

        //Print rows
        for (int i=rows.length; i > 0; i-- ) {
            System.out.println(rows[i-1]);
        }

    }
}
