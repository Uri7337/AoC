package Day_02;

import java.util.ArrayList;

public class Keypad {
    // Keypad
    NumberButtons[] nb = new NumberButtons[9];

    // Code
    ArrayList<Integer> secretCode = new ArrayList<Integer>();

    public Keypad() {
        createKeypad();
    }

    public void createKeypad() {

        nb[0] = new NumberButtons(1, 1, 2, 1, 4, false);
        nb[1] = new NumberButtons(2, 1, 3, 2, 5, false);
        nb[2] = new NumberButtons(3, 2, 3, 3, 6, false);
        nb[3] = new NumberButtons(4, 4, 5, 1, 7, false);
        nb[4] = new NumberButtons(5, 4, 6, 2, 8, true);
        nb[5] = new NumberButtons(6, 5, 6, 3, 9, false);
        nb[6] = new NumberButtons(7, 7, 8, 4, 7, false);
        nb[7] = new NumberButtons(8, 7, 9, 5, 8, false);
        nb[8] = new NumberButtons(9, 8, 9, 6, 9, false);
    }

    public void fingerMove(String letter, int linePosition, int lettersLength) {
        switch (letter) {
            case "L":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber() - 1].Left);
                }
                setCurrentNumber(nb[getCurrentNumber() - 1].Left);
                break;
            case "R":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber() - 1].Right);
                }
                setCurrentNumber(nb[getCurrentNumber() - 1].Right);
                break;
            case "U":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber() - 1].Up);
                }
                setCurrentNumber(nb[getCurrentNumber() - 1].Up);
                break;
            case "D":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber() - 1].Down);
                }
                setCurrentNumber(nb[getCurrentNumber() - 1].Down);
                break;

            default:
                break;
        }
    }

    public int getCurrentNumber() {
        for (int i = 0; i < nb.length; i++) {
            if (nb[i].currentNumber) {
                return nb[i].buttonNumber;
            }
        }
        return 0;
    }

    public void setCurrentNumber(int newNumber) {
        // -1 because array starts at 0 and getCurrentNumber returns button number
        int oldNumber = getCurrentNumber() - 1;

        nb[oldNumber].currentNumber = false;
        nb[newNumber - 1].currentNumber = true;
    }

    public void createSecretCode(int secretCodeNumber) {
            secretCode.add(secretCodeNumber);
    }

    public String writeSecretCode() {
        String code = "";
        for (int i = 0; i < secretCode.size(); i++) {
            code = code + Integer.toString(secretCode.get(i));
        }
        return code;
    }

}
