package Day_04;

import Shared.ReadFile;
import Shared.AlphabetContainer;
import java.util.ArrayList;

public class Solution_1_Day_4 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "./src/main/resources/Day_04_test_2016.txt";
        /* String filepath = "./src/main/resources/Day_04_2016.txt"; */
        file = rf.getInput(filepath);

        AlphabetContainer alcont = new AlphabetContainer("Small");

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] lineParts = file.get(i).split("-");
            
           
        }
        
        solution = 0;
        return solution;
    }



    public boolean doChecksum(String test, String correct){
        if(test.equals(correct)){
            return true;
        }
        return false;
    }

    // prints content, System.out.println is way too long
    public void p(Object content) {
        System.out.println(content.toString());
    }

    // ----debug zone----

}