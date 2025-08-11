package Day_05;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_05 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	int result = 0;
	
	ArrayList<String> file;
	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			
			if(line.contains("|")){
				String[] temp = line.split("\\|");
				first.add(Integer.parseInt(temp[0]));
				second.add(Integer.parseInt(temp[1]));

			}else if (line.contains(",")) {
				list.add(line);

			}
				
			

		}
		ep.p(first);
		ep.p(second);
		ep.p(list);

		return result;
	}
	// ----debug zone----
	
}
