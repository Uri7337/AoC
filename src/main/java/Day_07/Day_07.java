package Day_07;

import shared.EasyPrint;
public class Day_07 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_07 s1 = new Solution_1_Day_07();
        Solution_2_Day_07 s2 = new Solution_2_Day_07();

        String filepath_my_test = "./src/main/resources/Day_07_test_2025_1.txt";
        String filepath_test = "./src/main/resources/Day_07_test_2025.txt";
		String filepath = "./src/main/resources/Day_07_2025.txt";

        
        String sol1 = "";
        String sol2 = "";

        String sol0_test = "";
        String sol1_test = "";
        String sol2_test = "";

        boolean mytest = false;
        boolean tests = true;
        boolean prod = false;
        boolean part1 = false;
        boolean part2 = true;
        
        ep.p("==Start==");
        if(part1){
            ep.p("\nSolution *");
            if(mytest){
                ep.p("==myTest prints==");
                sol0_test = s1.getSolution(filepath_my_test).toString();
                ep.p("");
            }

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
        ep.p("    Day_07");
        ep.p("===Solutions===");
        if(part1){
            ep.p("Solution *");
            if (mytest) {
                ep.p("myTests: " + sol0_test);
                if(Long.valueOf(sol0_test) == 25){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
            }

             if(tests){
                ep.p("Tests: " + sol1_test);
                if(Long.valueOf(sol1_test) == 21){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
             }
            
            if(prod){
                ep.p("Answer: " + sol1);
                if(Long.valueOf(sol1) < 1518){ep.p(" | OK: Maybe");}else{ep.p(" | Too High :(");}
            }
        }
        ep.p("");
        if(part2){
            ep.p("Solution **");
             if(tests){
                ep.np("Tests: " + sol2_test);
                if(Long.valueOf(sol2_test) == 40){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
             }
            if(prod){
                ep.p("Answer: " + sol2);
            }
        }
        
        
    }
}



