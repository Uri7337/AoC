package Day_03;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_03 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res = 0;

	int getHighNumber(String line,String[] singles,boolean first, int startIndex){
		int ll = line.length();
		int x = 0;
		int y = 0;

		for (int i = startIndex; i < ll; i++) {
			x = Integer.valueOf(singles[i]);
			if(first){
				if(x>y && i<ll-1){
					y=x;
				}
			}else{
				if(x>y){
					y=x;
				}
			}
		}

		return y;
	}

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		res = 0;

		for (int i = 0; i < file.size(); i++) {
			
			String line = file.get(i);
			String[] s = line.split("");

			int x = getHighNumber(line,s,true,0);
			int y = getHighNumber(line,s,false,(line.indexOf(String.valueOf(x))+1));
			
			//ep.p(line +" : "+ x +" "+y);

			res += (x * 10) +y;

        }
		
		//17346
        return res;
    }
	
}
