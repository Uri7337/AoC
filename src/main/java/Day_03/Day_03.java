package Day_03;

import shared.EasyPrint;
public class Day_03 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_03 s1 = new Solution_1_Day_03();
        Solution_2_Day_03 s2 = new Solution_2_Day_03();

        ep.p("");
        ep.p("Day_03_Solution1: " + s1.getSolution().toString());
        ep.p("Day_03_Solution2: " + s2.getSolution().toString());
    }
}