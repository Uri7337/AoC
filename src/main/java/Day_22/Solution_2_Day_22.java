/*
I do not have branch 2019 yet so this is temporary...
now when i play this day i have 2 problems
1. i do have not have space between cards, hard to say if that is a whole card.  
maybe function dealWithIncrement could be wrong bcs i take first index and that is not the whole number
*/

package Day_22;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.BigInteger;

public class Solution_2_Day_22 {

	int solution = 0;

//	List deck = createDeck(10); //from 0 to 9
	BigInteger deckCards = new BigInteger("119315717514047");
	List<BigInteger> deck = createDeck(deckCards); //from 0 to 119315717514047 

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_22_test_2019.txt";
		String filepath = "./src/main/resources/Day_22_2019.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (BigInteger i = BigInteger.ZERO; i.compareTo(deckCards) < 0; i = i.add(BigInteger.ONE)) {
            for (int j = 0; j < file.size(); j++) {
				String command = file.get(j);
	//			commandParser(command);
			}
        }
		
		p(deck);
//		compareResults();
		solution = deck.indexOf(2019);
		return solution;
	}

//	public void commandParser(String command) {
//		String[] commandParts = command.split(" ");
//		switch (commandParts[0]) {
//			case "cut":
//				cut(Integer.parseInt(commandParts[1]));
//				break;
//			case "deal":
//				if (commandParts[3].equals("stack")) {
//					dealIntoNewStack();
//				} else {
//					dealWithIncrement(Integer.parseInt(commandParts[3]));
//				}
//				break;
//		}
//	}
//
//	public void dealIntoNewStack() {
//		List<Integer> reverseDeck = new ArrayList<Integer>();
//		reverseDeck.addAll(deck);
//		Collections.reverse(reverseDeck);
//		deck = reverseDeck;
//	}
//
//	public void cut(int n) {
//		if (n < 0) {
//			n = deck.size()+ n;
//		}
//		List<Integer> deckParts0 = deck.subList(0, n);
//		List<Integer> deckParts1 = deck.subList(n,deck.size());
//		List<Integer> cutDeck = new ArrayList<Integer>();
//		cutDeck.addAll(deckParts1);
//		cutDeck.addAll(deckParts0);
//		deck = cutDeck;
//	}
//
//	public void dealWithIncrement(int inc) {
//		List<Integer> incrementedDeck = new ArrayList<Integer>();
//		incrementedDeck.addAll(deck);
//		int index = 0;
//		int deckSize = deck.size();
//
//		for (int i = 1; i < deckSize; i++) {
//			index = (inc * i) % deckSize;
//			incrementedDeck.set(index, (Integer) deck.get(i));
//		}
//		deck = incrementedDeck;
//	}

	public List<BigInteger> createDeck(BigInteger deckSize) {
		  List<BigInteger> createdDeck = new ArrayList<>();
		for (BigInteger i = BigInteger.ZERO; i.compareTo(deckSize) < 0; i = i.add(BigInteger.ONE)) {
			createdDeck.add(i);
		}
		return createdDeck;
	}

	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}

	// ----debug zone----
	 public void compareResults() {
        ArrayList<Integer> val1 = new ArrayList<>(Arrays.asList(0, 3, 6, 9, 2, 5, 8, 1, 4, 7));
        ArrayList<Integer> val2 = new ArrayList<>(Arrays.asList(3, 0, 7, 4, 1, 8, 5, 2, 9, 6));
        ArrayList<Integer> val3 = new ArrayList<>(Arrays.asList(6, 3, 0, 7, 4, 1, 8, 5, 2, 9));
        ArrayList<Integer> val4 = new ArrayList<>(Arrays.asList(9, 2, 5, 8, 1, 4, 7, 0, 3, 6));

        if (deck.equals(val1)) {
            System.out.println(val1);
        } else if (deck.equals(val2)) {
            System.out.println(val2);
        } else if (deck.equals(val3)) {
            System.out.println(val3);
        } else if (deck.equals(val4)) {
            System.out.println(val4);
        } else {
            System.out.println("Deck does not match any predefined values.");
        }
    }
}