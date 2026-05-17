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
		ep.p(filepath);
		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		ArrayList<Integer> measurements = new ArrayList<>();
		

		for (int y = 0; y < file.size(); y++) {
			measurements.add(Integer.valueOf(file.get(y)));
        }

		for (int i = 0; i < measurements.size()-1; i++) {
			int fM = measurements.get(i); //firstMeasurement
			int sM = measurements.get(i+1); //secondMeasurement
			
			if(fM<sM){
				res++;
			}
			
		}

		ep.p(res);
		return res;
	}

}
