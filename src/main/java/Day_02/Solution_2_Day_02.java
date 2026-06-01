package Day_02;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_02 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	public Object getSolution(String filepath) {

		res = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		int horizontal = 0;
		int depth = 0;
		int aim = 0;
		boolean zero = false;

		for (int y = 0; y < file.size(); y++) {
			String[] commands = file.get(y).split(" ");

			if (commands[0].equals("up")) {
				//depth -= Integer.valueOf(commands[1]);
				aim -= Integer.valueOf(commands[1]);
			} else if (commands[0].equals("down")) {
				//depth += Integer.valueOf(commands[1]);
				aim += Integer.valueOf(commands[1]);
			} else {
				horizontal += Integer.valueOf(commands[1]);
				if(aim==0){
					aim++;
					zero = true;
				} 
				depth = depth + (aim *Integer.valueOf(commands[1]));
				if(zero){
					aim--;
					zero = false;
				}
			}

		}
		ep.p(depth);
		res = horizontal * depth;
		ep.p(res);
		return res;
	}

}
