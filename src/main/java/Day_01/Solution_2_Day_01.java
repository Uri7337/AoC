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
		

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			measurements.add(Integer.getInteger(line));
        }

		for (int i = 0; i < measurements.size()-1; i++) {
			int fM = measurements.get(i); //firstMeasurement
			int sM = measurements.get(i+1); //secondMeasurement
			
			ep.p(fM +" : " +sM);
			
		}

		ep.p(res);
		return res;
	}

}
