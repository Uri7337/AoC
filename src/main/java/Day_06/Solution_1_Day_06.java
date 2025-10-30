package Day_06;

import java.util.ArrayList;
import java.awt.Point;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_06 {
	EasyPrint ep = new EasyPrint();

	int distinctPositions = 0;
	
	ArrayList<String> file;

	Point obstruction;
	Point guard;

	ArrayList<Point> obstructions = new ArrayList<>();

	// we can filter input into guardUniqueSteps so we do not have to filter it later
	// if(!list.contains(data)) {list.add(data);} 
	ArrayList<Point> guardUniqueSteps = new ArrayList<>();

	String guardUpSymbol = "^";
	String obstructionSymbol = "#";


	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			//ep.p(line);
			String[] linePieces = line.split("");
			for (int j = 0 ; j<linePieces.length;j++) {
				
				if(linePieces[j].equals(obstructionSymbol)){
					obstruction = new Point(i,j);
					obstructions.add(obstruction);
				}else if (linePieces[j].equals(guardUpSymbol)) {
					guard = new Point(i,j);
				}
				
			}
				
			

		}
		
		//ep.p(obstructions);

		return distinctPositions;
	}

	// ----debug zone----
	
}
