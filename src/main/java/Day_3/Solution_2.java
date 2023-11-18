package Day_3;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Set;

//vJrwpWtwJgWrhcsFMMfFFhFp
//jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
//PmmdzqPrVvPwwTWBwg 
public class Solution_2 {

    public int getSolution() {

        String s = "C:/UriStuff/Other/puzzle.txt";
        String line1 = "";
        String line2 = "";
        String line3 = "";

        //ArrayList<Character> matches = new ArrayList<Character>();
        int result = 0;
        int lines = 0;

        boolean found = false;

        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                line1 = myReader.nextLine();
                line2 = myReader.nextLine();
                line3 = myReader.nextLine();

                char[] chars1 = line1.toCharArray();
                char[] chars2 = line2.toCharArray();
                char[] chars3 = line3.toCharArray();

                ArrayList<Character> matches = new ArrayList<Character>();

                for (int i = 0; i < chars1.length; i++) {
                    for (int j = 0; j < chars2.length; j++) {

                        if (chars1[i] == chars2[j]) {
                            matches.add(chars1[i]);
                        }
                    }
                }
                
                Set<Character> set = new HashSet<>(matches);
                matches.clear();
                matches.addAll(set);
               
                for (Character ch : matches) {
                    for (int i = 0; i < chars3.length; i++) {
                        if (ch == chars3[i]) {
                            if (Character.isUpperCase(chars3[i])) {
                                int value = chars3[i];
                                value -= 38;
                                result += value;
                                break;
                            } else {
                                int value = chars3[i];
                                value -= 96;
                                result += value;
                                break;
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
