package Day_3;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_3 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_test_2015.txt";
        //String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_2015.txt";
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {

        }

        return solution;
    }
}
