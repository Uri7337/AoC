package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> rotations;

	public Object getSolution(String filepath) {

		ReadFile rf = new ReadFile();
		rotations = new ArrayList<String>();
		rotations = rf.getInput(filepath);

		int dial = 50;
		int password = 0;
		int counter = 0;
		boolean nodoubles;
		ep.p("The dial starts by pointing at " + dial);
		// rotations preparation
		for (int y = 0; y < rotations.size(); y++) {
			String line = rotations.get(y);
			// ep.p(line);
			char direction = line.charAt(0);
			int rotation = Integer.parseInt(line.substring(1, line.length()));

			nodoubles = false;
			if (rotation > 100) {
				ep.p("hi");
			}
			password = counter;
			if (direction == 'R') {
				dial += rotation;
				while (100 <= dial) {

					dial -= 100;
					counter++;
					//nodoubles = true;
				}
			} else {
				dial -= rotation;
				while (0 > dial) {

					dial += 100;
					counter++;
					//nodoubles = true;
				}
			}

			ep.p(" The dial is rotated " + direction + "" + rotation + " to point at " + dial);
			if (dial == 0) {
				counter++;
				ep.p("dial is 0 lol, someone write it down");
				nodoubles = true;
			}
			if (counter > password && nodoubles == false) {

				ep.p("during this rotation, it points at 0 " + (counter - password) + ".");

			}

		}

		// 6889 - wrong
		// 8047 - wrong
		return counter;
	}

}
