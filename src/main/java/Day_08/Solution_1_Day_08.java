package Day_08;

import Shared.ReadFile;
import Shared.EasyPrint;
import java.util.ArrayList;

import java.awt.Point;

public class Solution_1_Day_08 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

    ArrayList<ArrayList<Light>> rows = new ArrayList<ArrayList<Light>>();
    ArrayList<Light> columns = new ArrayList<Light>();        

    

	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_08_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_08_2016.txt";
		file = rf.getInput(filepath);

        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 50; col++){
                
            }
        }

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
		}

		return solution;
	}



	// ----debug zone----
	
}

