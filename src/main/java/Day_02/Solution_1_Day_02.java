package Day_02;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_02 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	public Object getSolution(String filepath) {

		res = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);



		for (int y = 0; y < file.size(); y++) {
			String[] spreadsheetRow;
			if(file.get(y).contains(" ")){
				spreadsheetRow = file.get(y).split(" ");
			}else{
				spreadsheetRow = file.get(y).split("\\t");
			}
			

			int max = 0;
			int min = 0;

			for (int i = 0; i < spreadsheetRow.length; i++) {
				int num = Integer.parseInt(spreadsheetRow[i]);
				if(i==0){
					max = num;
					min = num;
				}
				if(num>max){
					max = num;
				}
				if(num<min){
					min = num;
				}
			}
			
			res += (max-min);

		}

		
		return res;
	}

}
