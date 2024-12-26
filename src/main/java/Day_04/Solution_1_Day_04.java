package Day_04;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;
import java.awt.Point;

public class Solution_1_Day_04 {

    int xmasCounter = 0;
    EasyPrint ep = new EasyPrint();

    public Object getSolution(String filepath) {
        xmasCounter = 0;
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        data = rf.getInput(filepath);

        int xLen = data.get(0).length();
        int yLen = data.size();

        // Q: is the first [] X?
        // A: no, it's Y

        // new char array
        char[][] puzzle = new char[yLen][xLen];
        ArrayList<Point> xPos = new ArrayList<>();

        // fill char array with data
        for (int y = 0; y < yLen; y++) {
            char[] tempDataLine = data.get(y).toCharArray();
            for (int x = 0; x < xLen; x++) {
                if (tempDataLine[x] == 'X') {
                    Point p = new Point(x, y);
                    xPos.add(p);
                }
                puzzle[y][x] = tempDataLine[x];
            }

        }

        // print char array
        // pcharar(puzzle, yLen, xLen);

        // i have arraylist full of X positions
        // now i can go thru all of them and search for M's

        // searchLetter
        // searchInDirection!!
        // what letter
        //

        // for every X do a circle around to find M
        for (Point p : xPos) {
            // search In Every Direction around X 
            for (int y = -1; y < 2; y++) {
                for (int x = -1; x < 2; x++) {
                    if(0==x && 0==y){
                        continue;
                    }

                    int dirX = (int) p.getX() + x;
                    int dirY = (int) p.getY() + y;
                    if(0 > dirY || yLen < dirY || 0 > dirX || xLen < dirX){
                        continue;
                    }

                    //call searchLEtter i guess
                }
            }
        }

        return xmasCounter;
    }

    void searchLetter(char letter, Point direction){
        // The direction represents the movement from the current letter
        // to one of the following positions: 
        // ⬆️ (up), ⬇️ (down), ⬅️ (left), ➡️ (right), 
        // ↗️ (up-right), ↖️ (up-left), ↘️ (down-right), ↙️ (down-left)

        switch (letter) {
            case 'M':
                
                break;
            case 'A':
                
                break;
            case 'S':
                
                break;
        
            default:
                break;
        }

    }

    void pcharar(char[][] puzzle, int yLen, int xLen) {

        for (int y = 0; y < yLen; y++) {
            for (int x = 0; x < xLen; x++) {
                ep.np(puzzle[y][x]);
            }
            ep.p("");
        }
    }

}
