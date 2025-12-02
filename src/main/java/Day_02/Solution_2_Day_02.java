package Day_02;

import java.math.BigInteger;
import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_02 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	BigInteger res = BigInteger.ZERO;

	public BigInteger isInvalidID(BigInteger id){
		int max = 0;
		ArrayList<String> subArr = new ArrayList<>();
		String idS = String.valueOf(id);
		ep.p(idS);
		for(int i = 1 ; i<(idS.length()/2)+1 ; i++){
			String part = idS.substring(0, i);
			
			max = part.length();
			subArr = new ArrayList<>();
			do {
				String sub = idS.substring(max, max+part.length());
				//ep.p("sub: "+sub +" "+ subCounter);
				subArr.add(sub);
				max+=part.length();
			} while (max<idS.length()-(part.length()-1));
				
			ep.p("before: "+subArr);
			for (int j = 0; j < subArr.size(); j++) {
				if(part.equals(subArr.get(j))){
					subArr.remove(j);
				}
			}
			ep.p("after: "+subArr.isEmpty());
				//return id;
			
		}
		
		
			
		

		return BigInteger.ZERO;
	}

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		res = BigInteger.ZERO;

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			
			String[] ranges = line.split(",");
			
			for (String string : ranges) {
				String[] singleRanges = string.split("-");
				String rangeSFrom = singleRanges[0];
				String rangeSTo = singleRanges[1];
				BigInteger rangeBIFrom = new BigInteger(rangeSFrom);
				BigInteger rangeBITo = new BigInteger(rangeSTo);
				rangeBITo=rangeBITo.add(BigInteger.ONE);
				//ep.p(rangeBITo);

				for (BigInteger bi = rangeBIFrom; bi.compareTo(rangeBITo)<0 ; bi=bi.add(BigInteger.ONE)) {
					res=res.add(isInvalidID(bi));
				}
			}
        }
        return res;
    }
	
}
