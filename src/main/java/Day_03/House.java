
package Day_03;

//House object from ChatGPT
import java.awt.Point;

public class House {
    private Point location;
    private int numberOfGifts;

    // Constructor
    public House(Point location, int numberOfGifts) {
        this.location = location;
        this.numberOfGifts = numberOfGifts;
    }

    // Method to add a gift
    public void addGift() {
        numberOfGifts++;
    }

    // Method to check if given coordinates match the house's location
    public boolean checkHouse(Point coordinates) {
        return location.equals(coordinates);
    }

    // Getter for location
    public Point getLocation() {
        return location;
    }

    // Getter for numberOfGifts
    public int getNumberOfGifts() {
        return numberOfGifts;
    }

}
