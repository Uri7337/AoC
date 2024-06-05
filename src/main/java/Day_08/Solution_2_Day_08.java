/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_08;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ourie
 */
public class Solution_2_Day_08 {

	int solution = 0;
	HashMap<String, Integer> hshmp = new HashMap<String, Integer>();

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_08_test_2019.txt";
		String filepath = "./src/main/resources/Day_08_2019.txt";
		file = rf.getInput(filepath);

		int total_code = 0;
		int total_string = 0;

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			int code_sol = line.length() + 4;
			int string_sol = code_sol - 4;
			int[] sol = {string_sol,code_sol};
			
			int index = line.indexOf('\\');
			while (index >= 0) {
				sol = calcLineVal(line, index, sol);
				index = line.indexOf('\\', index + 2);
			}

			

			printInfo(sol[1], sol[0], line);
			total_code = total_code + sol[1];
			total_string = total_string + sol[0];
		}

		solution = total_code - total_string;

		return solution;
	}

	public void printInfo(int c, int s, String line) {
		System.out.print("c:" + c + "|");
		System.out.print("s:" + s + " ");
		System.out.println(line);
	}

	public int[] calcLineVal(String line, int index, int[] sol) {
		//string 0, code 1
		
		switch (line.charAt(index + 1)) {
			case '\\':
//				sol[0]++;
				sol[1] = sol[1]+2;
				break;
			case '\"':
//				sol[0]++;
				sol[1] = sol[1]+2;
				break;
			case 'x':
//				sol[0] = sol[0] + 3;
				sol[1]++;
				break;
			default:
				throw new AssertionError();
		}
		return sol;
	}
}
