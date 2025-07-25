package Day_04;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;

public class Solution_1_Day_04 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	ArrayList<String> file;

	public Object getSolution(String filepath) {
		int result = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		int a, b, c, d, dir;
		a = -1;
		b = file.get(0).length();
		c = file.size();
		d = -1;
		dir = 0; // 0-7

		// x = 0
		int[] x0 = {3,4,5};
		// y = 0
		int[] y0 = {5,6,7};
		// y = c
		int[] yc = {1,2,3};
		// x = b
		int[] xb = {0,1,7};



		return result;
	}

	// ----debug zone----

}
