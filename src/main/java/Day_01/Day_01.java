package Day_01;

import shared.EasyPrint;
public class Day_01{

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_01 s1 = new Solution_1_Day_01();
        Solution_2_Day_01 s2 = new Solution_2_Day_01();

        String filepath_my_test = "./src/main/resources/Day_01_test_2017_1.txt";
        String filepath_test = "./src/main/resources/Day_01_test_2017.txt";
		String filepath = "./src/main/resources/Day_01_2017.txt";

        
        String sol1 = "";
        String sol2 = "";

        String sol0_test = "";
        String sol1_test = "";
        String sol2_test = "";

        boolean mytest = false;
        boolean tests = false;
        boolean prod = true;
        boolean part1 = true;
        boolean part2 = false;
        
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
        ep.p("    Day_01");
        ep.p("===Solutions===");
        if(part1){
            ep.p("Solution *");
            if (mytest) {
                ep.p("myTests: " + sol0_test);
                if(Long.valueOf(sol0_test) == 7){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
            }

             if(tests){
                ep.p("Tests: " + sol1_test);
                if(Long.valueOf(sol1_test) == 3){ep.p(" | OK: True");}else{ep.p(" | OK: False");}
             }
            
            if(prod){
                ep.p("Answer: " + sol1);
                if(Long.valueOf(sol1) > 0){ep.p(" | OK: Maybe");}else{ep.p(" | Too Bad :(");}
            }
        }
        ep.p("");
        if(part2){
            ep.p("Solution **");
             if(tests){
                ep.np("Tests: " + sol2_test);
                if(Long.valueOf(sol2_test) == 5){ep.p(" | OK: True");}else{ep.p(" | Too Bad :(");}
             }
            if(prod){
                ep.p("Answer: " + sol2);
            }
        }
        
        
    }
}



