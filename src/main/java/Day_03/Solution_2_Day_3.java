package Day_03;

import Shared.ReadFile;
import java.awt.Point;
import java.util.ArrayList;

public class Solution_2_Day_3 {

    int solution = 0;
    Grid g;
    Point p = new Point(0, 0);
    Point robop = new Point(0, 0);

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
//        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_test_2016.txt";
        String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_3_2016.txt";
        file = rf.getInput(filepath);

        this.g = new Grid(new House[file.get(0).length() * 2][file.get(0).length() * 2]);
        p.x = (file.get(0).length()) / 2;
        p.y = (file.get(0).length()) / 2;
        robop.x = (file.get(0).length()) / 2;
        robop.y = (file.get(0).length()) / 2;
        g.placeHouse(p);
        g.placeHouse(robop);
        //Insert Solution Here:
        for (int i = 0; i < file.get(0).length(); i++) {
            char currchar = file.get(0).charAt(i);
            if (i % 2 == 0) {
                switch (currchar) {
                    case '^':
                        robop.y++;
                        robomove();
                        break;
                    case '>':
                        robop.x++;
                        robomove();
                        break;
                    case 'v':
                        robop.y--;
                        robomove();
                        break;
                    case '<':
                        robop.x--;
                        robomove();
                        break;
                }
            }else{
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
    public void robomove() {
        if (g.houseExist(robop)) {
            g.deliverGift(robop);
        } else {
            g.placeHouse(robop);
        }
    }

}
