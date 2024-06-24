package Day_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    //facing North 
    int cardinalDirections = 0;
    //index 0 = X ; index 1 = Y
    ArrayList<Integer> mapLocation = new ArrayList<>(Arrays.asList(0, 0));

    // for Example: facing North is 0 
    public int facing(){

		return cardinalDirections;
	} 

    public void move(String coordinate){
        //turn 
        turn(coordinate.substring(0,1));
        //move
        walk(Integer.parseInt((coordinate.substring(1))));
    }

    public void turn(String side){
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

    public void walk(int steps){
        switch (facing()) {
            case 0:
                mapLocation.set(1, (mapLocation.get(1)+steps));  
                break;

            case 1:
                mapLocation.set(0, (mapLocation.get(0)+steps));  
                break;

            case 2:
                mapLocation.set(1, (mapLocation.get(1)-steps));
                break;

            case 3:
                mapLocation.set(0, (mapLocation.get(0)-steps)); 
                break;

            default:
                break;
        }
        
    }
    
}
