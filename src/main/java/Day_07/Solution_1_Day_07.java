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
		boolean stop;


		public Beam(int x, int y) {
			super(x, y);
		}

		void move(){

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
			ep.p(line);
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

		for (Splitter s : splitters) {
			s.printLoc();
		}

		boolean allBeamsStoped = false;
		while (true) { 
			if(allBeamsStoped){
				break;
			}

			for (int i =0; i<beams.size() ;i++) {
				
			}

		}

		return grandTotal;
	}

}
