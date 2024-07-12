package Day_05;

import Shared.EasyPrint;
public class Day_5 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_5 s1 = new Solution_1_Day_5();
        Solution_2_Day_5 s2 = new Solution_2_Day_5();

        ep.p("Day_5_Solution1: " + s1.getSolution().toString());
        ep.p("Day_5_Solution2: " + s2.getSolution().toString());
    }
}
