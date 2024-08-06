/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shared;

import java.util.ArrayList;

/**
 *
 * @author ourie
 */
public class MinMax {

// Java program to find the minimum and 
// maximum value of the Array 
	public static int findMinArr(int[] numbers) {

		// Initialize min to the first element, max second.
		int min = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	public static int findMaxArr(int[] numbers) {

		// Initialize min to the first element, max second.
		int max = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static int findMinArrList(ArrayList<Integer> numbers) {

		// Initialize min to the first element, max second.
		int min = numbers.get(0); 
        for (int i = 1; i < numbers.size(); i++) { 
            if (min > numbers.get(i)) 
                min = numbers.get(i); 
        } 
		return min;
	}
	
	public static int findMaxArrList(ArrayList<Integer> numbers) {

		// Initialize min to the first element, max second.
		int max = numbers.get(0); 

		for (int i = 1; i < numbers.size(); i++) { 
            if (max < numbers.get(i)) 
                max = numbers.get(i); 
        }
		return max;
	}
}
