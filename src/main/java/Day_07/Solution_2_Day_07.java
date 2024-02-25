package Day_07;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_07 {

	int solution = 0;
	

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_07_test_2015.txt";
		String filepath = "./src/main/resources/Day_07_2015.txt";
		file = rf.getInput(filepath);

		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			

		}

		return solution;
	}

	
}
