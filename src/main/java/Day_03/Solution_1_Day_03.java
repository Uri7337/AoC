package Day_03;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Solution_1_Day_03 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);

		String regeee = "mul\\(\\d{1,3},\\d{1,3}\\)";
		String regeee2 = "\\d{1,3},\\d{1,3}";
		Pattern pattern = Pattern.compile(regeee);
		Pattern pattern2 = Pattern.compile(regeee2);

		

		for (String s : findMatches(pattern, data.get(0))) {
			ep.p(s);	
			for (String s2 :findMatches(pattern2,s)){
				ep.p(s2);
			}
		}
		

		return solution;
	}

	ArrayList<String> findMatches(Pattern pattern, String s){
		Matcher matcher = pattern.matcher(s);
		ArrayList<String> matches = new ArrayList<>();
		if (matcher.find(0)) {
				//ep.p(matcher.results().count());
				
				Stream<String> outputStream = matcher.results().map(MatchResult::group);
				outputStream.forEach(matches::add);
			return matches; 
		} else {
			return null;
		}
	}
}
