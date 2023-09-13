package module3_4.task1;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        
        URL url;

        try {
            url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return;
        }

        try {
            InputStream iS = url.openStream();
            InputStreamReader iSR = new InputStreamReader(iS);
            BufferedReader bR = new BufferedReader(iSR);

            String line;
            StringBuilder resp = new StringBuilder();

            while ((line = bR.readLine()) != null) {
                resp.append(line);
                resp.append("\n");
            }
            bR.close();
            System.out.println(resp.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}