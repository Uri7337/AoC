package Day_02;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_02 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res = 0;

	public long isInvalidID(long id){
		int max = 0;
		ArrayList<String> subArr = new ArrayList<>();
		String idS = String.valueOf(id);
		//ep.p(idS);
		
		for(int i = 1 ; i<(idS.length()/2)+1 ; i++){
			String part = idS.substring(0, i);
			if(idS.length()%part.length() == 0){
				max = part.length();
				subArr = new ArrayList<>();
				do {
					String sub = idS.substring(max, max+part.length());
					//ep.p("sub: "+sub +" "+ subCounter);
					subArr.add(sub);
					max+=part.length();
				} while (max<idS.length()-(part.length()-1));
				//ep.p("part: "+ part +" max: "+ max);
				//ep.p("before: "+subArr);
				
				for (int j = 0; j < subArr.size(); j++) {
					if(part.equals(subArr.get(j))){
						subArr.remove(j);
						j=-1;
					}
				}
				//ep.p("after: "+subArr+" "+ subArr.isEmpty());
				if (subArr.isEmpty()) return id;
			}
		}
		
		return 0;
	}

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		res = 0;

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			
			String[] ranges = line.split(",");
			
			for (String string : ranges) {
				String[] singleRanges = string.split("-");
				String rangeSFrom = singleRanges[0];
				String rangeSTo = singleRanges[1];
				long rangeFrom = Long.parseLong(rangeSFrom);
				long rangeTo = Long.parseLong(rangeSTo);
				rangeTo++;
				

				for (long bi = rangeFrom; bi<rangeTo; bi++) {
					res += isInvalidID(bi);
				}
			}
        }
		//35950619148
		
        return res;
    }
	
}
