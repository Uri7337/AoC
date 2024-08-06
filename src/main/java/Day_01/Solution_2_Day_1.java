package Day_01;

import shared.ReadFile;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashMap;

public class Solution_2_Day_1 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInputs/Day_01.txt";
        data = rf.getInput(filepath);

        HashMap<Integer, String> numberWordMap = new HashMap<>();

        numberWordMap.put(0, "zero");
        numberWordMap.put(1, "one");
        numberWordMap.put(2, "two");
        numberWordMap.put(3, "three");
        numberWordMap.put(4, "four");
        numberWordMap.put(5, "five");
        numberWordMap.put(6, "six");
        numberWordMap.put(7, "seven");
        numberWordMap.put(8, "eight");
        numberWordMap.put(9, "nine");

        for (int i = 0; i < data.size(); i++) {
            String numbers = "";
            String first = "";
            String second = "";
            int number = 0;

            String puzzleString = data.get(i);
            System.out.println(puzzleString);
            TreeMap<Integer, Integer> numbersInString = new TreeMap<>();

            for (Integer key : numberWordMap.keySet()) {
                int index = puzzleString.indexOf(numberWordMap.get(key));
                if (index == -1) {

                } else {
                    while (index != -1) {
                        numbersInString.put(index, key);
                        index = puzzleString.indexOf(numberWordMap.get(key), index + 1);
                    }
                    System.out.println(numbersInString);
                }
            }
            for (int j = 0; j < puzzleString.length(); j++) {
                if (Character.isDigit(puzzleString.charAt(j))) {
                    numbersInString.put(j, Integer.parseInt(String.valueOf(puzzleString.charAt(j))));
                    System.out.println(numbersInString);
                }
            }

            for (Integer k : numbersInString.values()) {
                numbers += k;

            }

//            
//           
            first = numbers.substring(0, 1);

            if (numbers.length() != 1) {

                second = numbers.substring(numbers.length() - 1);

            } else {

                second = first;
            }

            numbers = first.concat(second);

            try {
                number = Integer.parseInt(numbers);
                solution += number;
                System.out.println(number);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }

        return solution;
    }
}
