
package Day_1;

import Shared.ReadFile;

public class Solution_1_Day_1 {
	int solution = 0;
	
    public int getSolution() {
        ReadFile rf = new ReadFile();
        String file = "";
        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";
        file = rf.getInput(filepath);       
        String[] commands = file.split("  ");
        System.out.println(commands[1]);
        
			String str="sdfvsdf68fsdfsf8999fsdf09";
			String numberOnly= str.replaceAll("[^0-9]", "");
        
        return solution;
    }
}
