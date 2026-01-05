package Day_06;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_06 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long grandTotal;

	class Pillar {
		int id;
		ArrayList<String> nums = new ArrayList<>();
		String symbol; // + *
		long res = 0; 

		Pillar(int id){
			this.id = id;
		}

		void addmult(){
			if(symbol.equals("*")){
				this.res =1;
			} 
			for (int i = 0; i < nums.size(); i++) {
				switch (symbol) {

					case "+" -> {
						res += Long.valueOf(nums.get(i));
                    }
						
					case "*" -> {
						res *= Long.valueOf(nums.get(i));
                    }

					default -> ep.p(symbol);
				}
			}
		}

		void showNums(){
			for (int i = 0; i < nums.size(); i++) {
				ep.np(nums.get(i));
				if(i<nums.size()-1)ep.np(" "+symbol+" ");
				if(i==nums.size()-1)ep.np(" = " +this.res);
			}
			ep.p("");
		}

	}


	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		HashMap<Integer, Pillar> pillars = new HashMap<>();
		LinkedList<String> linePieces;

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			String[] sarr = line.split(" ");
			linePieces = new LinkedList<>();

			for (int i = 0; i < sarr.length; i++) {
				String s = sarr[i].strip();

				if(!s.equals("")){
					linePieces.add(s);
				}
			}

			for (int i = 0; i < linePieces.size(); i++) {
				String linePiece = linePieces.get(i);
				//ep.p(linePiece);
				if(pillars.get(i)==null){
					Pillar p = new Pillar(i);
					pillars.put(i, p);
				}

				if(linePiece.equals("*") || linePiece.equals("+") ){
						pillars.get(i).symbol = linePiece;
				}else{
					pillars.get(i).nums.add(linePiece);
				}
			}
			
						
			
			
		}

		for (int i = 0; i < pillars.size(); i++) {
			Pillar p = pillars.get(i);
			p.addmult();
			//p.showNums();
			grandTotal += p.res;
		}

	


		
		//4771265398012
        return grandTotal;
    }
	
}
