package Day_04;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;

public class Solution_1_Day_04 {
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
				if (currChar == 'X') {
					result += goAroundAndFindXMAS(j, i, map);
				}
			}
		}

		return result;
	}

	int goAroundAndFindXMAS(int x, int y, char[][] map) {
		int xmasCounter = 0;

		// for loop around X (checks all directions)
		for (int dir = 0; dir < 8; dir++) {
			if (findXMAS(dir, x, y, 'M', map)) {
				xmasCounter++;
			}
		}

		return xmasCounter;
	}

	boolean findXMAS(int dir, int x, int y, char part, char[][] map) {

		final int a, b, c, d;

		a = 0; 			// Hranice - Horní Strana Mapy
		b = map[0].length-1; 	// Hranice - Pravá Strana Mapy
		c = map.length-1; 	// Hranice - Spodní Strana Mapy
		d = 0;				// Hranice - Levá Strana Mapy

		// x = 0
		int[] x0 = { 3, 4, 5 };
		// y = 0
		int[] y0 = { 5, 6, 7 };
		// y = c
		int[] yc = { 1, 2, 3 };
		// x = b
		int[] xb = { 0, 1, 7 };

		switch (dir) {
			case 0: // Směr - Doprava →
				if (x==b) {
					return false;
				}else{
					x++;
				}
				break;

			case 1: // Směr - Doprava Dolů ↘
				if (x==b || y==c) {
					return false;
				}else{
					x++;
					y++;
				}
				break;

			case 2: // Směr - Dolů ↓
				if (y==c) {
					return false;
				}else{
					y++;
				}
				break;

			case 3: // Směr - Doleva Dolů ↙
				if (x==d || y==c) {
					return false;
				}else{
					x--;
					y++;
				}
				break;

			case 4: // Směr - Doleva ←
				if (x==d) {
					return false;
				}else{
					x--;
				}
				break;

			case 5: // Směr - Doleva Nahoru ↖
				if (x==d || y==a) {
					return false;
				}else{
					x--;
					y--;
				}
				break;

			case 6: // Směr - Nahoru ↑
				if (y==a) {
					return false;
				}else{
					y--;
				}
				break;

			case 7: // Směr - Doprava Nahoru ↗
				if (x==b || y==a) {
					return false;
				}else{
					x++;
					y--;
				}
				break;
		}

		switch (part) {
			// case 'X':

			// break;

			case 'M':

				break;

			case 'A':

				break;

			case 'S':

				break;
		}

		return false;
	}

	boolean arrContains(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	// ----debug zone----

}
