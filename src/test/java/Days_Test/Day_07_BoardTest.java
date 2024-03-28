
package Days_Test;

import Day_07.*;

public class Day_07_BoardTest {

	public static void main(String args[]) {
		Wire w = new Wire();
		Board b = new Board();
		String name = "bob";
//		System.out.println(b.hasWire(name));
		Wire w0 = b.getCreateWire(name);
//		System.out.println(b.getWireLeftSide(name));
//		b.setWireValue(name,5);
		//w0 = b.getCreateWire(name);
		System.out.println("wirevalue");
		System.out.println(w0.getValue());
		
		
		
		
	}
}
