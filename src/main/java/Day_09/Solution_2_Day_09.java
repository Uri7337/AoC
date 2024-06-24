/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Day_09;

import Shared.ReadFile;
import Shared.MinMax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ourie
 */

/*
For example, given the following distances:
London to Dublin = 464
London to Belfast = 518
Dublin to Belfast = 141

The possible routes are:
Dublin -> London -> Belfast = 982
London -> Dublin -> Belfast = 605
London -> Belfast -> Dublin = 659
Dublin -> Belfast -> London = 659
Belfast -> Dublin -> London = 605
Belfast -> London -> Dublin = 982 

The shortest of these is London -> Dublin -> Belfast = 605.
 */
public class Solution_2_Day_09 {

	int solution = 0;
	HashSet<String> cities = new HashSet<String>();
	ArrayList<Road> roads = new ArrayList<Road>();
	ArrayList<Integer> res = new ArrayList<Integer>();
	
	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
//		String filepath = "./src/main/resources/Day_09_test_2016.txt";
		String filepath = "./src/main/resources/Day_09_2016.txt";
		file = rf.getInput(filepath);
		
		
		
		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String[] line_parts = file.get(i).split(" ");

			buildCities(line_parts);
		}
		
		String uniqCities[] = new String[cities.size()]; 
		cities.toArray(uniqCities);
		
		
		calcRoadDistances(uniqCities, 0);
		
//		System.out.println(res);
		
		solution = MinMax.findMaxArrList(res);
		
		return solution;
	}
	
	
	public void buildCities(String[] line_parts){
		cities.add(line_parts[0]);
		cities.add(line_parts[2]);
		
		Road r = new Road(line_parts[0],line_parts[2],Integer.parseInt(line_parts[4]));
		roads.add(r);
	}
	
	
	public int getRoadDistance(String[] groupedCities){
		int dist = 0;
		
		for (int i = 0; i < groupedCities.length -1; i++) {
//			System.out.println(groupedCities[i]); 
//			System.out.println(groupedCities[i+1]+1); 
			dist = dist + getCitiesDistances(groupedCities[i],groupedCities[i+1]);
		}
//			System.out.println("");
			return dist;
		
	}
	
	public void calcRoadDistances(String[] array, int pos){
		
		
		if(pos >= array.length - 1){   
//            System.out.print("[");  
            for(int i = 0; i < array.length - 1; i++){  
//                System.out.print(array[i] + ", ");
            }  
            if(array.length > 0)   
//                System.out.print(array[array.length - 1]);  
//            System.out.println("]");
			res.add(getRoadDistance(array)); 
             
        }  
  
        for(int i = pos; i < array.length; i++){   
          
            String t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
  
            calcRoadDistances(array, pos+1);  
  
            t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
        }  
		
		
	}
	
	
	public int getCitiesDistances(String fromCity, String toCity){
		int dist = 0;
		for (Road r : roads) {
			
			if(r.getCityFrom().equals(fromCity) && r.getCityTo().equals(toCity)){
				dist = r.getDistance();
				break;
			}else if(r.getCityFrom().equals(toCity) && r.getCityTo().equals(fromCity)){
				dist = r.getDistance();
				break;
			}
			
		}
		return dist;
	}
	
	
	
}
