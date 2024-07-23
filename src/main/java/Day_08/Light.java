package Day_08;

import java.awt.Point;

public class Light {
    private boolean on;
    private Point p;

    // Constructor to initialize the Light object
    public Light(boolean on, int x, int y) {
        this.on = on;
        this.p = new Point(x, y);
    }

    // Method to create a lit rectangle
    public void litRect(int A, int B) {
        // Implementation for litRect
        // Logic to set the rectangle of lights with width A and height B to "on"
    }

    // Method to rotate a specific row by a certain amount
    public void rotateRow(int row, int by) {
        // Implementation for rotateRow
        // Logic to rotate the specified row by "by" amount
    }

    // Method to rotate a specific column by a certain amount
    public void rotateColumn(int column, int by) {
        // Implementation for rotateColumn
        // Logic to rotate the specified column by "by" amount
    }

    // Getter and Setter for 'on'
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for 'p'
    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
}
