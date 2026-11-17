package Day_07;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_2_Day_07 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long timelines;

	class Location {
		int x;
		int y;

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	class Splitter extends Location {
		Splitter left;
		Splitter right;
		boolean isLastSplitter = false;
		

		public Splitter(int x, int y) {
			super(x, y);
		}

		void printLoc() {
			ep.p(x + " " + y);
		}

		
		private Splitter findLowerSplitter(Map map, ArrayList<Splitter> splitters, int side){
			
			for (int mapY = this.y; mapY < map.sizey; mapY++) {
				if (map.map[mapY][side] == '^') {
					for(Splitter s : splitters){
						if(s.x==side && s.y == mapY){
							return s;
						}
					}
				}
			}

			return null;
		}

		void pair(Map map, ArrayList<Splitter> splitters) {
			this.left = findLowerSplitter(map, splitters, -1);
			this.right = findLowerSplitter(map, splitters, +1);
		}

		boolean isChildfree() {
			return left == null & right == null;
		}

		boolean isLeftEmpty(){
			return left == null;
		}

		boolean isRightEmpty(){
			return right == null;
		}

		

	}

	class Beam extends Location {
		int initx;
		int inity;
		boolean stopped = false;

		public Beam(int x, int y) {
			super(x, y);
			this.initx = x;
			this.inity = y;
		}

		long move(Map map, ArrayList<Beam> beams, long splitCounter) {
			if (!this.stopped) {
				if (this.y == map.sizey - 1) {
					this.stopped = true;
				} else {
					if (map.map[y + 1][x] == '^') {
						// go left or right, depends on path
					} else {
						this.y++;
					}

					

				}
			}

			
			return splitCounter;
		}

		

	}

	class Map {
		int sizex;
		int sizey;
		char[][] map;
		

		public Map(int sizex, int sizey, ArrayList<Splitter> splitters, ArrayList<Beam> beams) {
			this.sizex = sizex;
			this.sizey = sizey;
			this.map = new char[sizey][sizex];
			populateMap(splitters, beams);
		}

		void populateMap(ArrayList<Splitter> splitters, ArrayList<Beam> beams) {
			for (Splitter s : splitters) {
				map[s.y][s.x] = '^';
			}
			for (Beam b : beams) {
				map[b.y][b.x] = 'S';
			}
			for (int i = 0; i < sizey; i++) {
				for (int j = 0; j < sizex; j++) {
					if (map[i][j] == '\u0000') {
						map[i][j] = '.';
					}
				}
			}
		}

		
	}

	public Object getSolution(String filepath) {

		timelines = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<>();
		file = rf.getInput(filepath);

		ArrayList<Splitter> splitters = new ArrayList<>();
		ArrayList<Beam> beams = new ArrayList<>();

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			String[] linePieces = line.split("");
			for (int i = 0; i < linePieces.length; i++) {
				if (linePieces[i].equals("S")) {
					Beam b = new Beam(i, y);
					beams.add(b);
				} else if (linePieces[i].equals("^")) {
					Splitter s = new Splitter(i, y);
					splitters.add(s);
				}
			}

		}

		Map m = new Map(file.get(0).length(), file.size(), splitters, beams);

		for (Splitter s : splitters) {
			s.pair(m, splitters);
		}

		
		

		return timelines;
	}

}
