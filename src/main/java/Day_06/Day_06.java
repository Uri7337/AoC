package Day_06;

import Shared.EasyPrint;
public class Day_06 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_06 s1 = new Solution_1_Day_06();
        Solution_2_Day_06 s2 = new Solution_2_Day_06();

        ep.p("Day_06_Solution1: " + s1.getSolution().toString());
        ep.p("Day_06_Solution2: " + s2.getSolution().toString());
    }
}