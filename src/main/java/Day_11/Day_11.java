package Day_11;

public class Day_11 {
	public static void main (String[] args) {
		Solution_1_Day_11 s1 = new Solution_1_Day_11();
		Solution_2_Day_11 s2 = new Solution_2_Day_11();

		//Change for wanted solution TRUE for SOL1
//		boolean Solution1 = true;
		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_11_Solution1: " + s1.getSolution() : "Day_11_Solution2: " + s2.getSolution());
	}
}

