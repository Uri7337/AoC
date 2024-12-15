package Day_03;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_03 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);

		
		for (int i = 0; i < data.size(); i++) {
			String[] numbers = data.get(i).split(" ");
			
		}

		return solution;
	}
}
