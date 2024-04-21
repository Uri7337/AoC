/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_10;

import Shared.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  1
 * 1 good, what is the next number? there is none. 11 then.
 * 11
 * 1 good, next n is 1 good, next n? there is none. 21 then.
 * 21
 * 
 * if()
 * 
 * if(counter ==3){
 * 
 *	//reset counter
 * }
 * comparingNumber=n;
 * counter:  1   2   3   1   1   1   2
 * 
 *   index:  0   1   2   3   4   5   6
 * 
 *	     n:  1   1   1   2   3   1   1
 * 
 * 
 *  counter:  1   
 * 
 *   index:  0   
 * 
 *	     n:  1   
 * 
 * -1. highest number 3. repeat number count 3-1 times
 * 0. first number					  1
 * 1. Is there second number?		 yes								  no
 *							1.1. 1 equals? yes	counter++;		1.3. move x index
 *							1.2. 1 equals? yes  counter++;
 *					
 * ----
 * @author ourie
 *
 * 1321131112 40x 1 5x
 */

/*
String result = "" + a + b + c + d + e
String.valueOf(result)

for (i=0;i<line.length ;i++){

 If (line[i]=1){
  If ( line[i+1] < line.length && line[i+1]=1){ 
   If (line[i+2] < line.length && line[i+2]=1 ){
  
   }
  }
} 
 */
public class Solution_1_Day_10 {

	int solution = 0;
	int repeat = 3;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_10_test_2015.txt";
//		String filepath = "./src/main/resources/Day_10_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			

			lookAndSay(line);

			testSolution(solution);
		}

		solution = 0;

		return solution;
	}

	public void lookAndSay(String line) {
		
		for (int i = 0; i < repeat; i++) {
			String oldline = line;
			String[] lineArray = line.split("");
			String iAmHere = lineArray[0];
			int counter = 0;
			for (int j = 1; j < oldline.length(); j++) {
				if (iAmHere.equals(lineArray[j])){
					counter++;
				} 
				
				
			}
		}
	}

//	public String lineMaker(int pos, String[] lineArray) {
//		//Is this last number?
//		if((pos+1)<lineArray.length){
//			//Where am I?
//			
//			//What is the next number?
//			String nextNumber = 
//				return "fine";
//			//If this was last number	
//			}else{
//				return "fine";
//			}
//	}
	
	public static void testSolution(int sol) {
		if (sol == 312211) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
