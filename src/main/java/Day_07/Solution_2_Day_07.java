package Day_07;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_07 {
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

		return grandTotal;
	}

}
