package Day_04;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_4 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        /* String filepath = "./src/main/resources/Day_04_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_04_2016.txt";
        file = rf.getInput(filepath);

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            //  file.get(i).split(" ");

                
        }
        
        solution = 0;
        return solution;
    }


    // prints content, System.out.println is way too long
    public void p(Object content) {
        System.out.println(content.toString());
    }

    // ----debug zone----

}