package Day_06;



import java.util.ArrayList;
import java.util.LinkedList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_06 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res;

	class Pillar {
		ArrayList<String> nums;
		char symbol; // + *
		long res = 0; 

		void addmult(){
			for (int i = 0; i < nums.size(); i++) {
				switch (symbol) {

					case '+' -> {
						res += Long.valueOf(nums.get(i));
                    }
						
					case '*' -> {
						res *= Long.valueOf(nums.get(i));
                    }

					default -> ep.p(symbol);
				}
			}
		}

	}


	public Object getSolution(String filepath) {

		res = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		ArrayList<Pillar> pillars = new ArrayList<>();
		LinkedList<String> linePieces = new LinkedList<>();

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			String[] sarr = line.split(" ");

			for (int i = 0; i < sarr.length; i++) {
				String s = sarr[i].strip();
				if(!s.equals("")){
					linePieces.add(s);
				}
				
				
				
			}

			for (int i = 0; i < linePieces.size(); i++) {
				ep.p(linePieces.get(i));
			}
			
			Pillar p = new Pillar();
			
			
		}

		for (Pillar pil : pillars) {
			res += pil.res;
		}

	


		
        return res;
    }
	
}
