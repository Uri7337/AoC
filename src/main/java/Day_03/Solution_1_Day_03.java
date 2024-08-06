package Day_03;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_1_Day_03 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_03_test_2023.txt"; */
		String filepath = "./src/main/resources/Day_03_2023.txt";
		file = rf.getInput(filepath);

		
		

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			
			
		}

		return solution;
	}

	// ----debug zone----
	
}
