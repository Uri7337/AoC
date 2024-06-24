package Day_11;

import Shared.ReadFile;

import java.util.ArrayList;

public class Solution_1_Day_11 {

	int solution = 0;
	String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_11_test_2016.txt";
//		String filepath = "./src/main/resources/Day_11_2016.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			boolean goodPwd = bigRedButton(line);
			while (!goodPwd) {
				line = incrementPwd(line);
				goodPwd = bigRedButton(line);
			}

			//true solution
			p("true sol: " + line);
		}
		solution = 0;
		return solution;
	}

	public String incrementPwd(String line) {
		StringBuilder buildLine = new StringBuilder();
		String[] lineArray = line.split("");
		String inc = lineArray[lineArray.length - 1];
		String[] forbiddenLetters = {alphabet[8], alphabet[11], alphabet[14]};
		boolean containsfL = false;
		int indexFL = 0;
		String theFL = "";

		buildLine.append(line);

//		check for forbidden letters
		for (int i = 0; i < (lineArray.length); i++) {
			if (containsfL) {
				break;
			}
			for (String fl : forbiddenLetters) {
				if (lineArray[i].equals(fl)) {
					containsfL = true;
					indexFL = i;
					theFL = fl;
					break;
				}
			}
		}

//		increment for forbidden string is different
		if (containsfL) {
			buildLine.delete(indexFL, buildLine.length());
			buildLine.replace(indexFL, indexFL, letterAfter(theFL));

			while (buildLine.length() != 8) {
				buildLine.append(alphabet[0]);
			}
			
		} else {
			int increment = 0;
			
			for (int i = lineArray.length-1; i > 0; i--) {
				if(increment==1){break;}
				
				if (lineArray[i].equals(alphabet[25])) {
					buildLine.delete(i, buildLine.length());
					buildLine.replace(i, i, letterAfter(lineArray[i]));

					while (buildLine.length() != 8) {
						buildLine.append(alphabet[0]);
					}
					
				}else{
					buildLine.deleteCharAt(i);
					buildLine.replace(i, i, letterAfter(lineArray[i]));
					increment++;
				}
			}
		}
//		p(line);
		line = buildLine.toString();
		return line;
	}

	public boolean bigRedButton(String line) {
		//Runs all the tests!!!!
		//ALL tests must be true to have a good generated pwd

		String[] lineArray = line.split("");
		boolean testNA = testNotAllowed(lineArray);
		boolean testS = testStraight(lineArray);
		boolean testR = testRepeat(lineArray);
		
//		bigRedButtonDebug(line,testNA,testS,testR);

		if (testNA && testS && testR) {
			return true;
		} else {
			return false;
		}
	}

	public boolean testNotAllowed(String[] lineArray) {
		String[] forbiddenLetters = {alphabet[8], alphabet[11], alphabet[14]};
		boolean containsfL = false;

		for (int i = 0; i < (lineArray.length - 1); i++) {
			if (containsfL) {
				return false;
			}
			for (String fl : forbiddenLetters) {
				if (lineArray[i].equals(fl)) {
					containsfL = true;
				}
			}
		}
		return true;
	}

	public boolean testStraight(String[] lineArray) {
		//We test for straight with 3 letters, that s why we do -2 at the end of array 
		for (int i = 0; i < (lineArray.length - 2); i++) {
			for (int j = 0; j < alphabet.length - 2; j++) {
				if (lineArray[i].equals(alphabet[j])) {
					if (lineArray[i + 1].equals(alphabet[j + 1]) && lineArray[i + 2].equals(alphabet[j + 2])) {
						return true;
					}
				}
			}

		}
		return false;
	}

	public boolean testRepeat(String[] lineArray) {
		int countAllRepeats = 0;
		int countSingleRepeat = 1;
		String piece = lineArray[0];

		for (int i = 1; i < (lineArray.length); i++) {
			if (piece.equals(lineArray[i])) {
				countSingleRepeat++;
			} else {
				countSingleRepeat = 1;
			}
			if (countSingleRepeat > 1 && countSingleRepeat < 3) {
				countAllRepeats++;
			}
			piece = lineArray[i];
		}
		
		if (countAllRepeats >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public String letterAfter(String letter) {
		String letterAfter = "";
		if(letter.equals(alphabet[25])){
			letterAfter = alphabet[0];
			return letterAfter;
		};
		for (int i = 0; i < alphabet.length; i++) {
			if (letter.equals(alphabet[i])) {
				letterAfter = alphabet[i + 1];
				break;
			}
		}
		return letterAfter;
	}

	//prints content, System.out.println is way too long
	public void p(String content) {
		System.out.println(content);
	}
	
	// ----debug zone----
	public void bigRedButtonDebug(String line,boolean testNA, boolean testS, boolean testR){
		p(line);
		p("NotAllowed: " + testNA);
		p("Straight: " + testS);
		p("Repeat: " + testR);
		p("");
	}

}
