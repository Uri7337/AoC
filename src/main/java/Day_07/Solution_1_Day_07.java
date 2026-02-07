package Day_07;

import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_07 {
	EasyPrint ep = new EasyPrint();

	ArrayList<String> file;

	long grandTotal;

	class Location {
		int x;
		int y;

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	class Splitter extends Location {

		public Splitter(int x, int y) {
			super(x, y);
		}

		void printLoc() {
			ep.p(x + " " + y);
		}

	}

	class Beam extends Location {
		boolean stopped;

		public Beam(int x, int y) {
			super(x, y);
		}

		void move() {

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

		void printMap(int snow) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			// System.out.println("");
			for (int i = 0; i < sizey; i++) {
				for (int j = 0; j < sizex; j++) {
					if (j == 0 && i == snow) {
						ep.np('*');
					} else {
						if ((j == sizex-1 && i == snow+1)) {
							ep.np('*');
						} else {
							ep.np(map[i][j]);
						}

					}

				}
				ep.p("");
			}

			try {
				// to sleep 10 seconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// recommended because catching InterruptedException clears interrupt flag
				Thread.currentThread().interrupt();
				// you probably want to quit if the thread is interrupted

			}

		}
	}

	public Object getSolution(String filepath) {

		grandTotal = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		ArrayList<Splitter> splitters = new ArrayList<>();
		ArrayList<Beam> beams = new ArrayList<>();

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			// ep.p(line);
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

		for (int g = 0; g < file.size(); g++) {
			m.printMap(g);
		}

		for (Splitter s : splitters) {
			// s.printLoc();
		}

		int beamsStopped = 0;
		Beam b;
		/*
		 * while (true) {
		 * if(beamsStopped == beams.size()){
		 * break;
		 * }
		 * 
		 * beamsStopped = 0;
		 * for (int i = 0; i<beams.size() ;i++) {
		 * b = beams.get(i);
		 * if(b.stopped){
		 * beamsStopped++;
		 * continue;
		 * }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

		return grandTotal;
	}

}
