package Day_06;

import shared.EasyPrint;
public class Day_06 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_06 s1 = new Solution_1_Day_06();
        Solution_2_Day_06 s2 = new Solution_2_Day_06();

        String filepath_test = "./src/main/resources/Day_06_test_2018.txt";
		String filepath = "./src/main/resources/Day_06_2018.txt";

        String sol1 = "";
        String sol2 = "";

        String sol1_test = "";
        String sol2_test = "";

        boolean tests = false;
        boolean prod = true;
        boolean part1 = false;
        boolean part2 = true;

        
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
        ep.p("    Day_06");
        ep.p("===Solutions===");
        if(part1){
            ep.p("Solution *");
             if(tests){
                ep.p("Tests: " + sol1_test);
                if(Long.valueOf(sol1_test) == 4277556){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
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
                if(Long.valueOf(sol2_test) == 3263827){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
             }
            if(prod){
                ep.p("Answer: " + sol2);
            }
        }
        
        
    }
}



