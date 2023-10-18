
package Day_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day_6part2 {
	public static int getAnswer(){
		String puzzleInput=PuzzleInput.getPuzzleInput();
		
		
		
		char[] puzzlechars = puzzleInput.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		
		int i = 0;
        do {
		list.add(puzzlechars[i]+"");
		i++;
        }
		while (list.size()<14);
		if (areAllElementsDifferent(list)){System.out.println(i);}
		
		for(i=14;i<puzzleInput.length();i++){
			list.remove(0);
			list.add(puzzlechars[i]+"");
			if (areAllElementsDifferent(list)){System.out.println(i+1);}
		}
		return i;
    }
	private static boolean areAllElementsDifferent(List<String> list) {
        Set<String> uniqueElements = new HashSet<>(list);

        // If the size of the unique elements set is equal to the original list size,
        // it means all elements are different.
        return uniqueElements.size() == list.size();
    }
}
