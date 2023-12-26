package Day_23;

import java.util.ArrayList;

public class Map {

    Spot[][] policka; //políčka

    public Map(ArrayList<String> file) {
        
        int rows = file.size();
        int cols = file.get(0).length();
        
        policka = new Spot[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                
                policka[i][j] = new Spot(i, j, new Znak(file.get(i).charAt(j)));
                System.out.print(policka[i][j].getZnak().zn);
                
            }
            System.out.println("");
        }

    }

}
