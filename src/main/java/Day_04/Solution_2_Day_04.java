package Day_04;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.util.HashMap;


public class Solution_2_Day_04 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	

	ArrayList<String> file;
	public Object getSolution(String filepath) {
		int result = 0;
        
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
        ArrayList<Card> cards = new ArrayList<Card>();
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
            String[] lineParts = line.split(":");

            int cardID = Integer.parseInt(lineParts[0].split("  *")[1]);
            String[] winningNumbers = lineParts[1].split("\\|")[0].split("  *");
            String[] myNumbers = lineParts[1].split("\\|")[1].split("  *");

            ArrayList<Integer> wN = convertNumbers(winningNumbers);
            ArrayList<Integer> mN = convertNumbers(myNumbers);
            mN.retainAll(wN);
            int copies = mN.size();
            Card c = new Card(cardID, copies);
            cards.add(c);
        }

        for (int i = 0; i < cards.size(); i++) {
            for (int k = 0; k < cards.get(i).cardCopies; k++) {
                /* ep.p(cards.get(i).cardID); */
                for (int j = cards.get(i).cardID; j < cards.get(i).cardID+cards.get(i).copies; j++) {
                    cards.get(j).cardCopies++;
                    /* ep.p("card: "+cards.get(j).cardID + " card instances: " +cards.get(j).cardCopies); */
                }
                /* ep.p(""); */
            }
           
          }
         /*  ep.p("") */;
          for (Card c : cards) {
            /* ep.p("card: "+c.cardID + " card instances: " +c.cardCopies); */
            result += c.cardCopies;
          }
		return solution = result;
	}

    ArrayList<Integer> convertNumbers(String[] numbers){
        ArrayList<Integer> aL = new ArrayList<>();
        for (int i = 1; i < numbers.length; i++) {
            aL.add(Integer.parseInt(numbers[i]));
        }

        return aL;
    }

    class Card{
        int cardID;
        int cardCopies;
        int copies;
        
        Card(int cardID,int copies){
            this.cardID = cardID;
            this.copies = copies;
            this.cardCopies = 1;
        }

    }

	// ----debug zone----
	
}
