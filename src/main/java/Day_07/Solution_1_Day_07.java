package Day_07;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_07 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	HashMap<String, Integer> pokerCards = new HashMap<String, Integer>();

	ArrayList<String> file;

	public Object getSolution(String filepath) {

		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		// prepare poker cards
		pokerCards.put("A", 14);
		pokerCards.put("K", 13);
		pokerCards.put("Q", 12);
		pokerCards.put("J", 11);
		pokerCards.put("T", 10);

		for (int i = 2; i < 10; i++) {
			pokerCards.put(i + "", i);
		}

		ep.p(pokerCards);
		// Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			
		}
		return solution;
		// ----debug zone----
		
	}
}