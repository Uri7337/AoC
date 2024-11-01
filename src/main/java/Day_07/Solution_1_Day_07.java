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
			hands.add(new Hand(Integer.parseInt(bid), cards, i+1));
			
		}
		
		//order hands by rank (max rank = hands.size()); lowest rank is 1;
		reRank();
		//count total winnings (bid * rank) + (bid * rank) ....
		solution = countTotalWinnings();

		return solution;
	}

	// in separate method for cleaner code
	void reRank(){
		printRanks();
		//separate by type into groups
		//learn java comparables
	}

	int countTotalWinnings(){
		int x = 0;
		for (Hand h : hands) {
			x += (h.bid*h.rank);
		}a

		return x;
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

		int rank;

		public Hand(int bid, String[] hand, int rank) {
			this.bid = bid;
			this.hand = hand;
			this.handVal = getHandVal();
			this.type = getType();
			this.rank = rank;
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
			
			//create array with 15 zeroes.
			HashMap<Integer,Integer> nCards = new HashMap<>();

			//increment the zero on index of the card value
			for (int num : handVal) {
				nCards.put(num, nCards.getOrDefault(num, 0)+1);
			}
			
			//nCards.values().stream().sorted().toArray();
				//7
				if(nCards.containsValue(5)){
					
					return 7;
				}
				//6
				if(nCards.containsValue(4)){
					
					return 6;
				}
				//5,4
				if(nCards.containsValue(3)){
					if(nCards.containsValue(2)){
						//5
						return 5;
					}else{
						//4
						return  4;
					}
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
						return  3;
						
					}else{
						//2
						return 2;
					}
				}
				
				//1
				if(nCards.containsValue(1)){
					for (int i : nCards.values()) {
						if(i != 1 ){
							ep.p("type: 0 <-- we have problem!");
							break;
						}
					}
					return 1;
				}

			return 0;
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

	// ----debug zone----
	void printRanks(){
		ep.p("hand  | rank | type");
		for (Hand h : hands) {
			for (int i = 0; i < h.hand.length; i++) {
				ep.np(h.hand[i]);
			}
			ep.np("    ");
			ep.np(h.rank+"      ");
			ep.p(h.type);
		}
		ep.p("");
	}
	
	
}