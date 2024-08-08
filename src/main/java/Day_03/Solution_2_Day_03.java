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
		/* String filepath = "./src/main/resources/Day_03_test_2023.txt"; */
		String filepath = "./src/main/resources/Day_03_2023.txt";
		file = rf.getInput(filepath);
			
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			String enginePart = "";

			String[] lineParts = line.split("");
			for (int j = 0; j < lineParts.length; j++) {
				boolean isGear = lineParts[j].matches("\\*");
				
				if(isGear){
					if(checkSurroundings(j,i,1)){
						//if any 2 numbers adjacent to a gear is found do
						sum(Integer.parseInt(enginePart));
					}
					continue;
				}
			
				
			}
		}

		return solution = sumOfPartNumbers;
	}

	boolean checkSurroundings(int x, int y, int gearPartSize){
		boolean foundSymbol = false;
		//ep.p(file.get(y).charAt(x-gearPartSize));
		for (int i = y-1; i < y+2; i++) {
			ep.p("");
			for (int j = x-gearPartSize; j < x+2; j++) {
				if( i>=0 && i<file.size() && j>=0 && j<file.get(y).length() ){
					//currentlyControlledChar
					char cCC = file.get(i).charAt(j);
					ep.np(file.get(i).charAt(j));
					if( cCC !='.' && !(Character.toString(cCC).matches("[0-9]")) ){
						foundSymbol = true;
					}
				}
				
			}
		}
		ep.p("");
		ep.p("foundSymbol: "+foundSymbol);
		ep.p("-----------");
		
		
		return foundSymbol;
	}
	void sum(int num){
		sumOfPartNumbers += num;
	}

	// ----debug zone----
	
}
