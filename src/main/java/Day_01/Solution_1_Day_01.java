package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;
	



	public Object getSolution(String filepath) {

		res = 0;
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			
			ep.p(line);
        }

		ep.p(res);
		return res;
	}

}
