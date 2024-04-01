/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shared;

/**
 *
 * @author ourie
 */
public class MinMax {

// Java program to find the minimum and 
// maximum value of the Array 
	public int findMin(int[] numbers) {

		// Initialize min to the first element, max second.
		int min = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	public int findMax(int[] numbers) {

		// Initialize min to the first element, max second.
		int max = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
