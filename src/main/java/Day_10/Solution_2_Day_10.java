/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_10;

import Shared.ReadFile;

import java.util.ArrayList;


/**
 *
 * @author ourie
 */


public class Solution_2_Day_10 {

	int solution = 0;

	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_10_test_2015.txt";
		String filepath = "./src/main/resources/Day_10_2015.txt";
		file = rf.getInput(filepath);
		
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String[] line_parts = file.get(i).split(" ");

			
		}
		
		
		
		solution = 0;
		
		return solution;
	}
	
	

	
	
	
}
