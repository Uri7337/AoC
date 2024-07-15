package Day_04;

import Shared.EasyPrint;
public class Day_04 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_04 s1 = new Solution_1_Day_04();
        Solution_2_Day_04 s2 = new Solution_2_Day_04();

        ep.p("Day_04_Solution1: " + s1.getSolution().toString());
        ep.p("Day_04_Solution2: " + s2.getSolution().toString());
    }
}
