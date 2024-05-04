package Day_11;

import Shared.ReadFile;

import java.util.ArrayList;

public class Solution_1_Day_11 {

	int solution = 0;
	String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_11_test_2015.txt";
//		String filepath = "./src/main/resources/Day_11_2015.txt";
		file = rf.getInput(filepath);
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			
			boolean goodPwd = bigRedButton(line);
			while(!goodPwd){
				line = incrementPwd(line);
				goodPwd = bigRedButton(line);
			}
			
			//true solution
			p(line);
		}
		solution = 0;
		return solution;
	}
	
	public String incrementPwd(String line){
		String[] lineArray = line.split("");
		String inc = lineArray[lineArray.length-1];
		
		
//		doIncrement
		for (int i=0;i<alphabet.length;i++) {
			if(lineArray[i].equals(alphabet[i])){
			
			}
		}
		
		return line;
	}
	
	public boolean bigRedButton(String line){
		//Runs all the tests!!!!
		//ALL tests must be true to have a good generated pwd
		
		String[] lineArray = line.split("");
		boolean testNA = testNotAllowed(lineArray);
		boolean testS = testStraight(lineArray);
		boolean testR = testRepeat(lineArray);
		
		p(line);
		p("NotAllowed: "+testNA);
		p("Straight: "+testS);
		p("Repeat: "+testR);
		p("");
		
		if (testNA&&testS&&testR){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean testNotAllowed(String[] lineArray){
		String[] forbiddenLetters = {alphabet[8],alphabet[11],alphabet[14]};
		boolean containsfL = false;
		
		for (int i=0;i<(lineArray.length-1);i++) {
			if(containsfL){
				return false;
			}
			for(String fl : forbiddenLetters){
				if(lineArray[i].equals(fl)){
					containsfL = true;
				}
			}
		}
		return true;
	}
	
	public boolean testStraight(String[] lineArray){
		//We test for straight with 3 letters, that s why we do -2 at the end of array 
		for (int i=0;i<(lineArray.length-2);i++) {
			for (int j=0;j<alphabet.length-2;j++) {
				if(lineArray[i].equals(alphabet[j])){
					if(lineArray[i+1].equals(alphabet[j+1]) && lineArray[i+2].equals(alphabet[j+2])){
						return true;
					}
				}
			}
		
		
		}
		return false;
	}
	
	public boolean testRepeat(String[] lineArray){
		int countAllRepeats = 0;
		int countSingleRepeat = 1;
		String piece = lineArray[0];
		
		for (int i=1;i<(lineArray.length-1);i++) {
			if(piece.equals(lineArray[i])){
				countSingleRepeat++;
			}else{
				countSingleRepeat = 1;
			}
			if (countSingleRepeat>1 && countSingleRepeat<3){
				countAllRepeats++;
			}
			piece=lineArray[i];
		}
		
		if (countAllRepeats>=2){
			return true;
		}else{
			return false;
		}
	}
	
	//prints content, System.out.println is way too long
	public void p(String content){
		System.out.println(content);
	}
}
