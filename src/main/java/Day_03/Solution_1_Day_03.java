package Day_03;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_1_Day_03 {
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

			String enginePart = "";

			boolean isfirstNumber = true;

			String[] lineParts = line.split("");
			for (int j = 0; j < lineParts.length; j++) {
				boolean isNumber = lineParts[j].matches("[0-9]");
				boolean isFirstNumber;
				boolean isLastNumber;
				//first index handler
				if(j==0){
					isFirstNumber = isNumber;
				}else{
					isFirstNumber = ( isNumber && !(lineParts[j-1].matches("[0-9]")) );
				}
				//last index handler
				if(j==lineParts.length-1){
					isLastNumber = isNumber;
				}else{
					isLastNumber = ( isNumber && !(lineParts[j+1].matches("[0-9]")) );
				}
				
				 
				if(isFirstNumber){
					enginePart = lineParts[j];
					continue;
				}
				if(isLastNumber){
					enginePart +=lineParts[j];
					if(checkSurroundings(j,i,enginePart.length())){
						//if any number adjacent to a symbol is found do
						sum(Integer.parseInt(enginePart));
					}
					continue;
				}
				if(isNumber && !(isLastNumber) && !(isFirstNumber)){
					enginePart +=lineParts[j];
				}
				
				
			}
		}

		return solution = sumOfPartNumbers;
	}

	boolean checkSurroundings(int x, int y, int enginePartSize){
		boolean foundSymbol = false;
		//ep.p(file.get(y).charAt(x-enginePartSize));
		for (int i = y-1; i < y+2; i++) {
			ep.p("");
			for (int j = x-enginePartSize; j < x+2; j++) {
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
