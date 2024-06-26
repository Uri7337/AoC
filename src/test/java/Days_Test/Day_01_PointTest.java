package Days_Test;

import java.util.ArrayList;
import java.awt.Point;

public class Day_01_PointTest {
    public static void main(String args[]) {
        System.out.println("point test");
        ArrayList<Point> visitedPlaces = new ArrayList<>();
        boolean bob = false;
        visitedPlaces.add(new Point(2, 3));
        visitedPlaces.add(new Point(4, 4));
        visitedPlaces.add(new Point(4, 4));
        visitedPlaces.add(new Point(2, 3));

        for (Point point : visitedPlaces) {
            System.out.println(point);
        }
        for (int i = 0; i < visitedPlaces.size(); i++) {
            for (int j = i+1; j < visitedPlaces.size(); j++) {
                System.out.println("Compare Point1[x="+visitedPlaces.get(i).x+","+visitedPlaces.get(i).y+"] to Point2[x="+visitedPlaces.get(j).x+",y="+visitedPlaces.get(j).y+"]");
                if(visitedPlaces.get(i).x == visitedPlaces.get(j).x && visitedPlaces.get(i).y == visitedPlaces.get(j).y){
                    System.out.println("Found same Point1[x:"+visitedPlaces.get(i).x+","+visitedPlaces.get(i).y+"] to Point2[x:"+visitedPlaces.get(j).x+","+visitedPlaces.get(j).y+"]");
                    bob = true;
                }
            }
            System.out.println("");
        }

       System.out.println(bob); 
    }
}
