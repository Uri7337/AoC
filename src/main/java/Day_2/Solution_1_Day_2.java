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
        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInputs/Day2_input.txt";
        file = rf.getInput(filepath);

        HashMap<Integer, String> cubes = new HashMap<>();

        boolean possible = false;

        int r = 0;
        int g = 0;
        int b = 0;

        cubes.put(12, "red");
        cubes.put(13, "green");
        cubes.put(14, "blue");

        for (int i = 0; i < file.size(); i++) {

            r = 12;
            g = 13;
            b = 14;

            String puzzleString = file.get(i);
            System.out.println(puzzleString);

            TreeMap<Integer, Integer> numbersInString = new TreeMap<>();

            for (Integer key : cubes.keySet()) {
                int index = puzzleString.indexOf(cubes.get(key));

                if (index == -1) {

                } else {
                    while (index != -1) {
                        System.out.println(cubes.get(key));
                        //System.out.println(index);
                        int gamecubes = puzzleString.charAt(index - 2) -'0';
								
								Integer.parseInt(puzzleString.substring(index - 2,2));
                        System.out.println(gamecubes);
                        switch (key) {
                            case 12:
                                r -= gamecubes;
                                System.out.println("r: " + r);
                                break;
                            case 13:
                                g -= gamecubes;
                                System.out.println("g: " + g);
                                break;
                            case 14:
                                b -= gamecubes;
                                System.out.println("b: " + b);
                                break;
                        }

                        index = puzzleString.indexOf(cubes.get(key), index + 1);
                    }

                }
            }

            possible = r < 0 || g < 0 || b < 0 ? false : true;
            if (possible) {
                solution += i + 1;
            }
            System.out.println("sol: " + solution);
        }

        return solution;
    }
}
