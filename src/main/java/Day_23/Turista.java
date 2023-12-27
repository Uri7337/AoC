
package Day_23;

import java.awt.Point;

public class Turista {
    private Point currlocation;
    private Point startlocation;
    private Point finishlocation;
    private int steps;
    
    
    
    //Constructor
    public Turista(Point startlocation, Point finishlocation, int steps) {
        this.currlocation = startlocation;
        this.startlocation = startlocation;
        this.finishlocation = finishlocation;
        this.steps = steps;
    }
    
    //Getters, Setters
    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Point getCurrlocation() {
        return currlocation;
    }

    public void setCurrlocation(Point currlocation) {
        this.currlocation = currlocation;
    }

    public Point getStartlocation() {
        return startlocation;
    }

    public void setStartlocation(Point startlocation) {
        this.startlocation = startlocation;
    }

    public Point getFinishlocation() {
        return finishlocation;
    }

    public void setFinishlocation(Point finishlocation) {
        this.finishlocation = finishlocation;
    }
    
}
