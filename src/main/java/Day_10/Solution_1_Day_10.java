/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_10;

import Shared.ReadFile;

import java.util.ArrayList;

/**
 * 1
 * 1 good, what is the next number? there is none. 11 then. 11 1 good, next n is 1 good, next n? there is none. 21 then. 21
 *
 * if()
 *
 * if(counter ==3){
 *
 *	//reset counter } comparingNumber=n; counter: 1 2 3 1 1 1 2
 *
 * index: 0 1 2 3 4 5 6
 *
 * n: 1 1 1 2 3 1 1
 *
 *
 * counter: 1
 *
 * index: 0
 *
 * n: 1
 *
 * -1. highest number 3. repeat number count 3-1 times 0. first number	1 1. Is there second number?	yes	no 1.1. 1 equals? yes	counter++;	1.3. move x index 1.2. 1 equals? yes counter++;
 *
 * ----
 *
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
	//test
//	int repeat = 5;
	//prod
	int repeat = 40;
	

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_10_test_2019.txt";
		String filepath = "./src/main/resources/Day_10_2019.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
			
			
			
			do {
			String[] lineArray = line.split("");

			line = lineMaker(lineArray);
			
			//debugging
			
//			System.out.println(repeat+": "+line + "| "+line.length());
			
			repeat--;
			} while (repeat > 0);
			
			
			
			
			

			// Some calculations resulting in a value bigger than int capacity -> i'll return it as string.
//			System.out.println("answer: "+line);
			// We were asked for length so... 
			solution = line.length();
//			testSolution(solution);
		}

		return solution;
	}

	

	public String lineMaker(String[] lineArr) {
		int index = 0;
		int counter = 1;
//		int val = Integer.parseInt(lineArr[0]);
		int lineSize = lineArr.length;

		String finalLine = "I'm not fulfilled :( ";
		String line = "";

		while (index < (lineSize - 1)) {
			if (lineArr[index].equals(lineArr[index + 1])) {
				counter++;
				index++;
			} else {
				line = line + counter + lineArr[index];
				counter = 1;
				index++;
			}

		}

		if (index == (lineSize - 1)) {
			finalLine = line + counter + lineArr[index];
		} else {
			System.out.println("what now...");
			System.out.println("index: " + index + ", " + "lineSize: " + lineSize);
		}

		return finalLine;
	}

	public static void testSolution(int sol) {
		if (sol == 312211) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
