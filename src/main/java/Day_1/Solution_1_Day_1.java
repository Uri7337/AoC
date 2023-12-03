package Day_1;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_1 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        String first = "";
        String second = "";
        int number = 0;
        
        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInputs/Day_1.txt";

        data = rf.getInput(filepath);

        for (int i = 0; i < data.size(); i++) {
            String numbers = data.get(i).replaceAll("[^0-9]", "");
           
            first = numbers.substring(0, 1);
            
            if (numbers.length() != 1) {
                
                second = numbers.substring(numbers.length() - 1);
                
            }else{
                
                second = first;
            }
            
            numbers = first.concat(second);
            
            try {
                number = Integer.parseInt(numbers);
                solution += number;
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }

        return solution;
    }
}
