package Day_5;

import Shared.ReadFile;
import com.sun.tools.javac.util.StringUtils;
import java.util.ArrayList;

public class Solution_2_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();

    public int getSolution() {
        ReadFile rf = new ReadFile();

//        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_test_2015.txt";
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_2015.txt";
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int row = 0; row < file.size(); row++) {

            System.out.println("------");
            System.out.println(file.get(row));
            System.out.println("pair: "+pair(row));
            System.out.println("repeats: "+repeats(row));
            System.out.println("------");
            
            if (pair(row) && repeats(row)) {
                solution++;

            }

        }

        return solution;
    }

    public boolean pair(int filerow) {
        char gfch = ' '; //guessFirstChar
        char gsch = ' '; //guessSecondChar

<<<<<<< HEAD
        for (int i = 0; i < file.get(filerow).length(); i++) {
            
            currletter = file.get(filerow).charAt(i);
            currbroletter = i == (file.get(filerow).length() - 1) ? ' ' : file.get(filerow).charAt(i + 1);
            String pair = currletter +""+ currbroletter;
            System.out.println(pair);
            int ind = file.get(filerow).indexOf(pair,i);
            if (ind>=0) {
=======
        for (int i = 0; i < file.get(filerow).length()-2; i++) {
            ArrayList<Integer> indexarr = new ArrayList<Integer>();
            String word = file.get(filerow);
            gfch = word.charAt(i);
            gsch = word.charAt(i + 1);

            String guess = gfch + "" + gsch;

            int index = word.indexOf(guess);
            indexarr.add(index);
            
            while (index >= 0) {
                index = word.indexOf(guess, index + 1);
                
                indexarr.add(index);
                
            }
            
            int firstloc = indexarr.get(0)+1;
            int secondloc = indexarr.get(1);
            
            if(indexarr.size()==3 && firstloc != secondloc){
                System.out.println(indexarr);
>>>>>>> 246bc3c (Day 5 Solution 2 Progress)
                return true;
            }
        }
        return false;
    }

    public boolean repeats(int filerow) {
        char cl = ' '; //currletter
        char csl = ' '; //currsameletter

        for (int i = 0; i < (file.get(filerow).length() - 3); i++) {
            String input = file.get(filerow);
            cl = input.charAt(i);

            csl = input.charAt(i + 2);

<<<<<<< HEAD
            before = i == 0 ? ' ' : file.get(filerow).charAt(i - 1);
            after = i == (file.get(filerow).length() - 1) ? ' ' : file.get(filerow).charAt(i + 1);
            
            int comparebefore = Character.compare(currletter, before);
            int compareafter = Character.compare(currletter, after);
            if (comparebefore == 0 || compareafter == 0) {
=======
            if (cl == csl) {
                System.out.println(cl+""+input.charAt(i + 1)+""+csl);
>>>>>>> 246bc3c (Day 5 Solution 2 Progress)
                return true;
            }

        }
        return false;
    }

}
