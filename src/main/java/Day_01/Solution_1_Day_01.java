package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long grandTotal;

	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
		}

		

		// grandTotal = 
		return grandTotal;
	}

}
