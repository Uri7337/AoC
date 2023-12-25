package Day_23;

import java.util.ArrayList;

public class Map {

    Spot[][] policka; //políčka

    public Map(ArrayList<String> file) {
        

        for (int i = 0; i < file.size(); i++) {
            for (int j = 0; j < file.get(0).length(); j++) {
                System.out.println(file.get(i).charAt(j));
                
                policka[i][j] = new Spot(i, j, new Znak(file.get(i).charAt(j)));

                
            }
        }

    }

}
