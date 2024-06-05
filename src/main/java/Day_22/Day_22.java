package Day_22;

public class Day_22 {
	public static void main (String[] args) {
		Solution_1_Day_22 s1 = new Solution_1_Day_22();
		Solution_2_Day_22 s2 = new Solution_2_Day_22();

		//Change for wanted solution TRUE for SOL1
//		boolean Solution1 = true;
		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_22_Solution1: " + s1.getSolution() : "Day_22_Solution2: " + s2.getSolution());
	}
}
