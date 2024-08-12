package Day_03;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_2_Day_03 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	int sumOfPartNumbers = 0;

	ArrayList<String> file;
	public Object getSolution() {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_03_test_2023.txt";
		/* String filepath = "./src/main/resources/Day_03_2023.txt"; */
		file = rf.getInput(filepath);
			
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			

			String[] lineParts = line.split("");
			for (int j = 0; j < lineParts.length; j++) {
				boolean isGear = lineParts[j].matches("\\*");
				
				if(isGear){
					ArrayList<Integer> partNumbers = new ArrayList<Integer>();
					partNumbers = checkSurroundings(j,i);
						//if exactly two part numbers adjacent to a gear is found do
						if(partNumbers.size() == 2){
							//multiplying those two numbers together
							int mult = partNumbers.get(0)*partNumbers.get(1);
							sum(mult);
							continue;
						}
					
					
				}
			
				
			}
		}
		test(sumOfPartNumbers);
		return solution = sumOfPartNumbers;
	}

	ArrayList<Integer> checkSurroundings(int x, int y){
		ArrayList<Integer> partNumbers = new ArrayList<Integer>();

		
		return partNumbers;
	}
	void sum(int num){
		sumOfPartNumbers += num;
	}

	// ----debug zone----
	void test(int x){
		if(x==467835){
			ep.p("test OK");
		}
	}
}
