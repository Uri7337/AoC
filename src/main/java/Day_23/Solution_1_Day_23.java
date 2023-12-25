package Day_23;
//
import Shared.ReadFile;
import java.util.ArrayList;
//
public class Solution_1_Day_23 {
    int solution = 0;
//
     public int getSolution() {
       ReadFile rf = new ReadFile();
       ArrayList<String> file = new ArrayList<String>();
       String filepath = "c:/UriStuff/Programming/AoC/Day23_PuzzleInput.txt";
       file = rf.getInput(filepath);
       
       //Start
       Map mapa = new Map(file);
       Turista turista = new Turista();
       
       System.out.println(mapa.policka[0][0]);
       
       
       return solution;
    }
}
