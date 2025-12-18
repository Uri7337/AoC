package Day_03;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_03 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res = 0;


	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		res = 0;

		for (int i = 0; i < file.size(); i++) {
			
			String line = file.get(i);
			String[] s = line.split("");



        }
		
		
        return res;
    }
	
}
