package Day_02;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_1_Day_02 {
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
			int possibleSets = 0;

			for (String set : sets) {
				//cubes
				int rC = 12; //red
				int gC = 13; //green
				int bC = 14; //blue

				
				String [] setParts = set.split(",");
				for (String singleCube : setParts) {
					int cubeCount = Integer.parseInt(singleCube.split(" ")[1]);
					String cubeColor = singleCube.split(" ")[2];

					switch (cubeColor) {
						case "red":
							rC-=cubeCount;
							break;
						case "green":
							gC-=cubeCount;
							break;
						case "blue":
							bC-=cubeCount;
							break;
					
						default:
						ep.p("Game "+gameID+": "+"color did not recognized");
					}
				}

				if(0 <= rC && 0 <= gC && 0 <= bC){
					possibleSets++;
				}

				if(possibleSets==sets.length){
					
					possibleGamesIDCount+=gameID;
					
				}
			}
			
		}

		solution = possibleGamesIDCount;
		return solution;
	}

	// ----debug zone----
	
}
