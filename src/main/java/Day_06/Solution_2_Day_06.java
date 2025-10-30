package Day_06;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_06 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	int result = 0;
	
	ArrayList<String> file;
	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			ep.p(line);
			
				
			

		}
		
		return result;
	}

	
	// ----debug zone----
	
}
