/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Days_Test;

/**
 *
 * @author ourie
 */
public class TestSubstring {

	public static void main(String[] args) {

		String bob = "bobs";
		String a = "a";
		int ll = bob.length();
//		System.out.println(a);
		for (int i = 0; i < ll; i++) {
			if (bob.length() > 3) {
				System.out.println(bob.substring(i, i + 3));
			}

		}

	}
}