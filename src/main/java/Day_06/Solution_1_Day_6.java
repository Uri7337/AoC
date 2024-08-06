package Day_06;
//

import java.util.ArrayList;


//

/*

Speed = distance/time = 3meters/3sec = 1m/s | d=s*t, t=d/v

*/

public class Solution_1_Day_6 {
    int solution = 1;
	ArrayList<Integer> s;
//
     public int getSolution() {
            
	   
	   int[] test_time = {7,15,30};
	   int[] test_distanceRecord = {9,40,200};
	   
	   int[] time = {40,70,98,79};
	   int[] distanceRecord = {215, 1051, 2147, 1005};
	   
	   int distance = 0;
	   int timeleft = 0;
	      
	   for (int i = 0; i < time.length; i++) {
		   s = new ArrayList<Integer>();
		   for (int j = 0; j < time[i]; j++) {
		   timeleft = time[i] - j;
		   distance = j*timeleft;
//		   System.out.println("timeleft "+timeleft);
//		   System.out.println("distance "+distance);
//		   System.out.println("time "+time[i]);
		   
			if(time[i]<distance && distanceRecord[i]<distance){
				s.add(j);
			}
		   }
		   solution *= s.size();
		 }
	   
	   
       return solution;
    }
}
