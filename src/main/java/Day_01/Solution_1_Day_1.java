package Day_01;

import Shared.ReadFile;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution_1_Day_1 {

	int solution = 0;
	
	Person me = new Person();

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_01_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_01_2016.txt";
		file = rf.getInput(filepath);

		

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
			Object coordinates = Arrays.asList(line.split(", "));

			/* p(coordinates); */

			if (coordinates instanceof List) {
				List<String> coordinateList = (List<String>) coordinates;

				for (String coordinate : coordinateList) {
					me.move(coordinate);
				}
			}
			
			solution = getDistanceFromHQ();
			

		}
		
		
		return solution;
	}
	
	public int getDistanceFromHQ(){
		int x;
		x = Math.abs(me.mapLocation.get(0)) + Math.abs(me.mapLocation.get(1));
		return x;
	}
	


	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}
	
	// ----debug zone----
	

}
