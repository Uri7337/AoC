package Day_8;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_8 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		ArrayList<Element> element = new ArrayList<Element>();
		String filepath = "C:\\ProgramsUri\\ALL_Files\\Temp_WorkSpace\\Day_8.txt";
		file = rf.getInput(filepath);

		String input = "LLR";

		for (int i = 0; i < file.size(); i++) {
			String[] separated = file.get(i).split("[ =(,)]+");
			for (int j = 0; j < separated.length; j++) {

			}
			element.add(new Element(separated[0], separated[1], separated[2]));
		}

		String inputarr[] = input.split("");

		
		String step = "";
		for (int k = 0; k < element.size(); k++) {
			if ("AAA".equals(element.get(k).name)) {
				step = element.get(k).name;

			}
		}

		int inputloop = 0;
		boolean foundit = false;

		while (!foundit) {
			if (inputloop > inputarr.length) {
				inputloop = 0;
			}
			System.out.println("inputarr.length: "+inputarr.length);
			System.out.println("inputloop: "+inputloop);
			System.out.println("inputarr[inputloop]: "+inputarr[inputloop]);
			if ("L".equals(inputarr[inputloop])) {
				for (int j = 0; j < element.size(); j++) {
					if (step.equals(element.get(j).name)) {
						System.out.println("step: "+step);
						System.out.println("jleft: "+j);
						System.out.println("element.get(j).name: "+element.get(j).name);
						System.out.println("element.get(j).left: "+element.get(j).left);
						step = element.get(j).left;
						System.out.println("step2: "+step);

					}
				}
			} else {
				for (int j = 0; j < element.size(); j++) {
					if (step.equals(element.get(j).name)) {
						System.out.println("step: "+step);
						System.out.println("jright: "+j);
						System.out.println("element.get(j).name: "+element.get(j).name);
						System.out.println("element.get(j).right: "+element.get(j).right);
						step = element.get(j).right;
						System.out.println("step2: "+step);
					}
				}
			}
//			System.out.println("step: "+step);
//			System.out.println("solution: "+solution);
//			System.out.println("inputloop: "+inputloop);
			
			if ("ZZZ".equals(step)) {
				
				foundit = true;
				break;
			}
			inputloop++;
			solution++;
		}
		return solution;
	}
}
