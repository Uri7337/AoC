package Day_07;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_07 {
	EasyPrint ep = new EasyPrint();
	int result = 0;

	ArrayList<String> equations;

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		equations = new ArrayList<>();
		equations = rf.getInput(filepath);

		//equations preparation
		for (int y = 0; y < equations.size(); y++) {
			String equation = equations.get(y);
			//ep.p(equation);
			String[] equationPieces = equation.split("");
			
		}
		
		return result;
	}
	
}
