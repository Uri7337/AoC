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
			String[] numbers = data.get(i).split(" ");
			for (String string : numbers) {
				report.add(Integer.parseInt(string));
			}

			
			boolean inc = report.get(1) > report.get(0) ? true : false;
			int first;
			int second;

			boolean safe = false;
            boolean problemDampener = false;
			for (int j = 0; j < report.size(); j++) {
				first = report.get(j);
				if ((j + 1) < report.size()) {
					second = report.get(j + 1);
				} else {
					break;
				}

				if (inc) {

					if (first + 1 == second || first + 2 == second || first + 3 == second) {
						safe = true;
						
					} else {
                        if(!problemDampener){
                            problemDampener=true;
                            report.remove(getBadLevel());
                            j=-1;
                            //inc = report.get(1) > report.get(0) ? true : false;
                        }else{
                            safe = false;
						    break;
                        }
						
					}

				} else {
					if (first - 1 == second || first - 2 == second || first - 3 == second) {
						safe = true;
						
					} else {
                        if(!problemDampener){
                            problemDampener=true;
                            report.remove(getBadLevel());
                            j=-1;
                            //inc = report.get(1) > report.get(0) ? true : false;
                        }else{
                            safe = false;
						    break;
                        }
					}
				}

			}
            ep.p(report+" safe:" +safe);
			if (safe) {
				solution += 1;
			}
			report.clear();
		}

		return solution;
	}
	int getBadLevel(){
		
		return 0;
	}
}
