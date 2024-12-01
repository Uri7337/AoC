package Day_01;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_01 {

    int solution = 0;
    EasyPrint ep = new EasyPrint();

    public Object getSolution(String filepath) {
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        
        data = rf.getInput(filepath);

        for (int i = 0; i < data.size(); i++) {
            String[] numbers = data.get(i).split("   ");
            num1.add(Integer.parseInt(numbers[0]));
            num2.add(Integer.parseInt(numbers[1]));

        }

        num1.sort(null);
        num2.sort(null);

        //ep.p(num1);
        solution = 0;
        for (int i = 0; i < num1.size(); i++) {

            solution += Math.abs(num1.get(i) - num2.get(i));

        }

        return solution;
    }
}
