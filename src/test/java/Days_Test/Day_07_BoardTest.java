
package Days_Test;

import Day_07.*;

public class Day_07_BoardTest {

	public static void main(String args[]) {
		Wire w = new Wire();
		Board b = new Board();
		String name = "bob";
		System.out.println(b.hasWire(name));
		b.addWire(name);
		System.out.println(b.hasWire(name));
		System.out.println(b.getWire(name).getName());
	}
}
