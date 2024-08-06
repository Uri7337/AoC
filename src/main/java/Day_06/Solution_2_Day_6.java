package Day_06;
//

import java.util.ArrayList;


//

/*

Speed = distance/time = 3meters/3sec = 1m/s | d=s*t, t=d/v

*/

public class Solution_2_Day_6 {
    int solution = 1;
	ArrayList<Integer> s;
//
     public int getSolution() {
            
	   
	   int[] test_time = {7,15,30};
	   int[] test_distanceRecord = {9,40,200};
	   
	   long time = 40709879L;
	   long distanceRecord = 215105121471005L;
	   
	   long distance = 0L;
	   long timeleft = 0L;
	      
	  
		   s = new ArrayList<Integer>();
		   for (int j = 0; j < time; j++) {
		   timeleft = time - j;
		   distance = j*timeleft;
//		   System.out.println("timeleft "+timeleft);
//		   System.out.println("distance "+distance);
//		   System.out.println("time "+time[i]);
		   
			if(time<distance && distanceRecord<distance){
				s.add(j);
			}
		   }
		   solution = s.size();
		 
	   
	   
       return solution;
    }
}
