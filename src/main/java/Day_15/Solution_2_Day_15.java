package Day_15;
//
import shared.ReadFile;
import java.util.ArrayList;
//
public class Solution_2_Day_15 {
    int solution = 0;
//
     public int getSolution() {
       ReadFile rf = new ReadFile();
       ArrayList<String> file = new ArrayList<String>();
       String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";
       file = rf.getInput(filepath);       
       return solution;
    }
}
