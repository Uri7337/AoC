/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day_10;

/**
 *
 * @author ourie
 */
public class Threads extends Thread {
	String line;
	String tName;
	int repeat;
	

	public Threads(String line, int repeat,String tName) {
		this.line = line;
		this.repeat = repeat;
		this.tName = tName;
	}
	
	@Override
	public void run(){
		do {
			String[] lineArray = this.line.split("");

			this.line = lineMaker(lineArray);

//			debugging
//			System.out.println(repeat + ": " + line + "| " + line.length());
//			System.out.println(tName+": "+repeat);
//			debugging

			repeat--;
		} while (repeat > 0);
	}
	
	

	public String lineMaker(String[] lineArr) {
		int index = 0;
		int counter = 1;
		int lineSize = lineArr.length;

//		String finalLine = "I'm not fulfilled :( ";
//		String line = "";
		StringBuilder finalLine = new StringBuilder();
		StringBuilder line = new StringBuilder();

		while (index < (lineSize - 1)) {
			if (lineArr[index].equals(lineArr[index + 1])) {
				counter++;
				index++;
			} else {
//				line = line + counter + lineArr[index];
				line.append(String.valueOf(counter)).append(String.valueOf(lineArr[index]));
				counter = 1;
				index++;
			}

		}

		if (index == (lineSize - 1)) {
//			finalLine = line + counter + lineArr[index];
			finalLine.append(line).append(String.valueOf(counter)).append(String.valueOf(lineArr[index]));
		} else {
			System.out.println("what now...");
			System.out.println("index: " + index + ", " + "lineSize: " + lineSize);
		}

		return finalLine.toString();
	}
}
