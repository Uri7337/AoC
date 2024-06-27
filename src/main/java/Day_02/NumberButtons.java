package Day_02;

public class NumberButtons {
    //Number itself
    int buttonNumber;
    //Adjacent buttons
    int Left;
    int Right;
    int Up;
    int Down;
    boolean currentNumber;

    public NumberButtons(int buttonNumber, int left, int right, int up, int down, boolean currentNumber) {
        this.buttonNumber = buttonNumber;
        Left = left;
        Right = right;
        Up = up;
        Down = down;
        this.currentNumber = currentNumber;
    }

    public void printNumberButton() {
        System.out.println("Bn: "+buttonNumber);
        System.out.println("L: "+Left);
        System.out.println("R: "+Right);
        System.out.println("U: "+Up);
        System.out.println("D: "+Down);
        System.out.println("CurrentNumber?: "+currentNumber);
    }
    
}
