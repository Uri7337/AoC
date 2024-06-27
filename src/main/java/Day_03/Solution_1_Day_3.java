package Day_03;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_3 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        /* String filepath = "./src/main/resources/Day_03_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_03_2016.txt";
        file = rf.getInput(filepath);

        int possibleTriangles = 0;
        int t1,t2,t3;

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] triangleLenghts = file.get(i).split(" ");

                t1 = numb(triangleLenghts[0]);
                t2 = numb(triangleLenghts[1]);
                t3 = numb(triangleLenghts[2]);
                
                possibleTriangles += checkPossibleTriangles(t1,t2,t3); 
        }
        solution = possibleTriangles;
        return solution;
    }

    public int numb(String n){
        return Integer.parseInt(n);
    }

    public int checkPossibleTriangles(int x, int y, int z){
        if((x+y)>z && (y+z)>x && (z+x)>y){
            return 1;
        }
        return 0;
    }

    // prints content, System.out.println is way too long
    public void p(Object content) {
        System.out.println(content.toString());
    }

    // ----debug zone----

}
