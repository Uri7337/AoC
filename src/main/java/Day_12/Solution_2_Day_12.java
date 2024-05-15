package Day_12;

import Shared.ReadFile;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.List;

public class Solution_2_Day_12 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_12_test_2015.txt";
//		String filepath = "./src/main/resources/Day_12_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String regex = "\\{[^}]*red[^}]*\\}"; 
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			// Create Gson object
			Gson gson = new Gson();

			// Convert string to JSON
			Object jsonObject = gson.fromJson(line, Object.class);
			
			if (jsonObject instanceof List) {
				List jo = (List) jsonObject;
				for (Object object : jo) {
					System.out.println(object.getClass());   
				}
			}

			// Print JSON object
			System.out.println(jsonObject.getClass());   
			
//			//find all red objects and replace them with ""
//			line = line.replaceAll(regex, "");
//			
//			//then change the regex for everything but numbers and clear string again 
//			regex = "[^-\\d]+"; 
//			line = line.replaceAll(regex, ",");
//			
//			
//			//there was space infront of the first number.
//			line = line.substring(1);
//			
//			
//			String[] lineArray = line.split(",");
//			
//			for (String linePiece : lineArray){
//				numbers.add(Integer.parseInt(linePiece));
//			}
//			
//			for (int n :numbers){
//				solution = solution + n;
//				
//			}
			
		}
		
		
		return solution;
	}
	

	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}
	
	// ----debug zone----
	

}
