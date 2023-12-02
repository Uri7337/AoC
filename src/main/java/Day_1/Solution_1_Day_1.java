package Day_1;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_1 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";

        data = rf.getInput(filepath);

        for (int i = 0; i < data.size(); i++) {
            String numbers = data.get(i).replaceAll("[^0-9]", "");
            
            try {
                int number = Integer.parseInt(numbers);
                System.out.println(number); 
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }

        return solution;
    }
}
