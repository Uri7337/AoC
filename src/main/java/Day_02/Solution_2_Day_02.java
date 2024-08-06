package Day_02;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_2_Day_02 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_02_test_2023.txt"; */
		String filepath = "./src/main/resources/Day_02_2023.txt";
		file = rf.getInput(filepath);

		int possibleGamesIDCount = 0;
		

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			String[] lineParts = line.split(":");

			int gameID = Integer.parseInt(lineParts[0].split(" ")[1]);
			

			String[] sets = lineParts[1].split(";");
			int setsCount = 0;

			//cubes
			int rC = 0; //red
			int gC = 0; //green
			int bC = 0; //blue

			for (String set : sets) {
				

				
				String [] setParts = set.split(",");
				for (String singleCube : setParts) {
					int cubeCount = Integer.parseInt(singleCube.split(" ")[1]);
					String cubeColor = singleCube.split(" ")[2];

					switch (cubeColor) {
						case "red":
							if(cubeCount>rC){
								rC=cubeCount;
							}
							
							break;
						case "green":
							if(cubeCount>gC){
								gC=cubeCount;
							}
							break;
						case "blue":
							if(cubeCount>bC){
								bC=cubeCount;
							}
							break;
					
						default:
						ep.p("Game "+gameID+": "+"color did not recognized");
					}
				}

				setsCount++;
				if(setsCount==sets.length){
					
					possibleGamesIDCount+= (rC*gC*bC);
					
				}
			}
			
		}
		
		solution = possibleGamesIDCount;
		return solution;
	}

	// ----debug zone----
	
}
