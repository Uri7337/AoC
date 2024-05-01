
package Day_11;

import Shared.ReadFile;

import java.util.ArrayList;

public class Solution_2_Day_11 {

	int solution = 0;
	

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_11_test_2015.txt";
//		String filepath = "./src/main/resources/Day_11_2015.txt";
		file = rf.getInput(filepath);
		
		 
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
                        
		}
                solution = 0;
		return solution;
	}

	

	

}
