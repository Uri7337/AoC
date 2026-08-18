package Day_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Solution_1_Day_01_Test {
	
	@Test
	void exampleImputReturns7(){
		Solution_1_Day_01 solution = new Solution_1_Day_01();

		Object result = solution.getSolution("src/test/resources/Day_01_test_2017.txt");
		
		assertEquals(7L, result);
	}	

}
