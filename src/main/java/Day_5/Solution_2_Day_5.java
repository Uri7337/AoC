package Day_5;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();

    public int getSolution() {
        ReadFile rf = new ReadFile();

        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_test_2015.txt";
//        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_2015.txt";
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int row = 0; row < file.size(); row++) {

            System.out.println(file.get(row));
            System.out.println(pair(row));
//            System.out.println(repeats(row));

            
                if (pair(row) && repeats(row)) {
                    solution++;
                }
            

        }

        return solution;
    }
    
    public boolean pair(int filerow) {
        char currletter = ' ';
        char currbroletter = ' ';

        for (int i = 0; i < file.get(filerow).length(); i++) {
            
            currletter = file.get(filerow).charAt(i);
            currbroletter = i == (file.get(filerow).length() - 1) ? ' ' : file.get(filerow).charAt(i + 1);
            String pair = currletter +""+ currbroletter;
            System.out.println(pair);
            int ind = file.get(filerow).indexOf(pair,i);
            if (ind>=0) {
                return true;

            }
        }
        return false;
    }
    
    public boolean repeats(int filerow) {
        char currletter = ' ';
        char before = ' ';
        char after = ' ';

        for (int i = 0; i < file.get(filerow).length(); i++) {

            currletter = file.get(filerow).charAt(i);

            before = i == 0 ? ' ' : file.get(filerow).charAt(i - 1);
            after = i == (file.get(filerow).length() - 1) ? ' ' : file.get(filerow).charAt(i + 1);
            
            int comparebefore = Character.compare(currletter, before);
            int compareafter = Character.compare(currletter, after);
            if (comparebefore == 0 || compareafter == 0) {
                return true;

            }
        }
        return false;
    }
    
}
