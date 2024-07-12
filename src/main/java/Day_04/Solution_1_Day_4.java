package Day_04;

import Shared.ReadFile;
import Shared.AlphabetContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Set;

public class Solution_1_Day_4 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "./src/main/resources/Day_04_test_2016.txt";
        /* String filepath = "./src/main/resources/Day_04_2016.txt"; */
        file = rf.getInput(filepath);

       // AlphabetContainer alcont = new AlphabetContainer("Small");

       Map<String, Integer> commonLetters = new HashMap<String, Integer>();
       String compareResult = "";
        TreeSet<Integer> numbers = new TreeSet<>();

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] lineParts = file.get(i).split("-");
            
            for (int j = 0; j < lineParts.length-1; j++) {
                for (char c : lineParts[j].toCharArray()) {
                    commonLetters.put(""+c, commonLetters.getOrDefault(""+c,0)+1);    
                }
/* 
                String[] linePartsPieces = lineParts[j].split("");
                for (int k = 0; k < linePartsPieces.length; k++) {
                    //p(linePartsPieces[k]);
                    if(commonLetters.get(linePartsPieces[k]) != null){
                        commonLetters.put(linePartsPieces[k], commonLetters.get(linePartsPieces[k])+1);
                    }else{
                        commonLetters.put(linePartsPieces[k], 1);
                    }
                }
                */
            }
            p("entryset");
            p(commonLetters.entrySet());
            p("map");
            p(commonLetters);
            List<Entry<String, Integer>> entrySet = new ArrayList<>(commonLetters.entrySet());
            p(entrySet);

            entrySet.sort(
                Comparator
                    .<Entry<String, Integer>>comparingInt(value -> value.getValue())
                    .reversed()
                    .thenComparing(Entry::getKey)
            );

            entrySet.sort((o1, o2) -> {
                int c = Integer.compare(o1.getValue(), o2.getValue());
                if (c!=0) return -c;
                return o1.getKey().compareTo(o2.getKey());
            });


            p(entrySet);


            //countin and sortin whole line of letters
            for (int v : commonLetters.values()) {;
                numbers.add(v);
            }
           /*  p(numbers.descendingSet()); */
           /*  for (int val : numbers) {
                p(commonLetters.get(val));
            } */
            for (String l : commonLetters.keySet()) {
                //p(l);
                compareResult +=l;
            }
            System.out.println(compareResult);
            System.out.println(commonLetters);
            commonLetters.clear();
            numbers.clear();
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