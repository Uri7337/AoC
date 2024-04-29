/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_10;

import Shared.ReadFile;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Solution_2_Day_10 {

	int solution = 0;
	//test
//	int repeat = 1;
	//prod
	int repeat = 50;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_10_test_2015.txt";
		String filepath = "./src/main/resources/Day_10_2015.txt";
		file = rf.getInput(filepath);
		
		 
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
//			String[] linehalfs = {line.substring(0, (line.length()/2)),line.substring((line.length()/2))};
			
			Threads th1 = new Threads(line, repeat,"t1");
//			Threads th2 = new Threads(linehalfs[1], repeat,"t2");
			
			th1.start();
//			th2.start();
			
			try {
				th1.join();
//				th2.join();
			} catch (InterruptedException ex) {
				Logger.getLogger(Solution_2_Day_10.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			
			
			
			
			
			// Some calculations resulting in a value bigger than int capacity -> i'll return it as string.
//			System.out.println("answer: "+line);
			// We were asked for length so... 
//			solution = line.length();
			solution = th1.line.length();
//			testSolution(solution);
		}

		return solution;
	}

	

	public static void testSolution(int sol) {
		if (sol == 312211) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
