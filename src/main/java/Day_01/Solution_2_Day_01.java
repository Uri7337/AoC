package Day_01;

import shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_01 {

    Object solution = "Nothing yet!";

    public Object getSolution(String filepath) {
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        
        
       

        data = rf.getInput(filepath);

        for (int i = 0; i < data.size(); i++) {
            String numbers = data.get(i).replaceAll("[^0-9]", "");
           
            
        }

        return solution;
    }
}
