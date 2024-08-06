package Day_07;

import Shared.ReadFile;
import Shared.EasyPrint;

import java.util.ArrayList;

public class Solution_2_Day_07 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_07_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_07_2016.txt";
		file = rf.getInput(filepath);

		int supportsSSL = 0;

		// Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			if (hasABBA(line)) {
				//ep.p("supports SSL: " + line);
				supportsSSL++;
			} else {
				//ep.p("does not support SSL: " + line);
			}
		}

		return solution = supportsSSL;
	}

	public boolean hasABBA(String testLine) {
		int insideCounter = 0, outsideCounter = 0; 		// counts if ABBA apears inside or outside
		Array
		boolean inside = false; 					// remembers where we are (if inside [] then true)

		char[] testChars = testLine.toCharArray(); 	// s p l i t s o u r l i n e i n t o c h a r s

		for (int i = 0; i < testChars.length - 3; i++) {

			char a = testChars[i]; 			// A
			char b = testChars[i + 1]; 		// B
			char aa = testChars[i + 2]; 	// A

			
			if(a == '[' || b == '[' || aa == '[') {inside = true;}
			if(a == ']' || b == ']' || aa == ']') {inside = false;}
			//ep.np( " in: " + inside);
			
			if (a != b) {
				if (b == aa) {
					
					//ep.np( " match: true");
					
					if(inside){
						insideCounter++;
					}else{
						outsideCounter++;
					}
					// return true;
				}

			}
			//ep.p("");
		}

		if (insideCounter>0 || outsideCounter ==0){
			return false;
		}else{
			return true;
		}
		
	}

	// ----debug zone----

}

class IPAddress {

	char a = testChars[i]; 			// A	
	char b = testChars[i + 1]; 		// B
	char aa = testChars[i + 2]; 	// A

	
  }