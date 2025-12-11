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
		
		// rotations preparation
		for (int y = 0; y < rotations.size(); y++) {
			String line = rotations.get(y);

			char direction = line.charAt(0);
			int rotation = Integer.parseInt(line.substring(1, line.length()));

			/* if (direction == 'R') {
				if (dial == 0) {
					password--;
				}
				dial += rotation;

				while (100 <= dial) {
					password++;
					dial -= 100;
				}
			} else {
				if (dial == 0) {
					password--;
				}
				dial -= rotation;
				while (0 > dial) {
					password++;
					dial += 100;

				}
			} */

			
			if (direction == 'R') {
				for (int index = rotation; index > 0; index--) {
					if (dial == 99) {
						dial = 0;
						password++;
						
					} else {
						dial++;
					}
				}
			} else {
				for (int index = rotation; index > 0; index--) {
					if (dial == 0) {
						dial = 99;
						if(index!=rotation)password++;
						
						
					} else {
						dial--;
					}			
				}
				
			}
			if(dial==0 && direction!='R'){password++;}
			ep.np(direction+""+rotation+" ");
			ep.p(dial +" :"+ password);
			

		}

		// 6889 - wrong
		// 8047 - wrong
		// 5748 - wrong
		// 6860
		return password;
	}

}
