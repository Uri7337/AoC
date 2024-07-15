package Day_06;

import Shared.ReadFile;
import Shared.EasyPrint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Solution_1_Day_06 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_06_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_06_2016.txt";
		file = rf.getInput(filepath);

		Map<Character, Integer> commonLetters = new HashMap<Character, Integer>();
		String sol = "";

		//Insert Solution Here:
		for (int i = 0; i < file.get(0).length(); i++) {
			for (int j = 0; j < file.size(); j++) {
				String line = file.get(j);
				/* ep.p(line.charAt(i)); */
				commonLetters.put(line.charAt(i), commonLetters.getOrDefault(line.charAt(i),0)+1);
				
			}
			
			List<Entry<Character, Integer>> entrySet = new ArrayList<>(commonLetters.entrySet());
			commonLetters.clear();

			entrySet.sort(
                Comparator
                    .<Entry<Character, Integer>>comparingInt(value -> value.getValue())
                    .reversed()
                    .thenComparing(Entry::getKey)
            );


			
			sol = sol + entrySet.get(0).getKey();

		}
		return solution = sol;
	}

	// ----debug zone----
	
}
