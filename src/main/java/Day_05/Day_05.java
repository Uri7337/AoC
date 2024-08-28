package Day_05;

import shared.EasyPrint;
public class Day_05 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_05 s1 = new Solution_1_Day_05();
        Solution_2_Day_05 s2 = new Solution_2_Day_05();

        String filepath_test = "./src/main/resources/Day_05_test_2023.txt";
		String filepath = "./src/main/resources/Day_05_2023.txt";
        
        ep.p("==Start==");
        ep.p("Solution *");
        ep.p("==Test prints==");
        String sol1_test = s1.getSolution(filepath_test).toString();
        ep.p("\n==Answer prints==");
        String sol1 = s1.getSolution(filepath).toString();
        ep.p("Solution **");
        ep.p("\n==Test prints==");
        String sol2_test = s2.getSolution(filepath_test).toString();
        ep.p("\n==Answer prints==");
        String sol2 = s2.getSolution(filepath).toString();
        ep.p("\n==End==");
        
        ep.p("\n");
        ep.p("    Day_05");
        ep.p("===Solutions===");
        ep.p("Solution *");
        ep.p("Tests: " + sol1_test);
        ep.p("Answer: " + sol1);
        ep.p("");
        ep.p("Solution **");
        ep.p("Tests: " + sol2_test);
        ep.p("Answer: " + sol2);
    }
  
}