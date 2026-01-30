package Day_02;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;
import shared.AlphabetContainer;

public class Solution_2_Day_02 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long grandTotal;

	class Checksum{
		int two = 0;
		int three = 0;

		void addTwo(){
			this.two++;
		}

		void addThree(){
			this.three++;
		}

		int sumSum(){
			return this.two * this.three;
		}

	}

	boolean findNum(int num, int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num){
				return true;
			}
		}

		return false;
	}

	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		Checksum cs = new Checksum();
		AlphabetContainer ac = new AlphabetContainer("Small");

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			int[] nums = new int[26];
			char[] chararr = line.toCharArray();

			for (char c : chararr) {
				nums[ac.findChar(c)]++;
			}
			
			for (int num : nums) {
				ep.np(num);
			}
			ep.p("");
			if(findNum(2, nums)){
				cs.addTwo();
			}

			if(findNum(3, nums)){
				cs.addThree();
			}

			
		}

		// grandTotal = 
		return cs.sumSum();
	}

}
