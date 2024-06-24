package Day_02;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_1_Day_2 {	
    int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_2016_2_test.txt";
		String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_2016_2.txt";
		file = rf.getInput(filepath);
                
                String regex = "x";
                int[] lwh = new int[3];

                
		//Insert Solution Here:
                for (int i = 0; i < file.size(); i++) {
                    String[] output = file.get(i).split(regex);
                    int j = 0;
                    for (String outp : output) {
                        
                        
                        lwh[j] = Integer.parseInt(outp);
                        j++;
                    }
                   int[] clwh = {calc(lwh[0],lwh[1]),calc(lwh[1],lwh[2]),calc(lwh[2],lwh[0])};
                   int[] lwhsmall = {calcSmall(lwh[0],lwh[1]),calcSmall(lwh[1],lwh[2]),calcSmall(lwh[2],lwh[0])};
                   Arrays.sort(lwhsmall);
                   solution = solution + lwhsmall[0]+clwh[0]+clwh[1]+clwh[2];
                   
                }
                
		return solution;
	}
        
        int calc(int x, int y){
        
            return 2*(x*y);
        }
        int calcSmall(int x, int y){
        
            return (x*y);
        }
}