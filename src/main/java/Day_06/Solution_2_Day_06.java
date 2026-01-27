package Day_06;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_06 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long grandTotal;

	class Pillar {

		ArrayList<String> nums = new ArrayList<>();
		String symbol; // + *
		long res = 0;

		void addmult() {
			if (symbol.equals("*")) {
				this.res = 1;
			}
			for (int i = 0; i < nums.size(); i++) {
				if (nums.get(i).equals(""))
					continue;
				switch (symbol) {

					case "+" -> {
						res += Long.valueOf(nums.get(i));
					}

					case "*" -> {
						res *= Long.valueOf(nums.get(i));
					}

					default -> ep.p(symbol);
				}
			}
		}

		void showNums() {
			for (int i = 0; i < nums.size(); i++) {
				ep.np(nums.get(i));
				if (i < nums.size() - 1)
					ep.np(" " + symbol + " ");
				if (i == nums.size() - 1)
					ep.np(" = " + this.res);
			}
			ep.p("");
		}

	}

	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		ArrayList<Pillar> pillars = new ArrayList<>();
		Pillar p = new Pillar();

		for (int x = 0; x < file.get(0).length(); x++) {
			int space = 0;
			StringBuilder sb = new StringBuilder();
			for (int y = 0; y < file.size(); y++) {
				String line = file.get(y);
				String[] sarr = line.split("");
				String symbol = sarr[x];

				if (symbol.equals(" ")) {
					space++;
				} else if (symbol.equals("*") || symbol.equals("+")) {
					p.symbol = symbol;
				} else {
					sb.append(symbol);
				}

				if (space == file.size()) {
					pillars.add(p);
					p = new Pillar();
				}

			}
			p.nums.add(sb.toString());
			if (x + 1 == file.get(0).length()) {
				pillars.add(p);
			}

		}

		for (Pillar pi : pillars) {
			pi.addmult();
			grandTotal += pi.res;
			// pi.showNums();
		}

		// 10695785245101
		return grandTotal;
	}

}
