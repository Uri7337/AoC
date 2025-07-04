package Day_03;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution_1_Day_03 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	

	ArrayList<String> file;
	public Object getSolution(String filepath) {
		int result = 0;
        
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
		
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			//ep.p(line);
			String[] matches = Pattern.compile("mul\\(\\d+,\\d+\\)")
                          .matcher(line)
                          .results()
                          .map(MatchResult::group)
                          .toArray(String[]::new);

			List<Integer> n;
			for (String string : matches) {
				Pattern pattern = Pattern.compile("\\d+");
				Matcher matcher = pattern.matcher(string);

				// Extract integers
				n = new ArrayList<>();
				while (matcher.find()) {
					n.add(Integer.parseInt(matcher.group()));
				}
				//System.out.println("" + n);
				result += n.get(0)*n.get(1);
			}

			
		}	

        
        

		return result;
	}

	// ----debug zone----
	
}
