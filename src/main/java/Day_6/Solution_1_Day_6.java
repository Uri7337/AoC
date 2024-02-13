package Day_6;

import Shared.ReadFile;
import java.util.ArrayList;

public class Solution_1_Day_6 {

    int solution = 0;
    int rows = 10;
    int columns = 10;
    Light[][] lightGrid = new Light[rows][columns];
 
    

    

    public int getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        String filepath = "./src/main/resources/Day_6_test_2015.txt";
        //String filepath = "./src/main/resources/Day_6_2015.txt";
        file = rf.getInput(filepath);
        
        populateGrid(rows,columns);
        //Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            
            
            
        }

        return solution;
    }

    public void populateGrid(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                lightGrid[i][j] = new Light(false,i,j);
            }
        }
        
    }
    
    public void accessGrid(boolean status, int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                lightGrid[i][j].toggle();
            }
     
        }
    }
	
	 public void accessGrid(int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                lightGrid[i][j].toggle();
            }
     
        }
    }
    
    public void printGrid(int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String symbol = lightGrid[i][j].isShining() ?"-":".";
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
