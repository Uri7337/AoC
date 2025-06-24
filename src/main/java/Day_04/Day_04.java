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
        boolean prod = false;
        
        ep.p("==Start==");
        ep.p("Solution *");
        ep.p("==Test prints==");
        String sol1_test = s1.getSolution(filepath_test).toString();
        if(prod){
            ep.p("\n==Answer prints==");
            sol1 = s1.getSolution(filepath).toString();
        }
        ep.p("");
        ep.p("Solution **");
        ep.p("\n==Test prints==");
        String sol2_test = s2.getSolution(filepath_test).toString();
        if(prod){
            ep.p("\n==Answer prints==");
            sol2 = s2.getSolution(filepath).toString();
        }
        ep.p("\n==End==");
        
        ep.p("\n");
        ep.p("    Day_04");
        ep.p("===Solutions===");
        ep.p("Solution *");
        ep.p("Tests: " + sol1_test);
        if(prod){
            ep.p("Answer: " + sol1);
        }
        ep.p("");
        ep.p("Solution **");
        ep.p("Tests: " + sol2_test);
        if(prod){
            ep.p("Answer: " + sol2);
        }
        
    }
}