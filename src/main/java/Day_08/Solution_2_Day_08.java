package Day_08;

import Shared.ReadFile;
import Shared.EasyPrint;

import java.util.ArrayList;


public class Solution_2_Day_08 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_08_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_08_2016.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
		}

		return solution;
	}

	// ----debug zone----
	
}
