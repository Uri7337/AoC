package Day_2;

import Shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution_1_Day_2 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "c:/ProgramsUri/ALL_Files/Temp_WorkSpace/Day2_input_test.txt";
		file = rf.getInput(filepath);

		HashMap<Integer, String> cubes = new HashMap<>();

		cubes.put(12, "red");
		cubes.put(13, "green");
		cubes.put(14, "blue");

		for (int i = 0; i < file.size(); i++) {
//            String numbers = "";
//            String first = "";
//            String second = "";
//            int number = 0;

			String puzzleString = file.get(i);
			System.out.println(puzzleString);

			TreeMap<Integer, Integer> numbersInString = new TreeMap<>();

			for (Integer key : cubes.keySet()) {
				int index = puzzleString.indexOf(cubes.get(key));

				if (index == -1) {

				} else {
					while (index != -1) {
						System.out.println(cubes.get(key));
						System.out.println(index);
						System.out.println(Integer.parseInt(String.valueOf(puzzleString.charAt(index-2))));
                        numbersInString.put(index, key);
                        index = puzzleString.indexOf(cubes.get(key), index + 1);
					}
					System.out.println(numbersInString);
				}
			}
//            for (int j = 0; j < puzzleString.length(); j++) {
//                if (Character.isDigit(puzzleString.charAt(j))) {
//                    numbersInString.put(j, Integer.parseInt(String.valueOf(puzzleString.charAt(j))));
//                    System.out.println(numbersInString);
//                }
//            }
//
//            for (Integer k : numbersInString.values()) {
//                numbers += k;
//
//            }
//
////            
////           
//            first = numbers.substring(0, 1);
//
//            if (numbers.length() != 1) {
//
//                second = numbers.substring(numbers.length() - 1);
//
//            } else {
//
//                second = first;
//            }
//
//            numbers = first.concat(second);
//
//            try {
//                number = Integer.parseInt(numbers);
//                solution += number;
//                System.out.println(number);
//            } catch (NumberFormatException ex) {
//                ex.printStackTrace();
//            }
		}

		return solution;
	}
}
