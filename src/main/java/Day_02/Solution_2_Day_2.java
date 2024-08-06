package Day_02;
//
import Shared.ReadFile;
import java.util.ArrayList;
//
public class Solution_2_Day_2 {
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
