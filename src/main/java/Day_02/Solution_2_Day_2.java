package Day_02;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_2 {
    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();

        /* String filepath = "./src/main/resources/Day_02_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_02_2016.txt";

        file = rf.getInput(filepath);

        
        Keypad kp = new Keypad();
        /* kp.nb[0].printNumberButton(); */

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String line = file.get(i);
            String[] letters = line.split(""); 
            for (int j = 0; j < letters.length; j++) {
                /* p(letters[j]+j+" "+letters.length); */
                kp.fingerMove(letters[j], j, letters.length);
            }
        }
        p(kp.writeSecretCode());
        solution = 0;
        return solution;
    }

    

    // prints content, System.out.println is way too long
    public void p(Object content) {
        System.out.println(content.toString());
    }

    // ----debug zone----

}