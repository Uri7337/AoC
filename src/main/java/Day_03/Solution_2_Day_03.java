package Day_03;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.awt.Point;

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
					Gear g = new Gear(j,i);
					if(g.gearRatio !=-1){
						sum(g.gearRatio);
					}
				}
			}
		}
		test(sumOfPartNumbers);
		return solution = sumOfPartNumbers;
	}

	void sum(int num){
		sumOfPartNumbers += num;
	}

	class Gear{
		Point p;
		ArrayList<Integer> partNumbers;
		int gearRatio;
		
		Gear(int x, int y){
			this.p = new Point(x,y);
			this.partNumbers = checkSurroundings(x, y);
			this.gearRatio = -1;	
		}

		ArrayList<Integer> checkSurroundings(int x, int y){
			partNumbers = new ArrayList<Integer>();
			
			//scan top (x-1, y-1)
			for (int i = x-1; i < x+2; i++) {
				if( (y-1)>=0 && i>=0 && i<file.get(i).length() ){
					if(Character.toString(file.get(y-1).charAt(i)).matches("[0-9]")){
						scanWholeNumber(i,y-1);
					}
				}
			}
			//ep.p("");
			//scan middle (x-1, y)
			
			//scan bottom (x-1, y+1)
			
			if(partNumbers.size() == 2){
				getGearRatio();
			}

			return partNumbers;
		}

		int scanWholeNumber(int x, int y){
			String n = "";
	
			for (int i = x; i < file.get(y).length(); i++) {
				
			}

			return Integer.parseInt(n);
		}

		private void getGearRatio() {
			gearRatio = partNumbers.get(0) * partNumbers.get(1);
		}	
	}


	// ----debug zone----
	void test(int x){
		if(x==467835){
			ep.p("test OK");
		}else{
			ep.p("test NOT OK");
		}
	}
}
