package Day_08;

public class Day_08 {
	public static void main (String[] args) {
		Solution_1_Day_08 s1 = new Solution_1_Day_08();
		Solution_2_Day_08 s2 = new Solution_2_Day_08();

		//Change for wanted solution
		boolean Solution1 = true;
//		boolean Solution1 = false;
		System.out.println(Solution1 ? "Day_08_Solution1: " + s1.getSolution() : "Day_08_Solution2: " + s2.getSolution());
	}
}