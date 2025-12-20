package Day_03;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_03 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	class Elf{
		long largestJoltage;
		int startIndex;
		int joltageSize;
		int largestBattery;

		Elf(long largestJoltage, int startIndex){
			this.largestJoltage = largestJoltage;
			this.startIndex = startIndex;
		}
	}

	Elf getMeSpiderManPhotos(String line, Elf greenGoblin){
		char x = '0';
		char y = '0';
		for (int i = greenGoblin.startIndex; i < (line.length()-(greenGoblin.joltageSize)); i++) {
			x = line.charAt(i);
			//Character.getNumericValue();
			if(x>y){
				y=x;
			}
			
		}
		
		
		greenGoblin.largestJoltage += Character.getNumericValue(y)*(Math.pow(10,(greenGoblin.joltageSize)));
		
		greenGoblin.startIndex = line.indexOf(y,greenGoblin.startIndex);
		greenGoblin.startIndex++;
		return greenGoblin; 
	}

	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		Elf helper = new Elf(0l,0);
		long res = 0;

		for (int i = 0; i < file.size(); i++) {
			
			String line = file.get(i);
			//String[] s = line.split("");
			
			helper = new Elf(0l,0);

			for (int j = 11; j > -1 ; j--) {
				helper.joltageSize = j;
				helper = getMeSpiderManPhotos(line, helper);

			}
			
			res+= helper.largestJoltage;

        }
		
		//3121910778619
		//172981362045136
		//172981362045136
        return res;
    }
	
}
