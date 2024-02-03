package Day_3;

import Shared.ReadFile;
import java.awt.Point;
import java.util.ArrayList;

public class Solution_1_Day_3 {

    int solution = 0;
    Grid g;
    Point p = new Point(0, 0);

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
//        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_test_2015.txt";
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_2015.txt";
        file = rf.getInput(filepath);
        
        this.g = new Grid(new House[file.get(0).length()*2][file.get(0).length()*2]);
        p.x = (file.get(0).length())/2;
        p.y = (file.get(0).length())/2;
        g.placeHouse(p);
        //Insert Solution Here:
        for (int i = 0; i < file.get(0).length(); i++) {
            char currchar = file.get(0).charAt(i);

            switch (currchar) {
                case '^':
                    p.y++;
                    move();
                    break;
                case '>':
                    p.x++;
                    move();
                    break;
                case 'v':
                    p.y--;
                    move();
                    break;
                case '<':
                    p.x--;
                    move();
                    break;
            }
        }
        solution = g.houseGiftReport(g.getMap());
        return solution;
    }

    public void move() {
        if (g.houseExist(p)) {
            g.deliverGift(p);
        } else {
            g.placeHouse(p);
        }
    }

}
