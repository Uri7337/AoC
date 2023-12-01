package Day_1;
//
import Shared.ReadFile;
//
public class Solution_2_Day_1 {
    int solution = 0;
//
     public int getSolution() {
       ReadFile rf = new ReadFile();
       String file = "";
       String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";
       file = rf.getInput(filepath);       
       return solution;
    }
}
