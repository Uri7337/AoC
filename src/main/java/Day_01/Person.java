package Day_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Point;

public class Person {
    // facing North
    int cardinalDirections = 0;
    // index 0 = X ; index 1 = Y
    ArrayList<Integer> mapLocation = new ArrayList<>(Arrays.asList(0, 0));
    // Solution_2 - map of visited positions/places
    ArrayList<Point> visitedPlaces = new ArrayList<>();

    // for Example: facing North is 0
    public int facing() {

        return cardinalDirections;
    }

    // Solution_1
    public void move(String coordinate) {
        // turn
        turn(coordinate.substring(0, 1));
        // move
        walk(Integer.parseInt((coordinate.substring(1))));
    }

    // Solution_2
    public void move2(String coordinate) {
        // turn
        turn(coordinate.substring(0, 1));
        // move & make "I was here" signature
        walk2(Integer.parseInt((coordinate.substring(1))));

    }

    public void turn(String side) {
        switch (side) {
            case "L":
                cardinalDirections += 4;
                cardinalDirections--;
                cardinalDirections %= 4;
                break;
            case "R":
                cardinalDirections++;
                cardinalDirections %= 4;
                break;

            default:
                break;
        }
    }

    public void walk(int steps) {
        switch (facing()) {
            case 0:
                mapLocation.set(1, (mapLocation.get(1) + steps));
                break;

            case 1:
                mapLocation.set(0, (mapLocation.get(0) + steps));
                break;

            case 2:
                mapLocation.set(1, (mapLocation.get(1) - steps));
                break;

            case 3:
                mapLocation.set(0, (mapLocation.get(0) - steps));
                break;

            default:
                break;
        }

    }

    public void walk2(int steps) {

        int[] oldPositonXY = { mapLocation.get(0), mapLocation.get(1) };
        switch (facing()) {
            case 0:
                mapLocation.set(1, (mapLocation.get(1) + steps));
                break;

            case 1:
                mapLocation.set(0, (mapLocation.get(0) + steps));
                break;

            case 2:
                mapLocation.set(1, (mapLocation.get(1) - steps));
                break;

            case 3:
                mapLocation.set(0, (mapLocation.get(0) - steps));
                break;

            default:
                break;
        }

        int[] newPositonXY = { mapLocation.get(0), mapLocation.get(1) };
        if (oldPositonXY[0] < newPositonXY[0]) {
            /* from old position to new add one by one */
            for (int x = oldPositonXY[0]; x <= newPositonXY[0]; x++) {
                /* System.out.println("visitedPlaces"); */
                for (int y = oldPositonXY[1]; y <= newPositonXY[1]; y++) {
                    visitedPlaces.add(new Point(x, y));
                }
            }
        }else if (oldPositonXY[0] > newPositonXY[0]) {
            /* from old position to new add one by one */
            for (int x = oldPositonXY[0]; x >= newPositonXY[0]; x--) {
                /* System.out.println("visitedPlaces"); */
                for (int y = oldPositonXY[1]; y <= newPositonXY[1]; y++) {
                    visitedPlaces.add(new Point(x, y));
                }
            }
        }else if (oldPositonXY[1] < newPositonXY[1]) {
            /* from old position to new add one by one */
            for (int x = oldPositonXY[0]; x <= newPositonXY[0]; x++) {
                /* System.out.println("visitedPlaces"); */
                for (int y = oldPositonXY[1]; y <= newPositonXY[1]; y++) {
                    visitedPlaces.add(new Point(x, y));
                }
            }
        }else{
            /* from old position to new add one by one */
            for (int x = oldPositonXY[0]; x <= newPositonXY[0]; x++) {
                /* System.out.println("visitedPlaces"); */
                for (int y = oldPositonXY[1]; y >= newPositonXY[1]; y--) {
                    visitedPlaces.add(new Point(x, y));
                }
            }
        }

    }

    public boolean wasIHereBefore() {
        for (int i = 0; i < visitedPlaces.size(); i++) {
            for (int j = i + 1; j < visitedPlaces.size(); j++) {
                System.out.println("Compare Point1[x=" + visitedPlaces.get(i).x + "," + visitedPlaces.get(i).y
                        + "] to Point2[x=" + visitedPlaces.get(j).x + ",y=" + visitedPlaces.get(j).y + "]");
                if (visitedPlaces.get(i).x == visitedPlaces.get(j).x
                        && visitedPlaces.get(i).y == visitedPlaces.get(j).y) {
                    System.out.println("Found same Point1[x:" + visitedPlaces.get(i).x + "," + visitedPlaces.get(i).y
                            + "] to Point2[x:" + visitedPlaces.get(j).x + "," + visitedPlaces.get(j).y + "]");
                    return true;
                }
            }
            System.out.println("");
        }

        return false;
    }

}
