package Day_12;

import Shared.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_1_Day_12 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_12_test_2019.txt";
		String filepath = "./src/main/resources/Day_12_2019.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String regex = "[^-\\d]+"; 
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			//find all Not number symobols and replace them with single ,
			line = line.replaceAll(regex, ",");
			
			//there was space infront of the first number.
			line = line.substring(1);
			
			
			String[] lineArray = line.split(",");
			
			for (String linePiece : lineArray){
				numbers.add(Integer.parseInt(linePiece));
			}
			
			for (int n :numbers){
				solution = solution + n;
				
			}
			
		}
		
		
		return solution;
	}
	

	//prints content, System.out.println is way too long
	public void p(String content) {
		System.out.println(content);
	}
	
	// ----debug zone----
	

}
