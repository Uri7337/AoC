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
		boolean stopped = false;

		public Beam(int x, int y) {
			super(x, y);
		}

		long move(Map map, ArrayList<Beam> beams, long splitCounter) {
			if (this.y == map.sizey - 1) {
				this.stopped = true;
			} else {
				if (map.map[y + 1][x] == '^') {
					splitCounter++;

					this.split(map, beams);
				} else {
					this.y++;
					map.map[y][x] = '|';
				}
				 map.printMap();

				ep.p(splitCounter);
			}
			return splitCounter;
		}

		void split(Map map, ArrayList<Beam> beams) {
			this.stopped = true;
			Beam b1 = new Beam(x - 1, y + 1);
			Beam b2 = new Beam(x + 1, y + 1);
			map.map[y + 1][x - 1] = '|';
			map.map[y + 1][x + 1] = '|';
			beams.add(b1);
			beams.add(b2);
			this.dupeCheck(beams);
		}

		void dupeCheck(ArrayList<Beam> beams) {
			for (int i = 0; i < beams.size() - 1; i++) {
				Beam b1 = beams.get(i);
				for (int j = i + 1; j < beams.size(); j++) {
					Beam b2 = beams.get(j);
					if (b1.x == b2.x && b1.y == b2.y) {
						beams.remove(j);
					}
				}
			}
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

		void printMap() {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			// System.out.println("");
			for (int i = 0; i < sizey; i++) {
				for (int j = 0; j < sizex; j++) {

					ep.np(map[i][j]);

				}
				ep.p("");
			}

			try {
				// sleep
				//Thread.sleep(2);
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
		Beam b;

		while (!beams.isEmpty()) {

			for (int i = 0; i < beams.size(); i++) {
				b = beams.get(i);

				if (b.stopped) {
					beams.remove(i);
					continue;
				}

				grandTotal = b.move(m, beams, grandTotal);

			}

		}

		/* wrong!!! 23 != 21
			.......S.......
			.......|.......
			......|^|......
			......|.|......
			......^|^|.....
			.......|.|.....
			.....^.^.^.....
			...............
			....^.^...^....
			...............
			...^.^...^.^...
			...............
			..^...^.....^..
			...............
			.^.^.^.^.^...^.
			...............
			2
			.......S.......
			.......|.......
			......|^|......
			......|.|......
			.....|^|^|.....
			.......|.|.....
			.....^.^.^.....
			...............
			....^.^...^....
			...............
			...^.^...^.^...
			...............
			..^...^.....^..
			...............
			.^.^.^.^.^...^.
			...............
			3
		*/
		

		// 11787
		// 10669
		// 1859-1 = 1858 - too high
		return grandTotal;
	}

}
