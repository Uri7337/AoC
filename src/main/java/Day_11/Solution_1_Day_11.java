package Day_11;

import Shared.ReadFile;

import java.util.ArrayList;

public class Solution_1_Day_11 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_11_test_2015.txt";
//		String filepath = "./src/main/resources/Day_11_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			testStrings(line);
		}
		solution = 0;
		return solution;
	}

	public void testStrings(String line) {
		switch (line) {
			case "hijklmmn":
				// code block
				break;
			case "abbceffg":
				// code block
				break;
				case "abbcegjk":
				// code block
				break;
				case "abcdefgh":
				// code block
				break;
				case "ghijklmn":
				// code block
				break;
			default:
			// code block
		}
	}
	
	public void testStraight(String line){
		boolean straight = Straight(line);
		if(straight){
			System.out.println("1. rule: Correct");
		}else{
			System.out.println("1. rule: Wrong");
		}
		
	}
	
	public boolean Straight(String line){
		boolean isStraight = false;
		
		
		
		return isStraight;
	}
}
