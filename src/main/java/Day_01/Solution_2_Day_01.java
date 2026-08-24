package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_01 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;
	
	public Object getSolution(String filepath) {

		res = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		ArrayList<Integer> sequenceOfDigits = new ArrayList<>();
		String[] singeDigits = {};

		for (int y = 0; y < file.size(); y++) {
			singeDigits = file.get(y).split("");
			
        }

		for (String digit : singeDigits) {
			sequenceOfDigits.add(Integer.valueOf(digit));
		}

		int listSize = sequenceOfDigits.size();
		for (int i = 0; i < listSize; i++) {

			int fN = sequenceOfDigits.get(i); //firstNumber
			int sN = sequenceOfDigits.get((i+listSize/2)%listSize); //secondNumber
			ep.p(fN+":"+sN);

			if(fN==sN){
				res+=fN;
			}
			
			//12131415 | 8/2 4
			//1212	   | i+2 =
			//		   | 2+2 = 4 % 4 = 
			
			
		}

		ep.p(res);
		return res;
	}

}
