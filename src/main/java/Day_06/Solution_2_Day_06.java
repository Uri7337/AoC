package Day_06;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_06 {

	int solution = 0;
	int rows = 1000;
	int columns = 1000;
	Light2[][] lightGrid = new Light2[rows][columns];

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_06_test_2019.txt";
		String filepath = "./src/main/resources/Day_06_2019.txt";
		file = rf.getInput(filepath);

		populateGrid(rows, columns);
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lin = line.split(" ");

			if (lin[0].equals("turn")) {
				if (lin[1].equals("on")) {
					String[] li = lin[2].split(",");
					String[] li2 = lin[4].split(",");
					int[] coords = new int[]{getNum(li[0]), getNum(li[1]), getNum(li2[0]), getNum(li2[1])};
					accessGrid(1, coords[0], coords[1], coords[2], coords[3]);
				} else if (lin[1].equals("off")) {
					String[] li = lin[2].split(",");
	  				String[] li2 = lin[4].split(",");
					int[] coords = new int[]{getNum(li[0]), getNum(li[1]), getNum(li2[0]), getNum(li2[1])};
					accessGrid(2, coords[0], coords[1], coords[2], coords[3]);
				} else {
					System.out.println("Something bad happend while splitting or there is nothing to split");
				}
			} else {
				String[] li = lin[1].split(",");
				String[] li2 = lin[3].split(",");
				int[] coords = new int[]{getNum(li[0]), getNum(li[1]), getNum(li2[0]), getNum(li2[1])};
				accessGrid(3, coords[0], coords[1], coords[2], coords[3]);
			}

		}

		return solution = countGrid(rows,columns);
	}

	public void populateGrid(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				lightGrid[i][j] = new Light2(0, i, j);
			}
		}

	}

	public void accessGrid(int status, int startrows, int startcolumns, int endrows, int endcolumns) {
		for (int i = startrows; i <= endrows; i++) {
			for (int j = startcolumns; j <= endcolumns; j++) {

				switch (status) {
					case 1:
						lightGrid[i][j].turnOn();
						break;
					case 2:
						lightGrid[i][j].turnOff();
						break;
					case 3:
						lightGrid[i][j].toggle();
						break;
					default:
						System.out.println("Something's wrong i can feel it... ");
				}
			}

		}
	}

	public void printGrid(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				String symbol = lightGrid[i][j].getShining()>=1 ? "-" : ".";
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	public int countGrid(int rows, int columns) {
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				counter = counter + lightGrid[i][j].getShining();
			}

		}
		return counter;
	}

	public int getNum(String num) {
		int x = Integer.parseInt(num);
		return x;
	}
}
