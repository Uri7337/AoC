package Day_01;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_01 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> rotations;


	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		rotations = new ArrayList<String>();
		rotations = rf.getInput(filepath);

		int dial = 50;
		int password = 0;
        boolean click = false;
		//ep.p("The dial starts by pointing at " + dial);
		//rotations preparation
		for (int y = 0; y < rotations.size(); y++) {
			String line = rotations.get(y);
			//ep.p(line);
			char direction = line.charAt(0);
			int rotation = Integer.parseInt(line.substring(1, line.length()));
            click = false;

			if(direction == 'R'){
				dial += rotation;
				while(100<=dial){
					//ep.np("before: "+direction+""+dial);
					dial-=100;
                    password++;
                    click = true;
					//ep.p(" after: "+direction+""+dial);
				}
			}else{
				dial -= rotation;
				while(0>dial){
					//ep.np("before: "+direction+""+dial);
					dial+=100;
                    password++;
                    click = true;
					//ep.p(" after: "+direction+""+dial);
				}
			}
			
			if(dial==0 && !click){
				//password++;
			}
			
			//ep.p("The dial is rotated "+direction+""+rotation+" to point at "+dial+".");

        }


        return password;
    }
	
}
