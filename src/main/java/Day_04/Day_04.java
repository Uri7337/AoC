package Day_04;

import shared.EasyPrint;
public class Day_04 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_04 s1 = new Solution_1_Day_04();
        Solution_2_Day_04 s2 = new Solution_2_Day_04();

        String filepath_test = "./src/main/resources/Day_04_test_2023.txt";
		String filepath = "./src/main/resources/Day_04_2023.txt";
        
        ep.p("\n");
        ep.p("    Day_04");
        ep.p("===Solutions===");
        ep.p("Solution 1");
        ep.p("Tests: " + s1.getSolution(filepath_test).toString());
        ep.p("Answer: " + s1.getSolution(filepath).toString());
        ep.p("");
        ep.p("Solution 2");
        ep.p("Tests: " + s2.getSolution(filepath_test).toString());
        ep.p("Answer: " + s2.getSolution(filepath).toString());
    }
}