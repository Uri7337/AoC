package Day_5;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_5 {

    int solution = 0;
    ArrayList<String> file = new ArrayList<String>();

    public int getSolution() {
        ReadFile rf = new ReadFile();

//        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_test_2015.txt";
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_5_2015.txt";
        file = rf.getInput(filepath);

        //Insert Solution Here:
        for (int row = 0; row < file.size(); row++) {

            System.out.println(file.get(row));
            System.out.println(!isForbidden(row));
            System.out.println(gotvowels(row));
            System.out.println(gotdoubles(row));

            if (!isForbidden(row)) {
                if (gotvowels(row) && gotdoubles(row)) {
                    solution++;
                }
            }

        }

        return solution;
    }

    public boolean gotvowels(int filerow) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int containsvow = 0;
        int vow = 0;
        for (char v : vowels) {
            for (int i = 0; i < file.get(filerow).length(); i++) {
                containsvow = Character.compare(file.get(filerow).charAt(i),v);
                if (containsvow == 0) {
                    vow++;
                    if (vow >= 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean gotdoubles(int filerow) {
        char currletter = ' ';
        char before = ' ';
        char after = ' ';

        for (int i = 0; i < file.get(filerow).length(); i++) {

            currletter = file.get(filerow).charAt(i);

            before = i == 0 ? ' ' : file.get(filerow).charAt(i - 1);
            after = i == (file.get(filerow).length() - 1) ? ' ' : file.get(filerow).charAt(i + 1);

            int comparebefore = Character.compare(currletter, before);
            int compareafter = Character.compare(currletter, after);
            if (comparebefore == 0 || compareafter == 0) {
                return true;

            }
        }
        return false;
    }

    public boolean isForbidden(int filerow) {
        String[] forb = {"ab", "cd", "pq", "xy"};
        boolean forbidden;
        for (String i : forb) {
            forbidden = file.get(filerow).contains(i);
            if (forbidden) {
                return true;
            }
        }
        return false;
    }

}
