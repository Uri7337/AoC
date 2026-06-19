package Day_03;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_03 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long res;

	class BinNum{
		private final int inputSize;
		
		private int oxygenGeneratorRating;
		private int CO2ScrubberRating;
		private int submarineLifeSupportRating;

		int[] array0;
		int[] array1;

		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();	

		BinNum(int inputSize){
			this.inputSize = inputSize;
			this.array0 = new int[inputSize];
			this.array1 = new int[inputSize];
		}

		int getSubmarineLifeSupportRating(){
			return this.submarineLifeSupportRating;
		}

		int getinputSize(){
			return this.inputSize;
		}
		
		void convert(){
			for (int i = 0; i < inputSize; i++) {
				if(array0[i]>array1[i]){
					num1.append(0);
					num2.append(1);
				}else{
					num1.append(1);
					num2.append(0);
				}
			}
		}

		void parseNums(){
			this.oxygenGeneratorRating = Integer.parseInt(num1.toString(), 2);
			this.CO2ScrubberRating = Integer.parseInt(num2.toString(), 2);
		}

		void calculate(){
			this.submarineLifeSupportRating = this.oxygenGeneratorRating * this.CO2ScrubberRating;
		}
		
		void doMagic(){
			convert();
			parseNums();
			calculate();
		}

	}

	public Object getSolution(String filepath) {

		res = 0;

		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		BinNum bn = new BinNum(file.get(0).length());
		
		

		for (int y = 0; y < file.size(); y++) {
			String bits = file.get(y);
			String[] commands = bits.split("");
			
			for(int i = 0; i<bn.getinputSize();i++){
				if(Integer.parseInt(commands[i])==0){
					bn.array0[i]++;
				}else{
					bn.array1[i]++;
				}
				
				
			}

		}

		bn.doMagic();
		res = bn.getSubmarineLifeSupportRating();
		
			
			
		
		return res;
	}

}
