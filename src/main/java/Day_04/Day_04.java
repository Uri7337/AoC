package Day_04;

import shared.EasyPrint;
public class Day_04 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_04 s1 = new Solution_1_Day_04();
        Solution_2_Day_04 s2 = new Solution_2_Day_04();

        String filepath_test = "./src/main/resources/Day_04_test_2024.txt";
		String filepath = "./src/main/resources/Day_04_2024.txt";

        String sol1 = "";
        String sol2 = "";

        String sol1_test = "";
        String sol2_test = "";

        boolean tests = true;
        boolean prod = false;
        boolean part1 = true;
        boolean part2 = false;

        /*
		 * 		 	A
			* 	--------------
			* 	| ....XXMAS. |
			* 	| .SAMXMS... |
			* 	| ...S..A... |
			* 	| ..A.A.MS.X |
			* D | XMASAMX.MM | B
			* 	| X.....XA.A |
			* 	| S.S.S.S.SS |
			* 	| .A.A.A.A.A |
			* 	| ..M.M.M.MM |
			* 	| .X.X.XMASX |
			* 	--------------
		 * 			C
		 * 
		 * can be multiple XMAS on one X char ✅
		 */

		/*
						6 7
		 * 			5 . . .
		 * 			4 . X . 0
		 * 		      . . . 1
		 * 			  3 2	
		 */

        
        ep.p("==Start==");
        if(part1){
            ep.p("\nSolution *");
            if(tests){
                ep.p("==Test prints==");
                sol1_test = s1.getSolution(filepath_test).toString();
            }
            
            if(prod){
                ep.p("\n==Answer prints==");
                sol1 = s1.getSolution(filepath).toString();
            }
        }
        ep.p("");
        if(part2){
            ep.p("Solution **");
             if(tests){
                ep.p("==Test prints==");
                sol2_test = s2.getSolution(filepath_test).toString();
             }
            
            if(prod){
                ep.p("\n==Answer prints==");
                sol2 = s2.getSolution(filepath).toString();
            }
        }
        ep.p("\n==End==");
        ep.p("\n");
        ep.p("    Day_04");
        ep.p("===Solutions===");
        if(part1){
            ep.p("Solution *");
             if(tests){
                ep.p("Tests: " + sol1_test);
                if(Integer.valueOf(sol1_test) == 18){ep.p("| OK: True");}else{ep.p(" | OK: False");}
             }
            
            if(prod){
                ep.p("Answer: " + sol1);
            }
        }
        ep.p("");
        if(part2){
            ep.p("Solution **");
             if(tests){
                ep.np("Tests: " + sol2_test);
             }
            if(prod){
                ep.p("Answer: " + sol2);
            }
        }
        
        
    }
}