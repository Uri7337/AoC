package Day_05;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;


public class Solution_2_Day_05 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";
	
	ArrayList<String> file;
	public Object getSolution(String filepath) {
		
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);
			
		ArrayList<Seed> seedList = new ArrayList<Seed>();
		ArrayList<Category> categoryList = new ArrayList<Category>();
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);

			if (line.contains("seeds:")){
				//seeds
				
				String[] seeds = line.split(" ");
				boolean first = true;
				for (int j = 1; j < seeds.length; j++) {
					if (first){
						Seed s = new Seed("seed", Long.parseLong(seeds[j]));
						seedList.add(s);
						first=false;
					}else{
						seedList.get(seedList.size()-1).rangeSize = Long.parseLong(seeds[j]);
						seedList.get(seedList.size()-1).makeRange();
						first=true;
					}
				}
			}else{
				if (line.contains("-to-")) {
					//seed-to-soil map:
					String from = line.split("-to-")[0];
					String to = line.split("-to-")[1].split(" ")[0];
					/* ep.p(from +"->" + to); */

					Category c = new Category(from, to);
					categoryList.add(c);


				} else if (line.matches("[\\d]* [\\d*]* [\\d]*")){
					//numbers 
					//add then to the last category in the list (their category will always be the last one in the list)
					
					long n1 = Long.parseLong(line.split(" ")[0]);
					long n2 = Long.parseLong(line.split(" ")[1]);
					long n3 = Long.parseLong(line.split(" ")[2]);
					/* ep.p(n1 +"-"+ n2 +"-"+ n3); */
					Range r = new Range(n2, n1, n3);
					categoryList.get(categoryList.size()-1).ranges.add(r);
				}
			}

        }
		
		/* 
		now for test print
		seedList
		categoryList 
		ranges in category
		*/
		
		/* seedList.forEach(s -> s.readRecord());
		ep.p("");
		categoryList.forEach(cl -> {cl.printCategory(); ep.p("");}); */
		

		// for every seed go through every category and if in range change number else dont

		/*
		Seed s;
		long x;
		Seed sA;
		Seed sB;
		Seed sC;
		*/
		TempData td = new TempData();
		//can 't remove or add in forEach - rewrite to iterator or for loop?
		for (int i = 0; i < seedList.size(); i++) {
			td.i = i;
			td.s = seedList.get(td.i);	
			categoryList.forEach(cl -> {
				for (Range r : cl.ranges) {

						// mimo range vlevo
						//   70-?      
						//   	  90 - 100
						// menší vlevo
						if(td.s.rangeStart < r.sourceRangeStart){
							// menší i vpravo
							if(td.s.rangeEnd < r.sourceRangeStart){
								//   79 - 92
								//            98 - 99
								// nechat stejné, změnit status
								td.s.changeState(cl.name);
								break;
							}
							//vpravo uprostřed
							if(td.s.rangeEnd >= r.sourceRangeStart && td.s.rangeEnd <= r.sourceRangeEnd){
								//   79 -       99
								//           98 - 100
								//rozlomit na 2 seedy 
								// 79-97; 98-99
								//			^-zvětšit
								td.x = r.destinationRange-r.sourceRangeStart; 
								td.sA = new Seed(cl.name, td.s.rangeStart, r.sourceRangeStart-1);
								td.sB = new Seed(cl.name, (r.sourceRangeStart + td.x) , (td.s.rangeEnd+td.x));
								seedList.remove(td.i);
								seedList.add(0,td.sA);
								seedList.add(0,td.sB);
								break;
							}
							// vpravo větší
							if(td.s.rangeEnd > r.sourceRangeEnd){
								//   79 -                110
								//           98 - 100
								//rozlomit na 3 seedy 
								// 79-97; 98-100; 101 - 110
								// 			^-zvětšit
								td.x = r.destinationRange-r.sourceRangeStart;
								td.sA = new Seed(cl.name, td.s.rangeStart, r.sourceRangeStart-1);
								td.sB = new Seed(cl.name, (r.sourceRangeStart + td.x), (r.sourceRangeEnd + td.x));
								td.sC = new Seed(cl.name, r.sourceRangeEnd+1 , td.s.rangeEnd);
								seedList.remove(td.i);
								seedList.add(0,td.sA);
								seedList.add(0,td.sB);
								seedList.add(0,td.sC);
								break;
							}

						}
						// mimo range vpravo
						//          90 - 100
						//   70-80
						if(td.s.rangeStart > r.sourceRangeStart && td.s.rangeStart > r.sourceRangeEnd){
							td.s.changeState(cl.name);
							break;
						}

						// Levá strana v hranicích range
						// 70-   100
						//    80-   100
						// 70-80
						if(td.s.rangeStart >= r.sourceRangeStart && td.s.rangeStart <=r.sourceRangeEnd){
							// test second side
							if(td.s.rangeEnd <= r.sourceRangeEnd){
								//     90 - 100
								//   80   - 100
								// 1 seed zvětšit
								td.x = r.destinationRange-r.sourceRangeStart;
								td.s.changeRange(td.x);
								td.s.changeState(cl.name);
								break;
							}

							if(td.s.rangeEnd > r.sourceRangeEnd){
								//     90 -    110
								//   80   - 100
								//rozlomit na 2 seedy
								// 90-100; 101-110
								//	 ^-zvětšit
								td.x = r.destinationRange-r.sourceRangeStart; 
								td.sA = new Seed(cl.name, (td.s.rangeStart+td.x), (r.sourceRangeEnd+td.x));
								td.sB = new Seed(cl.name, r.sourceRangeEnd + 1, td.s.rangeEnd);
								seedList.remove(td.i);
								seedList.add(0,td.sA);
								seedList.add(0,td.sB);
								break;

							}

						

						}
						

						
					
					}
					
					
				


				//GREEN - if seed range fits all on both sides
				//if seed range doesnt't fit on both sides
			//oldcode
					/* if(s.number>= r.sourceRangeStart && ((r.rangeLength-1)+r.sourceRangeStart) >=s.number){
						//destination is bigger or smaller than source range start
						long x;
						x = r.destinationRange-r.sourceRangeStart;
						s.number += x; 
						break;
					}
				}
				s.makeRecord(cl.name,s.number); */
			// end of old code
			});
		}

		ArrayList<Long> seedRangeMin = new ArrayList<>();
		seedList.forEach(currSeed -> {
			seedRangeMin.add(currSeed.rangeStart); 
		});
		long minimum = seedRangeMin.get(0); 
        for (int i = 1; i < seedRangeMin.size(); i++) { 
            if (minimum > seedRangeMin.get(i)) 
                minimum = seedRangeMin.get(i); 
        }

		return solution = minimum;
	}

	class Seed {
		//changing state based on where the seed is currently located e.g. if seed -> soil state:soil 
		String state;
		long number;

		long rangeStart;
		long rangeEnd;
		long rangeSize;


		public Seed(String state, long number) {
			this.state = state;
			this.number = number;
			this.rangeStart = number;
		}

		public Seed(String state, long rangeStart, long rangeEnd) {
			this.state = state;
			this.rangeStart = rangeStart;
			this.rangeEnd = rangeEnd;
		}

		void makeRecord(String state, long number){
			this.state = state;
			this.number = number;
			this.rangeStart = number;
		}

		void changeState(String state){
			this.state = state;
		}

		void makeRange(){
			this.rangeEnd = (this.rangeStart + rangeSize) - 1;
		}

		void changeRange(long destVal){
			this.rangeStart += destVal;
			this.rangeEnd += destVal; 
		}

		void readRecord(){
			ep.p("state: " + state + "; number: " + number + "; range: <"+ rangeStart + "-" +rangeEnd+"> " + rangeSize);
		}

	} 

	class Category {
		String from;
		String name;
		ArrayList<Range> ranges;

		public Category(String from, String name) {
			this.from = from;
			this.name = name;
			this.ranges = new ArrayList<Range>();
		}

		void printCategory(){
				ep.p(from+"-to-"+name +" map:"); 
				readRanges();
		}

		void readRanges(){
			for (Range r : ranges) {
				r.printRange();
			  }
		}
	}

	class Range {
		long sourceRangeStart; //98
		long sourceRangeEnd; // (98+2) - 1
		long destinationRange; //50
		long rangeLength; //2

		public Range(long sourceRangeStart, long destinationRange, long rangeLength) {
			this.sourceRangeStart = sourceRangeStart;
			this.destinationRange = destinationRange;
			this.rangeLength = rangeLength;
			this.sourceRangeEnd = (sourceRangeStart + rangeLength) - 1;
		}

		void printRange(){
			ep.p(destinationRange +" "+ sourceRangeStart +" "+rangeLength);
		}
	}

	class TempData{
		int i;
		Seed s;
		long x;
		Seed sA;
		Seed sB;
		Seed sC;
	}
	// ----debug zone----
	
}
