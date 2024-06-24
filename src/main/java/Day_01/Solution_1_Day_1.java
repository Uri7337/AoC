package Day_01;

import Shared.ReadFile;

import java.util.Arrays;
import java.util.ArrayList;

public class Solution_1_Day_1 {

	int solution = 0;
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_01_test_2016.txt";
		/* String filepath = "./src/main/resources/Day_01_2016.txt"; */
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
			Object coordinates = Arrays.asList(line.split(", "));

			/* p(coordinates); */

			/* int answer = getAnswer(coordinates); */
			

		}
		
		
		return solution;
	}
	

	


	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}
	
	// ----debug zone----
	

}
