package Day_09;

public class Day_09 {
	public static void main (String[] args) {
		Solution_1_Day_09 s1 = new Solution_1_Day_09();
		Solution_2_Day_09 s2 = new Solution_2_Day_09();

		//Change for wanted solution TRUE for SOL1
		boolean Solution1 = true;
//		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_09_Solution1: " + s1.getSolution() : "Day_09_Solution2: " + s2.getSolution());
	}
}