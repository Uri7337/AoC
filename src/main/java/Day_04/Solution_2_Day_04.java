package Day_04;

import Shared.EasyPrint;
import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_04 {
    EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        /* String filepath = "./src/main/resources/Day_04_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_04_2016.txt";
        file = rf.getInput(filepath);

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            //  file.get(i).split(" ");

                
        }
        

        return solution;
    }

    // ----debug zone----

}