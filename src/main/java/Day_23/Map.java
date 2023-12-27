package Day_23;

import java.awt.Point;
import java.util.ArrayList;

public class Map {

    Spot[][] policka; //políčka
    Point startlocation = null;
    Point finishlocation = null;

    public Map(ArrayList<String> file) {

        int rows = file.size(); // ↓
        int cols = file.get(0).length(); //->

        policka = new Spot[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                policka[i][j] = new Spot(new Znak(file.get(i).charAt(j)), i, j, false);
            }
        }

        printMap(rows, cols);

        findStart(cols);
        findFinish(cols);

        Turista turista = new Turista(startlocation, finishlocation, 0);

        //set Start and Finish 
        policka[turista.getStartlocation().x][turista.getStartlocation().y].setZnak(new Znak('S'));
        policka[turista.getFinishlocation().x][turista.getFinishlocation().y].setZnak(new Znak('F'));

        printMap(rows, cols);
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
