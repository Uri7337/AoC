package Day_07;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_2_Day_07 {

	int solution = 0;
	HashMap<String, Integer> hshmp = new HashMap<String, Integer>();
	Board b = new Board();
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_07_test_2019.txt";
		String filepath = "./src/main/resources/Day_07_2019.txt";
		file = rf.getInput(filepath);
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			String[] lineparts = line.split(" ");

			placeWires(lineparts);
			
		}
		
//		printAll(b);
		solution = calcValue(b.getWire("a"));
	
		return solution;
	}

	public void placeWires(String[] lineparts) {

		//NOT
		if (lineparts[0].equals("NOT")) {
			b.getCreateWire(lineparts[1]);
			b.addWire(lineparts[3], b.getWire(lineparts[1]), lineparts[0]);
		//numbers
		} else if (lineparts[0].matches(".*\\d.*")) {
			
			
			
			String gate = lineparts[1];
			Integer val;
			Wire w2;
			
			
			switch (gate) {
				case "AND":
					val = Integer.valueOf(lineparts[0]);
					w2 = b.getCreateWire(lineparts[2]);
					b.addWire(lineparts[4], val, w2, gate);
					break;
				case "OR":
					val = Integer.valueOf(lineparts[0]);
					w2 = b.getCreateWire(lineparts[2]);
					b.addWire(lineparts[4], val, w2, gate);
					break;
				case "->":
					Integer value = Integer.valueOf(lineparts[0]);
					b.addWire(lineparts[2], value, gate);
//					System.out.println(lineparts[2] + ": " + value);
					break;
				default:
					throw new AssertionError();
			}
			
			
			
			

		//letters
		} else {
			String gate = lineparts[1];
			Wire w0;
			Wire w2;
			Integer shift = 0;
			
			switch (gate) {
				case "AND":
					w0 = b.getCreateWire(lineparts[0]);
					w2 = b.getCreateWire(lineparts[2]);
					b.addWire(lineparts[4], w0, w2, gate);
					break;
				case "OR":
					w0 = b.getCreateWire(lineparts[0]);
					w2 = b.getCreateWire(lineparts[2]);
					b.addWire(lineparts[4], w0, w2, gate);
					break;
				case "LSHIFT":
					w0 = b.getCreateWire(lineparts[0]);
					shift = Integer.valueOf(lineparts[2]);
					b.addWire(lineparts[4], w0, gate, shift);
					
					break;
				case "RSHIFT":
					w0 = b.getCreateWire(lineparts[0]);
					shift = Integer.valueOf(lineparts[2]);
					b.addWire(lineparts[4], w0, gate, shift);
					break;
				case "->":
					w0 = b.getCreateWire(lineparts[0]);
					b.addWire(lineparts[2], w0, gate);
					break;
				default:
					throw new AssertionError();
			}
		}
	}
	
	public int calcValue(Wire w) {
		Wire bw = b.getWire(w.getName());
//		System.out.println(bw.getName());
		if ("b".equals(bw.getName())) {
			return 16076;
		} else if(bw.getValue() != null){
		 return bw.getValue();
		} else {
			int res = 0;
			switch (bw.getGate()) {
				case "NOT":
					res = calcValue(bw.getLeftSide());
					res = ~res & 0xFFFF;
					bw.setValue(res);
					return res;
				case "AND":
//					System.out.println(bw.getName());
//					System.out.println(bw.getLeftVal());
					res = (bw.getLeftVal() == null ? calcValue(bw.getLeftSide()) : bw.getLeftVal()) & calcValue(bw.getRightSide());
					bw.setValue(res);
					return res;
				case "OR":
					res =  calcValue(bw.getLeftSide()) | calcValue(bw.getRightSide());
					bw.setValue(res);
					return res;
				case "LSHIFT":
					res = calcValue(bw.getLeftSide()) << bw.getShift();
					bw.setValue(res);
					return res;
				case "RSHIFT":
					res = calcValue(bw.getLeftSide()) >> bw.getShift();
					bw.setValue(res);
					return res;
				case "->":
					res = bw.getLeftVal() == null ? calcValue(bw.getLeftSide()) : bw.getLeftVal();
					bw.setValue(res);
					return res;
				default:
					throw new AssertionError();
			}
		}
	}
	public void printAll(Board b){
	for (String wi : b.wiresList.keySet()) {
			System.out.println(wi+": "+calcValue(b.getWire(wi)));
		}
	}
}
