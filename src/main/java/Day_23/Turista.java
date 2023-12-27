
package Day_23;

import java.awt.Point;

/*
 ======Movement======
0. check field im standing on - if ('^' ; '>' ; 'v' ; '<') move, set footprint and count steps
    else
1. check directions in this order -> Left[-1][=] > Top[=][-1] > Right[+1][=] > Bottom[=][+1], + set boolean -> can i go there
2. if i see finish go to finish and print steps.
    else
3. for every True field - check what kind of field it is - can i go there?
4. check if there is a footprint - was i here before?
5.1. NO - move on that field            5.2. YES - check different direction
*/

public class Turista {
    private Point newlocation;
    private Point currlocation;
    private Point startlocation;
    private Point finishlocation;
    private int steps;
    
    //Movement
    
    public boolean checkField(Spot[][] policko){
        boolean downhill = false;
    
        return downhill;
    }
    public Point moveLeft(Spot[][] policko){
        this.newlocation.x = policko[i][j].getX().x;
        this.newlocation.y = policko[i][j].getY().y;
        
        return newlocation;
    }
    public Point moveTop(Spot[][] policko){
        this.newlocation.x = policko[i][j].getX().x;
        this.newlocation.y = policko[i][j].getY().y;
        
        return newlocation;
    }
    public Point moveRight(Spot[][] policko){
        this.newlocation.x = policko[i][j].getX().x;
        this.newlocation.y = policko[i][j].getY().y;
        
        return newlocation;
    }
    public Point moveBottom(Spot[][] policko){
        this.newlocation.x = policko[i][j].getX().x;
        this.newlocation.y = policko[i][j].getY().y;
        
        return newlocation;
    }
    
    
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
    
    public Point getNewlocation() {
        return newlocation;
    }

    public void setNewlocation(Point newlocation) {
        this.newlocation = newlocation;
    }
}
