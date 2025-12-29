package Day_05;



import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_05 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res;

	class Range{
		long left;
		long right;

		Range(long left,  long right){
			this.left = left;
			this.right = right;
			
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
					Range rang = new Range(l,r);
					ranges.add(rang);
				}
			}
			
		}

		// 3 4 5
		//	 	 10 11 12 13 14
		//					  	   16 17 18 19 20
		// 			   12 13 14 15 16 17 18


		for (int i = 0; i < ranges.size(); i++) {
			for (int j = i+1 ; j < ranges.size(); j++) {
				long r1Left = ranges.get(i).left;
				long r1Right = ranges.get(i).right;
				long r2Left = ranges.get(j).left;
				long r2Right = ranges.get(j).right;

				// 3 4 5
				//	 	 10 11 12 13 14
				if(r1Left<r2Left && r1Right<r2Left){
					break;
				}

				//	 	 10 11 12 13 14
				// 3 4 5
				if(r1Left>r2Right && r1Right>r2Right){
					break;
				}


				//	 	 10 11 12 13 14
				//					  	   16 17 18 19 20
				// 			   12 13 14 15 16 17 18

				//---------------------------------------------
				
				//	 	 10 11 12
				//			   12 13 14

				//	 	 10 11 12 13
				//			   12 13 14 

				//	 	 10 11 12 13 14 
				//			   12 13 14


				
				if(r1Left<r2Left){
					if(r1Right>=r2Left && r1Right <=r2Right){
						ranges.get(i).right = r2Left-1;
					}
				}

				//	 	 10 11 12 13 14 15
				//			   12 13 14  

				//					  	   16 17 18 19 20
				// 			   12 13 14 15 16 17 18

			}
		}

        return res;
    }
	
}
