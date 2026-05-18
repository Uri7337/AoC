package Day_02;

import java.math.BigInteger;
import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_02_Test {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	BigInteger res = BigInteger.ZERO;

	public BigInteger isInvalidID(BigInteger id){
		
		String idS = String.valueOf(id);
		if(idS.length()%2==0){
			String firstHalf = idS.substring(0, idS.length()/2);
			String secondHalf = idS.substring(idS.length()/2,idS.length());
			if(firstHalf.equals(secondHalf)){
				return id;
			}
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

				for (BigInteger bi = rangeBIFrom; bi.compareTo(rangeBITo)<1 ; bi=bi.add(BigInteger.ONE)) {
					res=res.add(isInvalidID(bi));
				}
			}
        }
        return res;
    }
	
}
