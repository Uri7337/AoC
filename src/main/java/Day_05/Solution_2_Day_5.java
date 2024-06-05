package Day_5;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();

    public int getSolution() {
        ReadFile rf = new ReadFile();

//        String filepath = "./src/main/resources/Day_5_test_2019.txt";
        String filepath = "./src/main/resources/Day_5_2019.txt";
        
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int row = 0; row < file.size(); row++) {
			if (!pair(row)) System.out.println((row+1)+": nodpl");
			else if (!repeats(row)) System.out.println((row+1)+": norepeat");
			else System.out.println((row+1)+": ok");
            
            
            if (pair(row) && repeats(row)) {
                solution++;

            }

        }

        return solution;
    }

    public boolean pair(int filerow) {
		final String row = file.get(filerow);

        for (int i = 0; i < row.length()-3; i++) {
//            ArrayList<Integer> indexarr = new ArrayList<Integer>();
            String word = row;
           char gfch = word.charAt(i);
           char gsch = word.charAt(i + 1);

            String guess = gfch + "" + gsch;

            int index = word.indexOf(guess,i+2);
			
//            indexarr.add(index);
            
            if (index >= 0) {
                return true;
            }
            
//            int firstloc = indexarr.get(0)+1;
//            int secondloc = indexarr.get(1);
            
//            if(indexarr.size()>=3){
//                System.out.println(indexarr);
//                return true;
//            }
        }
        return false;
    }

    public boolean repeats(int filerow) {
        char cl = ' '; //currletter
        char csl = ' '; //currsameletter

        for (int i = 0; i < (file.get(filerow).length() - 2); i++) {
            String input = file.get(filerow);
            cl = input.charAt(i);

            csl = input.charAt(i + 2);

            if (cl == csl) {
//                System.out.println(cl+""+input.charAt(i + 1)+""+csl);
                return true;
            }

        }
        return false;
    }

}
