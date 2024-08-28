package Day_05;

import java.io.File;
import java.net.URISyntaxException;

import shared.EasyPrint;
public class Day_05 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_05 s1 = new Solution_1_Day_05();
        Solution_2_Day_05 s2 = new Solution_2_Day_05();

        String filepath_test = "./src/main/resources/Day_05_test_2023.txt";
		String filepath = "./src/main/resources/Day_05_2023.txt";
        
        ep.p("\n");
        ep.p("    Day_05");
        ep.p("===Solutions===");
        ep.p("Solution *");
        ep.p("Tests: " + s1.getSolution(filepath_test).toString());
        ep.p("Answer: " + s1.getSolution(filepath).toString());
        ep.p("");
        ep.p("Solution **");
        ep.p("Tests: " + s2.getSolution(filepath_test).toString());
        ep.p("Answer: " + s2.getSolution(filepath).toString());
    }
  
}