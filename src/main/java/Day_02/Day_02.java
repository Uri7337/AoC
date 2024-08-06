package Day_02;

import shared.EasyPrint;
public class Day_02 {

    public static void main(String[] args) {
        EasyPrint ep = new EasyPrint();
        Solution_1_Day_02 s1 = new Solution_1_Day_02();
        Solution_2_Day_02 s2 = new Solution_2_Day_02();

        ep.p("");
        ep.p("Day_02_Solution1: " + s1.getSolution().toString());
        ep.p("Day_02_Solution2: " + s2.getSolution().toString());
    }
}