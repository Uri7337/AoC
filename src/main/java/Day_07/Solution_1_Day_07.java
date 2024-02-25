package Day_07;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_07 {

	int solution = 0;
	HashMap<String,Integer> hshmp = new HashMap<String, Integer>();

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_07_test_2015.txt";
//		String filepath = "./src/main/resources/Day_07_2015.txt";
		file = rf.getInput(filepath);

		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lineparts = line.split(" ");
			
			//NOT
			if(lineparts[0].equals("NOT")){
				int value = hshmp.get(lineparts[1]);
				value = ~value;
   value = 65536 - value;
				hshmp.put(lineparts[3], value);
				
			//numbers
			}else if(lineparts[0].matches(".*\\d.*")){
				int value = Integer.parseInt(lineparts[0]);
				hshmp.put(lineparts[2], value);
				
			//letters	
			}else{
				String gate = lineparts[1];
	
				int value1 = hshmp.get(lineparts[0]);
				int value2 = lineparts[2].matches(".*\\d.*") ? Integer.parseInt(lineparts[2]) : hshmp.get(lineparts[2]);
				int value = 0;
				
				switch (gate) {
					case "AND":
						value = value1 & value2;
						break;
					case "OR":
						value = value1 | value2;
						break;
					case "LSHIFT":
						
						value = value1 << value2;
						break;
					case "RSHIFT":
						
						value = value1 >> value2;
						break;
					default:
						throw new AssertionError();
				}
				hshmp.put(lineparts[4], value);
				
			}
			 

		} 
		System.out.println(hshmp);
		return solution;
	}

	
}
