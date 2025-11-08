package Day_07;

import java.util.ArrayList;
import java.util.LinkedList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_07 {
	EasyPrint ep = new EasyPrint();
	int result = 0;

	ArrayList<String> equations;
	//ArrayList<Integer> testValues = new ArrayList<>();
	LinkedList<Integer> rightSide;

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		equations = new ArrayList<>();
		equations = rf.getInput(filepath);

		//equations preparation
		for (int y = 0; y < equations.size(); y++) {
			String equation = equations.get(y);
			//String[] equationPieces = equation.split(":");
			rightSide = new LinkedList<>();
			//ep.p(equation); 190: 10 19
			//testValues.add(Integer.parseInt(equationPieces[0]));
			int testValue = Integer.parseInt(equation.split(":")[0]);

			for (String split : equation.split(":")[1].split(" ")) {
				if(!split.equals("")){
					rightSide.add(Integer.valueOf(split)); //google difference - parseInt and valueOf
				}				
			}

			//Hardest thing is to try all combinations of + and *
			if(rightSide.size()==1){
				if(rightSide.get(0).equals(testValue)){
					result += testValue;
				}
				break;
			}
			
			
			
		}
		
		return result;
	}
	
}
