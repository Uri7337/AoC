package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;
	



	public Object getSolution(String filepath) {

		res = 0;
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		ArrayList<Integer> measurements = new ArrayList<>();
		ArrayList<Integer> windows = new ArrayList<>();
		

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			measurements.add(Integer.valueOf(line));
        }

		for (int i = 0; i < measurements.size()-2; i++) {
			windows.add(measurements.get(i)+measurements.get(i+1)+measurements.get(i+2));
		}

		for (int i = 0; i < windows.size()-1; i++) {
			if(windows.get(i)<windows.get(i+1)){
				res++;
			}
		}

		ep.p(res);
		return res;
	}

}
