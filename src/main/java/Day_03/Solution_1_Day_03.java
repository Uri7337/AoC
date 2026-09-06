package Day_03;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_03 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	public class Square{
		int x;
		int y;
		int direction; // 0=RIGHT;1=UP;2=LEFT;3=DOWN
		int number;

		Square(int num, int dir, int x, int y){
			this.number = num;
			this.direction = dir;
			this.x = x;
			this.y = y;
		}


		// 0=RIGHT
		// 1=UP
		// 2=LEFT
		// 3=DOWN
		public int getDirection() {
			return this.direction;
		}

		

		
	}

	void move(Square s){

	}

	boolean checkSurroundings(Square sq, ArrayList<Square> squares){
			
		switch (sq.direction) {
			case 0:
				//check up
				break;
			case 1:
				//check right
				
				break;
			case 2:
				//check down
				
				break;
			case 3:
				//check right
				
				break;
		
			default:
				break;
		}

		return false;
	}

	public Object getSolution(String filepath) {

		res = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		ArrayList<Square> squares = new ArrayList<>();
		

		for (int y = 0; y < file.size(); y++) {
		
			int target = Integer.parseInt(file.get(y));
			
			Square s = new Square(1, 0, 0, 0);
			squares.add(s);

			while(s.number!=target){
				//move
				move(s);
				boolean newSide = checkSurroundings(s, squares);
				if(newSide){

				}else{
					
				}
			}


		
			
		}

		
		return res;
	}

}
