package Day_04;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_04 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res = 0;

	class Position{
		int x;
		int y;

		Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}

	

	class PaperRoll extends Position{
		int totalRollsAround = 0;

		PaperRoll(int x, int y){
        	super(x,y);
    	}

		boolean amIAccessible(){
			return totalRollsAround<4 ? true : false; 
		}

		void isAround(PaperRoll paperRoll){
			if(paperRoll.x>=(this.x-1) && paperRoll.x<=(this.x+1)){
				if(paperRoll.y>=(this.y-1) && paperRoll.y<=(this.y+1)){
					
					if(!(this.x ==paperRoll.x && this.y ==paperRoll.y)){
						this.totalRollsAround++;
					}
					
				}
			}
		}

	}


	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		res = 0;

		ArrayList<PaperRoll> paperRolls = new ArrayList<>();

		PaperRoll pr;

		for (int i = 0; i < file.size(); i++) {
			
			String line = file.get(i);
			for (int j = 0; j < line.length(); j++) {
				if(line.charAt(j)== '@'){
					pr = new PaperRoll(j,i);
					paperRolls.add(pr);
				}
			}


        }
		
		for (PaperRoll ogPaperRoll : paperRolls) {
			for (PaperRoll paperRoll : paperRolls) {
				ogPaperRoll.isAround(paperRoll);
			}

			if(ogPaperRoll.amIAccessible()){
				res++;
			}
		}
		
		//1346
        return res;
    }
	
}
