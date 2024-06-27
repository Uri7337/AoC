package Day_02;

public class NumberButtons2 {
    //Number itself
    String buttonNumber;
    //Adjacent buttons
    String Left;
    String Right;
    String Up;
    String Down;
    boolean currentNumber;

    

    public NumberButtons2(String buttonNumber, String left, String right, String up, String down, boolean currentNumber) {
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

