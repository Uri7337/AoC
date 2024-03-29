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
//		String filepath = "./src/main/resources/Day_08_test_2015.txt";
		String filepath = "./src/main/resources/Day_08_2015.txt";
		file = rf.getInput(filepath);
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lineparts = line.split(" ");

			
			
		}
		

		
	
		return solution;
	}
}
