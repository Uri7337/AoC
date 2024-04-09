package Day_10;

public class Day_10 {
	public static void main (String[] args) {
		Solution_1_Day_10 s1 = new Solution_1_Day_10();
		Solution_2_Day_10 s2 = new Solution_2_Day_10();

		//Change for wanted solution TRUE for SOL1
		boolean Solution1 = true;
//		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_10_Solution1: " + s1.getSolution() : "Day_10_Solution2: " + s2.getSolution());
	}
}

