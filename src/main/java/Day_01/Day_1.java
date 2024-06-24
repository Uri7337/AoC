package Day_01;

public class Day_1 {
	public static void main (String[] args) {
		Solution_1_Day_1 s1 = new Solution_1_Day_1();
		Solution_2_Day_1 s2 = new Solution_2_Day_1();

		//Change for wanted solution TRUE for SOL1
		boolean Solution1 = true;
		/* boolean Solution1 = false; */
		System.out.println(Solution1 ? "Day_01_Solution1: " + s1.getSolution() : "Day_01_Solution2: " + s2.getSolution());
	}
}

