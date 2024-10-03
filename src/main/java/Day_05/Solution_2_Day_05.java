package Day_05;

import shared.ReadFile;
import shared.EasyPrint;

import java.util.ArrayList;
import java.util.HashMap;


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

		seedList.forEach(s -> s.readRecord());
		ep.p("");
		categoryList.forEach(cl -> {cl.printCategory(); ep.p("");});
		 */

		// for every seed go through every category and if in range change number else dont
		seedList.forEach(s -> {
			categoryList.forEach(cl -> {
				for (Range r : cl.ranges) {

					//FITS
					//if seed range fits all on both sides


					//DOESN'T FIT
					//if seed range doesnt't fit on both sides

					//if seed range doesnt't fit on one side

					//if seed range doesnt't fit at all
					



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
		});

		ArrayList<Long> seedsLocations = new ArrayList<>();
		newseedList.forEach(s -> {
			seedsLocations.add(s.seedHistory.get("location")); 
		});
		long minimum = seedsLocations.get(0); 
        for (int i = 1; i < seedsLocations.size(); i++) { 
            if (minimum > seedsLocations.get(i)) 
                minimum = seedsLocations.get(i); 
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
		}

		void makeRecord(String state, long number){
			this.state = state;
			this.number = number;
			this.rangeStart = number;
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
		long destinationRange; //50
		long rangeLength; //2

		public Range(long sourceRangeStart, long destinationRange, long rangeLength) {
			this.sourceRangeStart = sourceRangeStart;
			this.destinationRange = destinationRange;
			this.rangeLength = rangeLength;
		}

		void printRange(){
			ep.p(destinationRange +" "+ sourceRangeStart +" "+rangeLength);
		}
	}

	// ----debug zone----
	
}
