package Day_04;

import Shared.EasyPrint;
import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;

public class Solution_1_Day_04 {
    EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        /* String filepath = "./src/main/resources/Day_04_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_04_2016.txt";
        file = rf.getInput(filepath);


       Map<Character, Integer> commonLetters = new HashMap<Character, Integer>();
       List<Integer> numbers = new ArrayList<>();

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] lineParts = file.get(i).split("-");
            
            for (int j = 0; j < lineParts.length-1; j++) {
                for (char c : lineParts[j].toCharArray()) {
                    commonLetters.put(c, commonLetters.getOrDefault(c,0)+1);    
                }

            }
            
            List<Entry<Character, Integer>> entrySet = new ArrayList<>(commonLetters.entrySet());
            commonLetters.clear();

            entrySet.sort(
                Comparator
                    .<Entry<Character, Integer>>comparingInt(value -> value.getValue())
                    .reversed()
                    .thenComparing(Entry::getKey)
            );

            String sol = "";
            for (Entry<Character,Integer> entry : entrySet) {
                sol = sol + entry.getKey();
            }
          
            if(sol.substring(0, 5).equals(lineParts[lineParts.length-1].substring(4, 9))){
                numbers.add(Integer.parseInt(lineParts[lineParts.length-1].substring(0, 3)));
                
            }
           
        }

        int result = numbers.stream().reduce(0, Integer::sum);
        return solution=result;
    }



   

    // ----debug zone----

}