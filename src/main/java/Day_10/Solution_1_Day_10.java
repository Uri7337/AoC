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
		
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			System.out.println(file.get(i));
			
			
		}
		
		
		
		solution = 0;
		
		return solution;
	}
	
	

	
	
	
}
