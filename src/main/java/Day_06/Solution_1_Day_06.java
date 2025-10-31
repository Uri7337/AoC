package Day_06;

import java.awt.Point;
import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_06 {
	EasyPrint ep = new EasyPrint();

	int distinctPositions = 0;
	
	ArrayList<String> map;

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
		map = new ArrayList<String>();
		map = rf.getInput(filepath);
			

		//Map preparation
		for (int y = 0; y < map.size(); y++) {
			String line = map.get(y);
			//ep.p(line);
			String[] linePieces = line.split("");
			for (int x = 0 ; x<linePieces.length;x++) {
				
				if(linePieces[x].equals(obstructionSymbol)){
					obstruction = new Point(x,y);
					obstructions.add(obstruction);
				}else if (linePieces[x].equals(guardUpSymbol)) {
					guard = new Point(x,y);
				}
				
			}
		}
		
		//Movement
		// 1	^
		// 2	>
		// 3	v
		// 4	<
		int direction = 1;
		
		while (true) {
			//ep.p("guard: " + guard.x +" "+guard.y +" "+ direction);
			
			if (offMap(guard,map)) {
				break;
			}
			
			switch (direction) {
				case 1 -> {
					if(isThereObstruction(guard.x,guard.y-1,obstructions)){
						direction = rotate(direction);
						//ep.p(direction);
					}else{
						writePath(guard);
						guard.move(guard.x,guard.y-1);
					}
                }
			
				case 2 -> {
					if(isThereObstruction(guard.x+1,guard.y,obstructions)){
						direction = rotate(direction);
					}else{
						writePath(guard);
						guard.move(guard.x+1,guard.y);
					}
                }

				case 3 -> {
					if(isThereObstruction(guard.x,guard.y+1,obstructions)){
						direction = rotate(direction);
					}else{
						writePath(guard);
						guard.move(guard.x,guard.y+1);
					}
                }
					
				case 4 -> {
					if(isThereObstruction(guard.x-1,guard.y,obstructions)){
						direction = rotate(direction);
					}else{
						writePath(guard);
						guard.move(guard.x-1,guard.y);
					}
                }
			}
			
		}
		//ep.p(guardUniqueSteps);

		distinctPositions = guardUniqueSteps.size();
		return distinctPositions;
	}

   //loop				- done
	//check borders		- done
	//look				- 
	//move				-
	//  - write path 	-
	//rotate 			- done

	int rotate(int dir){
		return (dir%4)+1;
	}
	
	boolean offMap(Point guard, ArrayList<String> map){
		// Edges - up && left < 0
		int rightEdge = map.get(0).length();
		int bottomEdge = map.size(); 

		return (0 > guard.x || 0 > guard.y || guard.x > rightEdge || guard.y > bottomEdge);
	}

	boolean isThereObstruction(int x, int y, ArrayList<Point> obstructions){
		Point p = new Point(x,y);
		return obstructions.contains(p);
	}

	void writePath(Point guard){
		Point p = new Point(guard.x,guard.y);
		if(!guardUniqueSteps.contains(p)){
			
			guardUniqueSteps.add(p);
		}
		
	}
	// ----debug zone----
	
}
