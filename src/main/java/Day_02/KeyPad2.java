package Day_02;

import java.util.ArrayList;

public class KeyPad2 {
    // Keypad
    NumberButtons2[] nb = new NumberButtons2[13];

    // Code
    ArrayList<String> secretCode = new ArrayList<String>();

    public KeyPad2() {
        createKeypad2();
    }

    public void createKeypad2() {

        nb[0] = new NumberButtons2("1", "1", "1", "1", "3", false);
        nb[1] = new NumberButtons2("2", "2", "3", "1", "6", false);
        nb[2] = new NumberButtons2("3", "2", "4", "1", "7", false);
        nb[3] = new NumberButtons2("4", "3", "4", "4", "8", false);
        nb[4] = new NumberButtons2("5", "5", "6", "5", "5", true);
        nb[5] = new NumberButtons2("6", "5", "7", "2", "A", false);
        nb[6] = new NumberButtons2("7", "6", "8", "3", "B", false);
        nb[7] = new NumberButtons2("8", "7", "9", "4", "C", false);
        nb[8] = new NumberButtons2("9", "8", "9", "9", "9", false);
        nb[9] = new NumberButtons2("A", "A", "B", "6", "A", false);
        nb[10] = new NumberButtons2("B", "A", "C", "7", "D", false);
        nb[11] = new NumberButtons2("C", "B", "C", "8", "C", false);
        nb[12] = new NumberButtons2("D", "D", "D", "B", "D", false);
    }

    public void fingerMove(String letter, int linePosition, int lettersLength) {
        switch (letter) {
            case "L":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber()].Left);
                }
                setCurrentNumber(nb[getCurrentNumber()].Left);
                break;
            case "R":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber()].Right);
                }
                setCurrentNumber(nb[getCurrentNumber()].Right);
                break;
            case "U":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber()].Up);
                }
                setCurrentNumber(nb[getCurrentNumber()].Up);
                break;
            case "D":
                if (linePosition == (lettersLength - 1)) {
                    createSecretCode(nb[getCurrentNumber()].Down);
                }
                setCurrentNumber(nb[getCurrentNumber()].Down);
                break;

            default:
                break;
        }
    }

    public int getCurrentNumber() {
        for (int i = 0; i < nb.length; i++) {
            if (nb[i].currentNumber) {
                return i;
            }
        }
        return 0;
    }

    public void setCurrentNumber(String newNumber) {
        // -1 because array starts at 0 and getCurrentNumber returns button number
        int oldNumber = getCurrentNumber();

        nb[oldNumber].currentNumber = false;
        for (NumberButtons2 nb2 : nb) {
            if(nb2.buttonNumber.equals(newNumber)){
                nb2.currentNumber = true;
            }
        }
        
    }

    public void createSecretCode(String secretCodeNumber) {
            secretCode.add(secretCodeNumber);
    }

    public String writeSecretCode() {
        String code = "";
        for (int i = 0; i < secretCode.size(); i++) {
            code = code + secretCode.get(i);
        }
        return code;
    }

}

