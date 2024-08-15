package Day_04;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_1_Day_04 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	

	ArrayList<String> file;
	public Object getSolution(String filepath) {
		int result = 0;
        
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
            String[] lineParts = line.split(":");

            int cardID = Integer.parseInt(lineParts[0].split("  *")[1]);
            String[] winningNumbers = lineParts[1].split("\\|")[0].split("  *");
            String[] myNumbers = lineParts[1].split("\\|")[1].split("  *");

            ArrayList<Integer> wN = convertNumbers(winningNumbers);
            ArrayList<Integer> mN = convertNumbers(myNumbers);
            mN.retainAll(wN);
            
            if(mN.size()>0){
                
                int res =1;
                for (int j = 1; j < mN.size(); j++) {
                    res*=2;
                }
                //ep.p(mN + " size: "+mN.size() + " result: "+ res);
                result += res;
                //ep.p(result);
            }
            
        }
		return solution = result;
	}

    ArrayList<Integer> convertNumbers(String[] numbers){
        ArrayList<Integer> aL = new ArrayList<>();
        for (int i = 1; i < numbers.length; i++) {
            aL.add(Integer.parseInt(numbers[i]));
        }

        return aL;
    }

	// ----debug zone----
	
}
