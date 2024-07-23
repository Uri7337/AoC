package Day_08;

import Shared.EasyPrint;
public class Day_08 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_08 s1 = new Solution_1_Day_08();
        Solution_2_Day_08 s2 = new Solution_2_Day_08();

		ep.p("");
        ep.p("Day_08_Solution1: " + s1.getSolution().toString());
        ep.p("Day_08_Solution2: " + s2.getSolution().toString());
    }
}