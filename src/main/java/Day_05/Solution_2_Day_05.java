package Day_05;

import java.util.ArrayList;
import java.util.Arrays;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_05 {
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
		ArrayList<Integer> minilist = new ArrayList<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			
			if(line.contains("|")){
				String[] temp = line.split("\\|");
				first.add(Integer.parseInt(temp[0]));
				second.add(Integer.parseInt(temp[1]));

			}else if (line.contains(",")) {
				String[] templine = line.split(",");
				
				minilist = new ArrayList<>();
				for (String string : templine) {
					minilist.add(Integer.parseInt(string));
					
				}
				list.add(minilist);
				
			}
				
			

		}
		//ep.p(first);
		//ep.p(second);
		//ep.p(list);
		//ep.p("");

		boolean isRightOrder; 
		int middlePageNumbersAdded = 0;

		for(int i = 0; i<list.size();i++){
			isRightOrder = true;
			minilist = list.get(i);
			for (int rule = 0; rule < first.size(); rule++) {
				int firstRule = first.get(rule);
				int secondRule = second.get(rule);

				if(minilist.contains(firstRule) && minilist.contains(secondRule)){
					if(minilist.indexOf(firstRule)>minilist.indexOf(secondRule)){
						isRightOrder = false;
					}
				}
				
			}

			if(!isRightOrder){
				//ep.p("before: "+minilist+ " " + middleOne(minilist));

				for (int rule = 0; rule < first.size(); rule++) {
					int firstRule = first.get(rule);
					int secondRule = second.get(rule);
					//ep.p(rule);
					if(minilist.contains(firstRule) && minilist.contains(secondRule)){
						if(minilist.indexOf(firstRule)>minilist.indexOf(secondRule)){
							int replaceAtA = minilist.indexOf(firstRule);
							int replaceAtB = minilist.indexOf(secondRule);
							minilist.set(replaceAtA, secondRule);
							minilist.set(replaceAtB, firstRule);
							rule = -1;
						
						}
					}
				
				}
				//ep.p("after: "+minilist+ " " + middleOne(minilist));
				//97,13,75,29,47 becomes 97,75,47,29,13.
				//97,29,75,13,47
				//97,75,29,13,47
				//97,75,29,47,13
				//97,75,47,29,13
				middlePageNumbersAdded += middleOne(minilist);
			}

		}

		return middlePageNumbersAdded;
	}

	int middleOne(ArrayList<Integer> arrlist){
		return arrlist.get(arrlist.size()/2);
	}
	// ----debug zone----
	
}
