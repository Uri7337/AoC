package Day_04;

public class Day_4 {

    public static void main(String[] args) {
        Solution_1_Day_4 s1 = new Solution_1_Day_4();
        Solution_2_Day_4 s2 = new Solution_2_Day_4();

        //Change for wanted solution
        boolean Solution1 = true;
//        boolean Solution1 = false;
        System.out.println(Solution1 ? "Day_4_Solution1: " + s1.getSolution() : "Day_4_Solution2: " + s2.getSolution());
    }
}
