package Day_05;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_05 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	class Range {
		long id;
		long left;
		long right;
		boolean active = true;
		ArrayList<Long> checkedIds = new ArrayList<>();

		Range(long left, long right, long id) {
			this.left = left;
			this.right = right;
			this.id = id;
		}
	}

	void checkRanges(Range r1, Range r2) {

		if (r1.left < r2.left && r1.right < r2.left) {
			r1.checkedIds.add(r2.id);

		}

		if (r1.left > r2.right && r1.right > r2.right) {
			r1.checkedIds.add(r2.id);

		}

		if (!r1.checkedIds.contains(r2.id)) {
			if (r1.left < r2.left) {
				if (r1.right >= r2.left && r1.right <= r2.right) {
					r1.right = r2.left - 1;
					r1.checkedIds.add(r2.id);
				}
				if (r1.right >= r2.right) {
					r2.active = false;
					r1.checkedIds.add(r2.id);
				}
			} else if (r1.left == r2.left) {

				if (r1.right >= r2.right) {
					r2.active = false;
					r1.checkedIds.add(r2.id);
				}

			}
		}

	}

	public Object getSolution(String filepath) {

		ArrayList<Range> ranges = new ArrayList<>();

		res = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			
			if(!line.equals("")){
				if(line.contains("-")){
					//ep.p(line);
					String[] linesplit = line.split("-");
					long l = Long.parseLong(linesplit[0]);
					long r = Long.parseLong(linesplit[1]);
					Range rang = new Range(l,r, y);
					ranges.add(rang);
				}
			}
			
		}

		// 3 4 5
		//	 	 10 11 12 13 14
		//			   12
		//					  	   16 17 18 19 20
		// 			   12 13 14 15 16 17 18

		//-----------------------------------------
		// correct
		// 3 4 5
		//	 	 10 11 
		//			   
		//					  	   16 17 18 19 20
		// 			   12 13 14 15
		// res: 14

		// my bad one
		// 3 4 5
		//	 	 10 11 
		//			   
		//					  	   16 17 18 19 20
		// 			   12 13 14 15 16 17 18
		// res: 17 

		for (int i = 0; i < ranges.size(); i++) {
			Range r1 = ranges.get(i);
			if(!r1.active) continue;
			for (int j = i+1 ; j < ranges.size(); j++) {
				Range r2 = ranges.get(j);

				if(!r2.active) continue;

				checkRanges(r1, r2);
				if(!r1.checkedIds.contains(r2.id)){
					checkRanges(r2, r1);
				}

			}
		}

		for (int i = 0; i < ranges.size(); i++) {
			Range r = ranges.get(i);
			if(r.active){
				ep.p(r.left + "-"+ r.right +" : "+((r.right - r.left) + 1));
				res+= (r.right - r.left) +1;
			}
		}


		//424053060155440 -- bad
		//353507173555373
        return res;
    }

}
