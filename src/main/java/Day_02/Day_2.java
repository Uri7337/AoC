package Day_02;

public class Day_2 {
	public static void main (String[] args) {
		Solution_1_Day_2 s1 = new Solution_1_Day_2();
		Solution_2_Day_2 s2 = new Solution_2_Day_2();

		//Change for wanted solution
		boolean Solution1 = false;
		/* boolean Solution1 = true; */
		System.out.println(Solution1 ? "Day_2_Solution1: " + s1.getSolution() : "Day_2_Solution2: " + s2.getSolution());
	}
}