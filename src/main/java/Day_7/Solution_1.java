package Day_7;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1 {
    int solution = 0;
    public int getSolution() {
        ReadFile rf = new ReadFile();
        String file = "";
        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";
        file = rf.getInput(filepath);       
        String[] commands = file.split("  ");
        System.out.println(commands[1]);
        
        
        
        return solution;
    }
}
