package Day_06;

import shared.EasyPrint;
import shared.ReadFile;

//import java.security.Guard; - lol java has Guards xD
import java.util.ArrayList;
import java.awt.Point;

public class Solution_1_Day_06 {

	int solution = 0;
	EasyPrint ep = new EasyPrint();

	public Object getSolution(String filepath) {
		solution = 0;
		ReadFile rf = new ReadFile();
		ArrayList<String> data = new ArrayList<String>();

		data = rf.getInput(filepath);
		Guard g = new Guard();
		Plan p = new Plan(data,g);
		
		p.readMap();

		return solution;
	}


class Plan{
	// 0 = . || guard
	// 1 = obstructions
	int[][] map;

	public Plan(ArrayList<String> data, Guard g) {
		this.map = new int[data.size()][data.get(0).length()];

		for (int i = 0; i < data.size(); i++) {
			String[] dataLine = data.get(i).split("");
			for (int j = 0; j < data.get(i).length(); j++) {
				if(dataLine[j].equals(".")){
					this.map[i][j] = 0;
				}else if(dataLine[j].equals("#")){
					this.map[i][j] = 1;
				}else{
					g.setGuard(j, i, dataLine[j]);
					this.map[i][j] = 2;
				}
			}
		}
	}

	void readMap(){
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j]==0){
					ep.np(".");
				}else if(map[i][j]==1){
					ep.np("#");
				}else{
					ep.np("G");
				}
			}
			ep.p("");
		}
	}

}

class Guard{
	Point pt;
	int steps;
	int facing; // up-0, right-1, down-2, left-3 

	public Guard(){
		
	}

	int startGuarding(){
		this.steps = 0;
		while(true){

		}
		return this.steps;
	}

	void setGuard(int x, int y, String fac){
		this.pt = new Point(x,y);
		this.steps=0;
		switch (fac) {
			case "^":
				this.facing=0;
				break;
			case ">":
				this.facing=1;
				break;
			case "v":
				this.facing=2;
				break;
			case "<":
				this.facing=3;
				break;
			default:
				this.facing=-1; // -1 = we have problem
				break;
		}
	}

	void turn(){
		//i%4
	}

	void step(){
		//
	}

	void look(){

	}
	
}
}