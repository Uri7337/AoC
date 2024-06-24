/*
	Learn how to handle big numbers
 */
package Day_22;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.BigInteger;
import Shared.Progress;

public class Solution_2_Day_22 {

	int solution = 0;

	BigInteger deckSize = BigInteger.valueOf(119315717514047l);
	BigInteger shuffleTimes = BigInteger.valueOf(101741582076661l);

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_22_test_2019.txt";
		String filepath = "./src/main/resources/Day_22_2019.txt";
		file = rf.getInput(filepath);

		BigInteger position = BigInteger.valueOf(2019);

		
		Progress prg = new Progress(shuffleTimes.longValue(), 100);

		//Insert Solution Here:
		for (BigInteger i = BigInteger.ZERO; i.compareTo(shuffleTimes) < 0; i = i.add(BigInteger.ONE)) {
			prg.progress();
			for (int j = 0; j < file.size(); j++) {
				String command = file.get(j);
				position = applyCommand(position, command, deckSize);
			}
		}

		solution = position.intValue();
		return solution;
	}

	public BigInteger applyCommand(BigInteger position, String command, BigInteger deckSize) {
		String[] parts = command.split(" ");
		if (command.startsWith("deal into new stack")) {
			return deckSize.subtract(BigInteger.ONE).subtract(position);
			
		} else if (command.startsWith("cut")) {
			int n = Integer.parseInt(parts[1]);
			BigInteger cut = BigInteger.valueOf(n);
			return position.subtract(cut).mod(deckSize);
			
		} else if (command.startsWith("deal with increment")) {
			int n = Integer.parseInt(parts[3]);
			BigInteger increment = BigInteger.valueOf(n);
			return position.multiply(increment).mod(deckSize);
			
		}
		return position;
	}

	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}

	// ----debug zone----
}
