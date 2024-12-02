package Day_02;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_02 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);

		ArrayList<Integer> report = new ArrayList<>();
		for (int i = 0; i < data.size(); i++) {
			String[] numbers = data.get(i).split(" ");
			for (String string : numbers) {
				report.add(Integer.parseInt(string));
			}
			
			int rsize = report.size();
			boolean inc;
			int first;
			int second;
			for (int j = 0; j < rsize; j++) {
				first = report.get(j);
				if ((j + 1) < rsize) {
					second = report.get(j + 1);
				}else{
					break;
				}
				
				inc = second > first ? true : false;
				
			}

			report.clear();
		}

		return solution;
	}
}
