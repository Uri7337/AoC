package Day_16;
//
import Shared.ReadFile;
import java.util.ArrayList;
//
//            10 sirka  10x10
//   delka 10 .|...\....
//            |.-.\.....
//            .....|-...
//            ........|.
//            ..........
//            .........\
//            ..../.\\..
//            .-.-/..|..
//            .|....-|.\
//            ..//.|....

public class Solution_1_Day_16 {
    int solution = 0;
//
     public int getSolution() {
       ReadFile rf = new ReadFile();
       ArrayList<String> file = new ArrayList<String>();
       String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_16_test.txt";
       file = rf.getInput(filepath);
       //System.out.println(file.size()); delka
       
//       System.out.println(file.get(0).length()); sirka
       
       return solution;
    }
}
