/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Days_Test;

/**
 *
 * @author ourie
 */
public class Day_11_test {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		boolean con1 = true;
		boolean con2 = false;
		boolean con3 = true;
		if(con1&&con2&&con3){
			System.out.println("BigTrue!");
		}else{
			System.out.println("BigFalse!");
		}
		String line = "bobo";
		String[] lineArray = line.split("");
		
		String inc = lineArray[lineArray.length-1];
		System.out.println(inc);
	}
}
