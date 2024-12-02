package Day_01;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution_2_Day_01 {

    int solution = 0;
    EasyPrint ep = new EasyPrint();

    public Object getSolution(String filepath) {
        solution = 0;
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();

        HashMap<Integer, Integer> num3 = new HashMap<>();

        data = rf.getInput(filepath);

        for (int i = 0; i < data.size(); i++) {
            String[] numbers = data.get(i).split("   ");

            num3.put(Integer.parseInt(numbers[0]), 0);
            num1.add(Integer.parseInt(numbers[0]));
            num2.add(Integer.parseInt(numbers[1]));
        }

        for (int bob : num2) {
            if (num3.get(bob) == null) {

            } else {
                num3.put(bob, num3.get(bob) + 1);
            }

        }

        //num3.forEach((t, u) -> ep.p(t + " " + u));

        for (int bob : num1) {
            if (num3.get(bob) == null) {

            } else {
                solution += bob * num3.get(bob);
            }

        }

        return solution;
    }

}
