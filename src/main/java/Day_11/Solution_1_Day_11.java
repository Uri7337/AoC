package Day_11;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;


public class Solution_1_Day_11 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);
		
		return solution;
	}
}