package Day_23;

import Shared.ReadFile;
import java.util.ArrayList;
/*
 first check what kind of field it is
 then check if i was on that field before
 then check directions
 každé políčko bude mít direction boolean, up, down, left, right a podle toho co je to za policko, nebo ktere je po nem tak bude mozno pro nem projit
 a pote co se projde bude footprint
 
 ======Movement======
0. check field im standing on - if ('^' ; '>' ; 'v' ; '<') move, set footprint and count steps
    else
1. check directions in this order -> Left[-1][=] > Top[=][-1] > Right[+1][=] > Bottom[=][+1], + set boolean -> can i go there
2. if i see finish go to finish and print steps.
    else
3. for every True field - check what kind of field it is - can i go there?
4. check if there is a footprint - was i here before?
5.1. NO - move on that field            5.2. YES - check different direction
6.1. 


*/

public class Solution_1_Day_23 {
    int solution = 0;

     public int getSolution() {
       ReadFile rf = new ReadFile();
       ArrayList<String> file = new ArrayList<String>();
       String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day23_PuzzleInput_test.txt";
       file = rf.getInput(filepath);
       
       //Start
       Map mapa = new Map(file);
       mapa.printMap(mapa.rows, mapa.cols);
       Turista turista = new Turista(mapa.startlocation, mapa.finishlocation, 0);
       
//       turista.
       
       return solution;
    }
}
