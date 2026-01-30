package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long grandTotal;

	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		ArrayList<Long> history = new ArrayList<>();

		
		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);

			String[] symbol = line.split("");
			line = line.substring(1);

			if (symbol[0].equals("+")) {
				grandTotal += Long.valueOf(line);
			} else {
				grandTotal -= Long.valueOf(line);
			}

			//ep.p(history);

			if (!history.contains(grandTotal)) {
				history.add(grandTotal);
			} else {
				return grandTotal;
			}

			if(y==file.size()-1){ y=-1;}
		}

		

		// grandTotal =
		return grandTotal;
	}

}
