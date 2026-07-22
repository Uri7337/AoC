package Day_04;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_04 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	class Card{
		int[] lines;
		int[] columns;

		

		void addnums(String[] nums){
			for (Object num : nums) {
				
			}
		}
	}
	
	public Object getSolution(String filepath) {

		res = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		ArrayList<Card> cards = new ArrayList<>();
		Card card = new Card(); 

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			String[] commands;

			if(y == 0){
				commands = line.split(",");
			}else if(line.equals("")){
				cards.add(card);
				card = new Card();
			}else{
				commands = line.split(" ");
				card.addnums(commands);
			}
			

		}
		
		return res;
	}

}


// test example
/*

	7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1

	22 13 17 11  0
	8  2 23  4 24
	21  9 14 16  7
	6 10  3 18  5
	1 12 20 15 19

	3 15  0  2 22
	9 18 13 17  5
	19  8  7 25 23
	20 11 10 24  4
	14 21 16 12  6

	14 21 17 24  4
	10 16 15  9 19
	18  8 23 26 20
	22 11 13  6  5
	2  0 12  3  7
	 
	*/
	