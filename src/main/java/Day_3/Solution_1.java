package Day_3;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Solution_1 {

    public int getSolution() {

        boolean found = false;
        String part1 = "";
        String part2 = "";
        int result = 0;
        int result1 = 0;
        int result2 = 0;

        String s = "/home/deadpool7337/UriPrograms/Other/PuzzleInputs/Day_3.txt";
        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                part1 = data.substring(0, (data.length() / 2));
                part2 = data.substring((data.length() / 2), data.length());
                char[] chars1 = part1.toCharArray();
                char[] chars2 = part2.toCharArray();
                found = false;
                for (int i = 0; i < chars1.length; i++) {
                    for (int j = 0; j < chars2.length; j++) {
                        if (!found) {
                            if (chars1[i] == chars2[j]) {
                                found = true;
                                System.out.println(chars1[i] + " same as " + chars2[j]);
                                if (Character.isUpperCase(chars1[i])) {
                                    int value = chars1[i];
                                    value -= 38;
                                    System.out.println(value);
                                    result += value;
                                    break;
                                } else {
                                    int value = chars1[i];
                                    value -= 96;
                                    System.out.println(value);
                                    result += value;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }
}
