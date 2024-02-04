package Day_5;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();
    
    public int getSolution() {
        ReadFile rf = new ReadFile();
        
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_test_2015.txt";
        //String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_2015.txt";
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int row = 0; row < file.size(); row++) {

            System.out.println(file.get(row));
            System.out.println(gotdoubles(row));
            
            for (int j = 0; j < file.get(row).length(); j++) {
                
                if (!isForbidden(row)){
                    if(gotvowels(row)){
                        
                    }
                } 
            }
        }

        return solution;
    }
    
    public boolean gotvowels(int filerow){
        String[] vowels = {"a", "e", "i", "o", "u"};
        boolean containsvow;
        int vow = 0;
        for (String i : vowels) {
            containsvow = file.get(filerow).contains(i);
            if(containsvow) {
                vow++;
                if(vow>=3){return true;}
            }
        }
        return false;
    }
    
    public boolean gotdoubles(int filerow){
        char currletter = ' ';
        char before = ' ';
        char after = ' ';
        System.out.println("here");
        for (int i = 0; i < file.get(filerow).length(); i++) {
            System.out.println("here2");
            currletter = file.get(filerow).charAt(i);
            System.out.println("here3");
            System.out.println(file.get(filerow).charAt(i-1) == -1 ? ' ' : file.get(filerow).charAt(i-1));
            System.out.println("here4");
            before = file.get(filerow).charAt(i-1) == -1 ? ' ' : file.get(filerow).charAt(i-1);
            after = file.get(filerow).charAt(i+1) == (file.get(filerow).length()+1) ? ' ' : file.get(filerow).charAt(i+1);
            System.out.println("letters: " + before + " " + currletter + " " +after);
            int comparebefore = Character.compare(currletter, before);  
            int compareafter = Character.compare(currletter, after); 
            if(comparebefore == 0 || compareafter == 0){
                return true;
                
            }
        }
        return false;
    }
    
    public boolean isForbidden(int filerow){
        String[] forb = {"ab", "cd", "pq", "xy"};
        boolean forbidden;
        for (String i : forb) {
            forbidden = file.get(filerow).contains(i);
            if (forbidden) {return true;}
        }
        return false;
    }
    
}
