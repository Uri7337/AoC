package Day_07;

import shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_7 {

	int solution = 0;

	ArrayList<String> getcards(ArrayList<String> datacards) {
		ArrayList<String> cards = new ArrayList<String>();
		for (int i = 0; i < datacards.size(); i++) {
			String[] hand = datacards.get(i).split(" ");

			cards.add(hand[0]);
		}
		return cards;
	}
	
	ArrayList<String> getaltcards(ArrayList<String> dataaltcards) {
		ArrayList<String> altcards = new ArrayList<String>();
		for (int i = 0; i < dataaltcards.size(); i++) {
			
			
//			altcards.add(valueOf);
		}
		return altcards;
	}

	ArrayList<Integer> getbids(ArrayList<String> databids) {
		ArrayList<Integer> bids = new ArrayList<Integer>();
		for (int i = 0; i < databids.size(); i++) {
			String[] hand = databids.get(i).split(" ");
			
			bids.add(Integer.parseInt(hand[1]));
		}
		return bids;
	}

	public int getSolution() {

		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "C:/ProgramsUri/ALL_Files/Temp_WorkSpace/Day_07.txt";
		file = rf.getInput(filepath);

		String[] cardsid = {"A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2"};
		int[] cardsvalue = {14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

		ArrayList<String> cards = getcards(file);
		ArrayList<String> altcards = getaltcards(cards);
		ArrayList<Integer> bids = getbids(file);

//		System.out.println();
		
		for (int i = 0; i < cards.size(); i++) {
			
		}

		return solution;
	}

//	apply1Rule() {
//
//	}
//
//	apply2Rule() {
//
//	}
}
