package Day_07;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_07 {

	int solution = 0;
	HashMap<String,Integer> hshmp = new HashMap<String, Integer>();
	Board b = new Board();
	
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_07_test_2015.txt";
		String filepath = "./src/main/resources/Day_07_2015.txt";
		file = rf.getInput(filepath);
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lineparts = line.split(" ");
			
			int value = 0;
			
			//NOT
			if(lineparts[0].equals("NOT")){
				if((hshmp.get(lineparts[1]) == null)){
					hshmp.put(lineparts[1], 0);
				}
				value = hshmp.get(lineparts[1]);
				value = ~value;
				value = 65536 + value;
				hshmp.put(lineparts[3], value);
				
			//numbers
			}else if(lineparts[0].matches(".*\\d.*")){
				value = Integer.parseInt(lineparts[0]);
				hshmp.put(lineparts[2], value);
				
			//letters	
			}else{
				String gate = lineparts[1];
				if((hshmp.get(lineparts[0]) == null)){
					hshmp.put(lineparts[0], 0);
				}
				
				if((hshmp.get(lineparts[2]) == null)){
					hshmp.put(lineparts[2], 0);
				}
				
				
				int value1 = 0;
				int value2 = 0;
			
				value1 = hshmp.get(lineparts[0]);
				value2 = lineparts[2].matches(".*\\d.*") ? Integer.parseInt(lineparts[2]) : hshmp.get(lineparts[2]);
						
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
					case "->":
						hshmp.put(lineparts[2], value1);
						break;
					default:
						throw new AssertionError();
				}
				if(4 < lineparts.length){
					hshmp.put(lineparts[4], value);
				}else{
					hshmp.put(lineparts[2], value);
				}
				
				
			}
			 

		} 
		System.out.println(hshmp);
		solution = hshmp.get("a");
		return solution;
	}

	
}
