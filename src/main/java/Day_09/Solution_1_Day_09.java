/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_09;

import Shared.ReadFile;
import java.util.ArrayList;

/**
 *
 * @author ourie
 */

/*
For example, given the following distances:
London to Dublin = 464
London to Belfast = 518
Dublin to Belfast = 141

The possible routes are:
Dublin -> London -> Belfast = 982
London -> Dublin -> Belfast = 605
London -> Belfast -> Dublin = 659
Dublin -> Belfast -> London = 659
Belfast -> Dublin -> London = 605
Belfast -> London -> Dublin = 982 

The shortest of these is London -> Dublin -> Belfast = 605.
 */
public class Solution_1_Day_09 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_09_test_2015.txt";
		String filepath = "./src/main/resources/Day_09_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String[] line_parts = file.get(i).split(" ");

			

			

			
		}

		solution = 0;

		return solution;
	}

}
