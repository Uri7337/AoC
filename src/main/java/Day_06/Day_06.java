package Day_06;

import shared.EasyPrint;

public class Day_06 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_06 s1 = new Solution_1_Day_06();
        Solution_2_Day_06 s2 = new Solution_2_Day_06();

        String filepath_test = "./src/main/resources/Day_06_test_2024.txt";
        String filepath = "./src/main/resources/Day_06_2024.txt";


        ep.p("=====================================");
        ep.p("========       Start        =========");
        ep.p("=====================================");
        ep.p("");

        ep.p("************* Start Solution * *************");
        ep.p("");
        ep.p("== Test prints ==");
        String sol1_test = s1.getSolution(filepath_test).toString();
        ep.p("");
        ep.p("== Answer prints ==");
        //String sol1 = s1.getSolution(filepath).toString();
        ep.p("");
        ep.p("************* End Solution * ***************");
        ep.p("");

        ep.p("************* Start Solution ** ************");
        ep.p("");
        ep.p("== Test prints ==");
        String sol2_test = s2.getSolution(filepath_test).toString();
        ep.p("");
        ep.p("== Answer prints ==");
       // String sol2 = s2.getSolution(filepath).toString();
        ep.p("");
        ep.p("************* End Solution ** **************");
        ep.p("");

        ep.p("=====================================");
        ep.p("=========        End         ========");
        ep.p("=====================================");
        ep.p("");

        ep.p("=====================================");
        ep.p("                 Day_06               ");
        ep.p("=====================================");
        ep.p("************** Solutions **************");
        ep.p("Solution *");
        ep.p("    Tests: " + sol1_test);
        //ep.p("    Answer: " + sol1);
        ep.p("");
        ep.p("Solution **");
        ep.p("    Tests: " + sol2_test);
       //ep.p("    Answer: " + sol2);
        ep.p("");
        ep.p("=====================================");

    }

}