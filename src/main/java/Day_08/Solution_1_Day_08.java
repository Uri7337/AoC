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
public class Solution_1_Day_08 {

	int solution = 0;
	HashMap<String, Integer> hshmp = new HashMap<String, Integer>();
	
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_08_test_2015.txt";
//		String filepath = "./src/main/resources/Day_08_2015.txt";
		file = rf.getInput(filepath);
		
		int total_code = 0;
		int total_string = 0;
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
			int code_sol = line.length();  
			int string_sol = code_sol-2; 
			
			
			
			String[] groups = line.split("\\");
			int j = 0;
			for(String group : groups){
				System.out.println(j);
				j++;
				System.out.println(group);
			}
			
			
			
			printInfo(code_sol,string_sol,line);
			
			total_code = total_code + code_sol;
			total_string = total_string + string_sol;
		}
		

		solution = total_code - total_string;
		
		return solution;
	}
	public void printInfo(int c, int s, String line){
		System.out.print("c:"+c + "|");
		System.out.print("s:"+s + " ");
		System.out.println(line);
	}
}