package Day_03;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_2_Day_3 {

    int solution = 0;

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "./src/main/resources/Day_03_test_2016.txt";
        /* String filepath = "./src/main/resources/Day_03_2016.txt"; */
        file = rf.getInput(filepath);

        int possibleTriangles = 0;
        ArrayList<Integer> t = new ArrayList<Integer>();

        // Insert Solution Here:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < file.size(); j++) {
                
                    String[] triangleLenghts = file.get(j).split(" ");
                    
                    t.add(numb(triangleLenghts[0]));
                    
                    if(j%3==0 && j!=0){
                        p(t.get(0)+" "+ t.get(1)+" "+t.get(2));
                        possibleTriangles += checkPossibleTriangles(t.get(0),t.get(1),t.get(2));
                        t.clear();
                    }
                
            }
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
