package Day_05;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_1_Day_05 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	ArrayList<String> file;
	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
		ArrayList<ArrayList<Long>> seedsList = new ArrayList<ArrayList<Long>>();
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			if (line.contains("seeds:")){
				//seeds
				ArrayList<Long> seedList;
				String[] seeds = line.split(" ");
				for (int j = 1; j < seeds.length; j++) {
					seedList = new ArrayList<Long>();
					seedList.add(Long.parseLong(seeds[j]));
					seedsList.add(seedList);
				}

				/* for (int k = 0; k < seedsList.size(); k++) { 
					for (int j = 0; j < seedsList.get(k).size(); j++) { 
						System.out.print(seedsList.get(k).get(j) + " "); 
					} 
					System.out.println(); 
				} */ 

			}else{
				if (line.contains("-to-")) {
					//seed-to-soil map:
					String from = line.split("-to-")[0];
					String to = line.split("-to-")[1].split(" ")[0];
					ep.p(from +"->" + to);


				} else if (line.matches("[\\d]* [\\d*]* [\\d]*")){
					//numbers
					long n1 = Long.parseLong(line.split(" ")[0]);
					long n2 = Long.parseLong(line.split(" ")[1]);
					long n3 = Long.parseLong(line.split(" ")[2]);
					/* ep.p(n1 +"-"+ n2 +"-"+ n3); */
				}
			}

        }
		return solution;
	}

	class seed {
		//changing state based on where the seed is currently located e.g. if seed-> soil state:soil 
		String state;
		int number;
		ArrayList<Long> seedHistory = new ArrayList<Long>();

	} 

	// ----debug zone----
	
}
