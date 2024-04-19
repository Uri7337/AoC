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
 *
 * 1321131112 40x 
 * 1 5x
 */

/*
String result = "" + a + b + c + d + e
String.valueOf(result)

For (i=0;i<line.length ;i++){

 If (line[i]=1){
  If ( line[i+1] < line.length && line[i+1]=1){ 
   If (line[i+2] < line.length && line[i+2]=1 ){
  
   }
  }
} 
 */
public class Solution_1_Day_10 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_10_test_2015.txt";
//		String filepath = "./src/main/resources/Day_10_2015.txt";
		file = rf.getInput(filepath);

		int repeat = 5;

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			int sol = lookAndSay(line, repeat);
                        System.out.println("done; sol:" +sol);
			testSolution(sol);
		}

		solution = 0;

		return solution;
	}

	public static int lookAndSay(String line, int rep) {
		if (rep > 0) {
                        System.out.println(line);
			return rep + lookAndSay(line, rep - 1);
		} else {
                    
			return 0;
		}
	}

	public static void testSolution(int sol) {
		if (sol == 312211) {
			System.out.println("yes");
		}
	}

}
