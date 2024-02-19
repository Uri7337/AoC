package Day_6;

public class Light2 {
    private int shining;
    private int x;
    private int y;

    public Light2(int state, int x, int y) {
        this.shining = state;
        this.x = x;
        this.y = y;
    }
    
    public void turnOn(){
        setShining(getShining()+1);
    }
    
    public void turnOff(){
        setShining(getShining()-1);
    }
    
    public void toggle(){
        setShining(getShining()+2);
    }
    
    public int getShining() {
        return shining;
    }

    public void setShining(int shining) {
        this.shining = shining;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
