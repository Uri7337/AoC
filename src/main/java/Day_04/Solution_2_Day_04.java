package Day_04;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_04 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	ArrayList<String> file;

	public Object getSolution(String filepath) {
		int result = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		final char[][] map = new char[file.size()][file.get(0).length()];
		// changing the map to 2 dim array[][]
		for (int i = 0; i < file.size(); i++) {
			char[] tempArr = file.get(i).toCharArray();
			for (int j = 0; j < tempArr.length; j++) {
				map[i][j] = tempArr[j];
			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				char currChar = map[i][j];
				if (currChar == 'A') {
					result += goAroundAndFindMAS(j, i, map);
				}
			}
		}

		return result;
	}

	int goAroundAndFindMAS(int x, int y, char[][] map) {
		
		Xmap A = new Xmap(
			loadParts(0, x, y, map),
			loadParts(1, x, y, map),
			loadParts(2, x, y, map),
			loadParts(3, x, y, map)
		);

		if(A.containsDot()){ return 0;}
		
		//A.printA();
		
		if(A.isCorrect()){return 1;}

		return 0;
	}

	char loadParts(int dir, int x, int y, char[][] map) {

		final int a, b, c, d;

		a = 0; 			// Hranice - Horní Strana Mapy
		b = map[0].length-1; 	// Hranice - Pravá Strana Mapy
		c = map.length-1; 	// Hranice - Spodní Strana Mapy
		d = 0;				// Hranice - Levá Strana Mapy

		// x = 0
		//int[] x0 = { 3, 4, 5 };
		// y = 0
		//int[] y0 = { 5, 6, 7 };
		// y = c
		//int[] yc = { 1, 2, 3 };
		// x = b
		//int[] xb = { 0, 1, 7 };

		switch (dir) {
			case 0: // Směr - Doleva Nahoru ↖
				if (x==d || y==a) {
					return '.';
				}else{
					x--;
					y--;
					return map[y][x];
				}
				

			case 1: // Směr - Doprava Nahoru ↗
				if (x==b || y==a) {
					return '.';
				}else{
					x++;
					y--;
					return map[y][x];
				}
			
			case 2: // Směr - Doleva Dolů ↙
				if (x==d || y==c) {
					return '.';
				}else{
					x--;
					y++;
					return map[y][x];
				}

			case 3: // Směr - Doprava Dolů ↘
				if (x==b || y==c) {
					return '.';
				}else{
					x++;
					y++;
					return map[y][x];
				}
				

						
		}
		return '.';
	}

	

	// ----debug zone----

}

class Xmap{
	char ul = '.';
	char ur = '.';
	char dl = '.';
	char dr = '.';
	int num = 0;

    public Xmap(char ul, char ur, char dl, char dr) {
		this.ul = ul;
		this.ur = ur;
		this.dl = dl;
		this.dr = dr;	
    }

	boolean containsDot(){
		return ul == '.' || ur == '.' || dl == '.' || dr == '.';
	}

	void printA(){
		System.out.println(ul+"."+ur);
		System.out.println(".A.");
		System.out.println(dl+"."+dr);
		System.out.println("isCorrect: "+this.isCorrect() +" " +this.num);
	}

	boolean isCorrect(){
		if(this.ul =='M'){
			if(this.ur == 'S'){
				//3
				//num = 3;
				return this.dl == 'M' && this.dr == 'S';

			}else if (this.ur == 'M') {
				//2
				//num= 2;
				return this.dl == 'S' && this.dr == 'S';
			}

		}else if (this.ul =='S') {
			//1,4
			if(this.ur == 'S'){
				//4
				//num = 4;
				return this.dl == 'M' && this.dr == 'M';
			}else if (this.ur == 'M') {
				//1
				//num = 1;
				return this.dl == 'S' && this.dr == 'M';
			}
			
		}

		return false;
	}


}
