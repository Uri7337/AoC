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

		ArrayList<Integer> nums;

		for (int y = 0; y < file.size(); y++) {
			
			String[] spreadsheetRow;
			nums = new ArrayList<>();
			if(file.get(y).contains(" ")){
				spreadsheetRow = file.get(y).split(" ");
			}else{
				spreadsheetRow = file.get(y).split("\\t");
			}
			
			for (int i = 0; i < spreadsheetRow.length; i++) {
				nums.add(Integer.parseInt(spreadsheetRow[i]));
			}

			for (int i = 0; i < nums.size(); i++) {
				int x = nums.get(i);
				
				for (int j = i+1; j < nums.size(); j++) {
					int z = nums.get(j);
					if(x%z==0 && x!=z){
						
						res += x/z;
					}else if(z%x==0 && x!=z){
						
						res += z/x;
					}
				}
			}

		}

		
		return res;
	}

}
