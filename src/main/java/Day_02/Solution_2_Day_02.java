package Day_02;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_02 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);

		ArrayList<Integer> report = new ArrayList<>();
		for (int i = 0; i < data.size(); i++) {
			report.clear();

			String[] numbers = data.get(i).split(" ");
			for (String string : numbers) {
				report.add(Integer.parseInt(string));
			}
			//ep.p("report:"+ report);
			int inc = report.get(1) > report.get(0) ? 1 : -1;
			int first;
			int second;

			boolean safe = false;
			
			for (int j = 0; j < report.size(); j++) {
				first = report.get(j);
				if ((j + 1) < report.size()) {
					second = report.get(j + 1);
				} else {
					break;
				}

				if ((first + 1 * inc) == second || (first + 2 * inc) == second || (first + 3 * inc) == second) {
					safe = true;
				} else {
					safe = getBadLevel(report);
					//ep.p(report + "badsafe:" + safe);
					break;
				}

			}

			ep.p(report + " safe:" + safe);
			if (safe) {
				solution += 1;
			}

		}

		return solution;
	}

	boolean getBadLevel(ArrayList<Integer> report) {
		ArrayList<Integer> report2;
		boolean safe = false;
		for (int index = 0; index < report.size(); index++) {
			report2 =  new ArrayList<>(report);
			report2.remove(index);
			int inc = report2.get(1) > report2.get(0) ? 1 : -1;
			int first;
			int second;
			for (int j = 0; j < report2.size(); j++) {
				first = report2.get(j);
				if ((j + 1) < report2.size()) {
					second = report2.get(j + 1);
				} else {
					break;
				}
				if ((first + 1 * inc) == second || (first + 2 * inc) == second || (first + 3 * inc) == second) {
					safe = true;

				}else{
					safe = false;
					break;
				}

			}
			if(safe){
				return safe;
			}
			
		}
		return safe;
	}
}
