package Shared;

public class AlphabetContainer {
   public char[] alphabet = new char[26];

    public AlphabetContainer(String bigOrSmall){
        switch (bigOrSmall) {
            case "Big":
                createAlphabetContainer('A');
                break;
            case "Small":
            createAlphabetContainer('a');
                break;
            default:
                break;
        }
        
    }

   public void createAlphabetContainer(char size){
        for (int i = 0; i < 26; i++) {
            this.alphabet[i] = (char) (size + i);
        }
    }

    // Print the alphabet
   public void printAlphabetContainer(){
        for (char letter : this.alphabet) {
            System.out.print(letter + " ");
        }
        System.out.println("");
    }

    public int findChar(char ch){
        //returns index of char or -1 if not found
        for (int i = 0; i < alphabet.length; i++) {
            if(ch == alphabet[i]){
                return i;
            }
        }
        return -1;
    }
        
}
