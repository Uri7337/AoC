package Day_04;

import Shared.ReadFile;
import Shared.AlphabetContainer;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_4 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "./src/main/resources/Day_04_test_2016.txt";
        /* String filepath = "./src/main/resources/Day_04_2016.txt"; */
        file = rf.getInput(filepath);

       // AlphabetContainer alcont = new AlphabetContainer("Small");

       HashMap<String, Integer> commonLetters = new HashMap<String, Integer>();
       String compareResult = "";

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] lineParts = file.get(i).split("-");
            
            for (int j = 0; j < lineParts.length-1; j++) {
                String[] linePartsPieces = lineParts[j].split("");
                for (int k = 0; k < linePartsPieces.length; k++) {
                    //p(linePartsPieces[k]);
                    if(commonLetters.get(linePartsPieces[k]) != null){
                        commonLetters.put(linePartsPieces[k], commonLetters.get(linePartsPieces[k])+1);
                    }else{
                        commonLetters.put(linePartsPieces[k], 1);
                    }
                }
            }
            //counting and sortin whole line of letters
            for (String l : commonLetters.keySet()) {
                //p(l);
                compareResult +=l;
            }
            System.out.println(compareResult);
            System.out.println(commonLetters);
            commonLetters.clear();
            compareResult = "";
        }
        
        solution = 0;
        return solution;
    }



    public boolean doChecksum(String test, String correct){
        if(test.equals(correct)){
            return true;
        }
        return false;
    }

    // prints content, System.out.println is way too long
    public void p(Object content) {
        System.out.println(content.toString());
    }

    // ----debug zone----

}