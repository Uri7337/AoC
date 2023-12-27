package Day_23;

import java.awt.Point;
import java.util.ArrayList;

public class Map {

    Spot[][] policka; //políčka
    Point startlocation = null;
    Point finishlocation = null;
    int rows = 0;
    int cols = 0;

    public Map(ArrayList<String> file) {

        rows = file.size(); // ↓
        cols = file.get(0).length(); //->

        policka = new Spot[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                policka[i][j] = new Spot(new Znak(file.get(i).charAt(j)), i, j, false);
            }
        }

        

        findStart(cols);
        findFinish(cols);

        //set Start and Finish 
        policka[startlocation.x][startlocation.y].setZnak(new Znak('S'));
        policka[finishlocation.x][finishlocation.y].setZnak(new Znak('F'));

        
    }

    void printMap(int rows, int cols) {
        System.out.println("");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(policka[i][j].getZnak().zn);

            }
            System.out.println("");
        }
        System.out.println("");
    }

    void findStart(int cols) {
        for (int i = 0; i < cols; i++) {

            startlocation = policka[0][i].getZnak().z == 1 ? new Point(0, i) : null;
            if (startlocation != null) {
                break;
            }
        }
    }

    void findFinish(int cols) {
        for (int i = 0; i < (cols); i++) {

            finishlocation = policka[(cols - 1)][i].getZnak().z == 1 ? new Point((cols - 1), i) : null;
            if (finishlocation != null) {
                break;
            }
        }

    }

}
