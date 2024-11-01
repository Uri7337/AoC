package Day_07;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1_Day_07 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	HashMap<String, Integer> pokerCards = new HashMap<String, Integer>();

	ArrayList<String> file;

	ArrayList<Hand> hands = new ArrayList<Hand>();

	public Object getSolution(String filepath) {

		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		// prepare poker cards
		pokerCards.put("A", 14);
		pokerCards.put("K", 13);
		pokerCards.put("Q", 12);
		pokerCards.put("J", 11);
		pokerCards.put("T", 10);

		for (int i = 2; i < 10; i++) {
			pokerCards.put(i + "", i);
		}

		// Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lineParts = line.split(" ");

			String[] cards = lineParts[0].split("");
			String bid = lineParts[1];
			hands.add(new Hand(Integer.parseInt(bid), cards));
			
		}
		
		//order hands by rank (max rank = hands.size()); lowest rank is 1;

		//count total winnings (bid * rank) + (bid * rank) ....

		return solution;
		// ----debug zone----

	}

	class Hand {
		int bid;
		String[] hand;

		int[] handVal;
		int type;
		// 7 Five of a kind
		// 6 Four of a kind
		// 5 Full house
		// 4 Three of a kind
		// 3 Two pair
		// 2 One pair
		// 1 High card

		public Hand(int bid, String[] hand) {
			this.bid = bid;
			this.hand = hand;
			this.handVal = getHandVal();
			this.type = getType();
		}

		int[] getHandVal() {
			int[] x = { getVal(0), getVal(1), getVal(2), getVal(3), getVal(4) };
			return x;
		}

		int getVal(int x) {

			return pokerCards.get(this.hand[x]);
		}

		int getType() {
			// 7 Five of a kind, where all five cards have the same label: AAAAA
			// 6 Four of a kind, where four cards have the same label and one card has a
			// different label: AA8AA
			// 5 Full house, where three cards have the same label, and the remaining two
			// cards share a different label: 23332
			// 4 Three of a kind, where three cards have the same label, and the remaining
			// two cards are each different from any other card in the hand: TTT98
			// 3 Two pair, where two cards share one label, two other cards share a second
			// label, and the remaining card has a third label: 23432
			// 2 One pair, where two cards share one label, and the other three cards have a
			// different label from the pair and each other: A23A4
			// 1 High card, where all cards' labels are distinct: 23456
			
			int t = 0;
			//create array with 15 zeroes.
			int[] frequencyArray = new int[15];
			HashMap<Integer,Integer> nCards = new HashMap<>();

			//increment the zero on index of the card value
			for (int num : handVal) {
				frequencyArray[num]++;
			}

			//save only filled values
			for (int i = 0; i < frequencyArray.length; i++) {
				if(frequencyArray[i]>0){
					nCards.put(i, frequencyArray[i]);
				}
			}	
			
			
				//7
				if(nCards.containsValue(5)){
					t = 7;
					return t;
				}
				//6
				if(nCards.containsValue(4)){
					t = 6;
					return t;
				}
				//5,4
				if(nCards.containsValue(3)){
					if(nCards.containsValue(2)){
						//5
						t = 5;
					}else{
						//4
						t = 4;
					}
					return t;
				}
				//3,2
				if(nCards.containsValue(2)){
					//i hope there is a cleaner way...
					//remove the found 2 to leave only one or none 2
					for (int i : nCards.keySet()) {
						if(nCards.get(i) == 2 ){
							nCards.remove(i);
							break;
						}
					}
					
					if(nCards.containsValue(2)){
						//3
						t = 3;
						
					}else{
						//2
						t = 2;
					}
					return t;
				}
				
				//1
				if(nCards.containsValue(1)){
					t = 1;
					for (int i : nCards.values()) {
						if(i != 1 ){
							t = 0;
							break;
						}
					}
					return t;
				}

			return t;
		}

	}

	Hand handCompare(Hand toMayto, Hand toMahto) {
		// handCompare is called if types are same
		boolean nextCard = false;
		int sameValues = 0;

		for (int y = 0; y < 5; y++) {
			for (int h = 0; h < 5; h++) {
				// 3 conditions
				// same hand
				if (toMayto.handVal[y] == toMahto.handVal[h]) {
					sameValues++;
					nextCard = true;
					break;
				}
				if (toMayto.handVal[y] > toMahto.handVal[h]) {
					// bigger left hand
					return toMayto;
				} else {
					// smaller left hand
					return toMahto;
				}

			}

			if (nextCard) {
				nextCard = false;
				continue;
			}
		}

		if (sameValues == 5) {
			ep.p("sameHand, we have a problem!");
		}

		// returns stronger hand
		return toMayto;
	}

	
}