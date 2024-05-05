package Day_12;

import Shared.ReadFile;

import java.util.ArrayList;

public class Solution_1_Day_12 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_12_test_2015.txt";
//		String filepath = "./src/main/resources/Day_12_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			
		}
		solution = 0;
		return solution;
	}
	

	//prints content, System.out.println is way too long
	public void p(String content) {
		System.out.println(content);
	}
	
	// ----debug zone----
	

}
