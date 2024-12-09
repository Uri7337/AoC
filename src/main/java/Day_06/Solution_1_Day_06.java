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
		
		p.readMap(g.facing);
		ep.p("");
		solution = g.startGuarding(p);
		return solution;
	}


class Plan{
	// 0 = . 
	// 1 = X
	// 2 = G - Guard
	// 3 = # - obstructions
	int[][] map;

	public Plan(ArrayList<String> data, Guard g) {
		this.map = new int[data.size()][data.get(0).length()];

		for (int i = 0; i < data.size(); i++) {
			String[] dataLine = data.get(i).split("");
			for (int j = 0; j < data.get(i).length(); j++) {
				if(dataLine[j].equals(".")){
					this.map[i][j] = 0;
				}else if(dataLine[j].equals("#")){
					this.map[i][j] = 3;
				}else{
					g.setGuard(j, i, dataLine[j]);
					this.map[i][j] = 2;
				}
			}
		}
	}

	void readMap(int gface){
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j]==0){
					ep.np(".");
				}else if(map[i][j]==1){
					ep.np("X");
				}else if(map[i][j]==3){
					ep.np("#");
				}else{
					
					switch (gface) {
						case 0:
							ep.np("^");
							break;
						case 1:
							ep.np(">");
							break;
						case 2:
							ep.np("v");
							break;
						case 3:
							ep.np("<");
							break;
						default:
							ep.np("G");
							// G = we have problem
							break;
					}
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

	int startGuarding(Plan p){
		//while on grid - x > 0 || x < grid.size || y > 0 || y < grid.size
		while(this.pt.getX() > 0 || this.pt.getX() < p.map.length || this.pt.getY() > 0 || this.pt.getY() < p.map[0].length){
			//if obstructions
			if(look(p)){
				turn();
			}else{
				markX(p);
				step();
			}
			p.readMap(facing);
			ep.p("");
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

	boolean look(Plan p){
		//true means obstructions
		switch (this.facing) {
			case 0:
				//grid one up
				if(p.map[(int)this.pt.getX()][(int)this.pt.getY()+1] < 3){
					return false;
				}
				break;
			case 1:
				//grid one right
				if(p.map[(int)this.pt.getX()+1][(int)this.pt.getY()] < 3){
					return false;
				}
				break;
			case 2:
				//grid one down
				if(p.map[(int)this.pt.getX()][(int)this.pt.getY()-1] < 3){
					return false;
				}
				break;
			case 3:
				//grid one left
				if(p.map[(int)this.pt.getX()-1][(int)this.pt.getY()] < 3){
					return false;
				}
				break;
			default:
				ep.np("G");
				// G = we have problem
				break;
		}
		return true;
	}

	void turn(){
		//i%4
		this.facing++;
		this.facing = this.facing % 4;
	}

	void step(){
		switch (this.facing) {
			case 0:
				//grid one up
				this.pt.setLocation(this.pt.getX(), this.pt.getY()+1);
				break;
			case 1:
				//grid one right
				this.pt.setLocation(this.pt.getX()+1, this.pt.getY());
				break;
			case 2:
				//grid one down
				this.pt.setLocation(this.pt.getX(), this.pt.getY()-1);
				break;
			case 3:
				//grid one left
				this.pt.setLocation(this.pt.getX()-1, this.pt.getY());
				break;
			default:
				ep.np("G");
				// G = we have problem
				break;
		}
	}

	void markX(Plan p){
		if(p.map[(int)this.pt.getX()][(int)this.pt.getY()] == 0){
			p.map[(int)this.pt.getX()][(int)this.pt.getY()] = 1;
			this.steps++;
		}
	}
}
}