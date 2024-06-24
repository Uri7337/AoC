package Day_2;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_2_Day_2 {	
    int solution = 0;
    int ribbon = 0;
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
                   Arrays.sort(lwh);
                   ribbon = ribbon + calcRibbon(lwh); 
                   int[] clwh = {calc(lwh[0],lwh[1]),calc(lwh[1],lwh[2]),calc(lwh[2],lwh[0])};
                   int[] lwhsmall = {calcSmall(lwh[0],lwh[1]),calcSmall(lwh[1],lwh[2]),calcSmall(lwh[2],lwh[0])};
                   Arrays.sort(lwhsmall);
                   solution = solution + lwhsmall[0]+clwh[0]+clwh[1]+clwh[2];
                   
                }
                
		return ribbon;
	}
        
        int calc(int x, int y){
        
            return 2*(x*y);
        }
        int calcSmall(int x, int y){
        
            return (x*y);
        }
        int calcRibbon(int[] abc){
            int sol = 0;
            //2x3x4
            //2+2+3+3 = 10
            //2*3*4 = 24
            //34
            sol = abc[0] + abc[0] + abc[1] + abc[1];
            sol = sol + (abc[0] * abc[1] * abc[2]);
            return sol;
        }
}