package Day_5;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();

    public int getSolution() {
        ReadFile rf = new ReadFile();

//        String filepath = "./src/main/resources/Day_5_test_2015.txt";
        String filepath = "./src/main/resources/Day_5_2015.txt";
        
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

            if (cl == csl) {
                System.out.println(cl+""+input.charAt(i + 1)+""+csl);
                return true;
            }

        }
        return false;
    }

}
