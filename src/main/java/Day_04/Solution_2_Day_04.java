package Day_04;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_2_Day_04 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	ArrayList<String> file;
	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

        }
		return solution;
	}

	// ----debug zone----
	
}
