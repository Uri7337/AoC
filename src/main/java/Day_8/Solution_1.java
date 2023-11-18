
package Day_8;

import java.io.IOException;
import java.util.ArrayList;

public class Solution_1 {
ArrayList<ArrayList<Integer>> column;
	public int getSolution() throws IOException {
		int s = 0;
		
		ReadFile rf = new ReadFile();
		
		column = rf.getBigAL(); 
		for (int i = 0; i < column.size(); i++) { 
			final ArrayList<Integer> row = column.get(i);
			final int rowsize = row.size();
            for (int j = 0; j < rowsize; j++) {
                System.out.print(row.get(j) + " ");
				if(isTreeVisible(column, i, j)){
					s++;
				}
            } 
            System.out.println(); 
        }
		
		return s;
	}
	
	public boolean isTreeVisible(ArrayList<ArrayList<Integer>> column, int i, int j){
		boolean visible = false;
		int currValue = column.get(i).get(j);
		
		if(i>0 && i<column.size() && j>0 && j<column.get(i).size()){
			visible=true;
		}else{
			for (int dir = 0; dir < 4; dir++) {
				//checkDirection(dir);
			}
			
		}
		 
		return visible;
	}
	
	public boolean giveMeTree(int x, int y){
		boolean visible = false;
		
		if(x>0 && x<column.size() && y>0 && y<column.get(x).size()){
			visible=true;
		}else{
			column.get(0).get(0);
		}
		 
		return visible;
	}
	
}
