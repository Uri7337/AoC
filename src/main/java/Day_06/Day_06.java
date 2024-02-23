package Day_06;

public class Day_06 {
	public static void main (String[] args) {
		Solution_1_Day_06 s1 = new Solution_1_Day_06();
		Solution_2_Day_06 s2 = new Solution_2_Day_06();

		//Change for wanted solution
//		boolean Solution1 = true;
		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_06_Solution1: " + s1.getSolution() : "Day_06_Solution2: " + s2.getSolution());
	}
}