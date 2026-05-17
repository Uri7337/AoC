package Day_02;

import java.math.BigInteger;

import shared.EasyPrint;
public class Day_02 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_02 s1 = new Solution_1_Day_02();
        Solution_2_Day_02 s2 = new Solution_2_Day_02();

        String filepath_test = "./src/main/resources/Day_02_test_2021.txt";
		String filepath = "./src/main/resources/Day_02_2021.txt";

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
        ep.p("    Day_02");
        ep.p("===Solutions===");
        if(part1){
            ep.p("Solution *");
             if(tests){
                ep.p("Tests: " + sol1_test);
                if(Integer.valueOf(sol1_test) == 1227775554){ep.p("| OK: True");}else{ep.p(" | OK: False");}
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
                BigInteger sol2_testBI = new BigInteger(sol2_test);
                BigInteger testRes = new BigInteger("4174379265");
                if(sol2_testBI.equals(testRes)){ep.p("| OK: True");}else{ep.p(" | OK: False");}
             }
            if(prod){
                ep.p("Answer: " + sol2);
            }
        }
        
        
    }
}


//24267689552
//23039913998
