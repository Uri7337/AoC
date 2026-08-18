package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_01 {
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

		for (int i = 0; i < sequenceOfDigits.size()-1; i++) {
			int fN = sequenceOfDigits.get(i); //firstNumber
			int sN = sequenceOfDigits.get(i+1); //secondNumber
			
			if(i == 0){
				int lN = sequenceOfDigits.get(sequenceOfDigits.size()-1);
				if(fN==sN && fN==lN){
					res += fN*2;
				}else if(fN==sN || fN==lN){
					res += fN;
				}
			}else{
				if(fN==sN){
					res += fN;
				}
			}

			
			
		}

		ep.p(res);
		return res;
	}

}
