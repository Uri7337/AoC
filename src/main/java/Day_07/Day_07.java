package Day_07;

import Shared.EasyPrint;
public class Day_07 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_07 s1 = new Solution_1_Day_07();
        Solution_2_Day_07 s2 = new Solution_2_Day_07();

		ep.p("");
        ep.p("Day_07_Solution1: " + s1.getSolution().toString());
        ep.p("Day_07_Solution2: " + s2.getSolution().toString());
    }
}