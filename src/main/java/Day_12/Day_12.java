package Day_12;

public class Day_12 {
	public static void main (String[] args) {
		Solution_1_Day_12 s1 = new Solution_1_Day_12();
		Solution_2_Day_12 s2 = new Solution_2_Day_12();

		//Change for wanted solution TRUE for SOL1
		boolean Solution1 = true;
//		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_12_Solution1: " + s1.getSolution() : "Day_12_Solution2: " + s2.getSolution());
	}
}

