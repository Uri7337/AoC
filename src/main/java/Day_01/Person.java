package Day_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    int cardinalDirections = 0;
    ArrayList<Integer> mapLocation = new ArrayList<>(Arrays.asList(0, 0));

    // for Example: facing North is 0 
    public int facing(){

		return cardinalDirections;
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
}
