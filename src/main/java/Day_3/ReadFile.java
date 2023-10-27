package Day_3;

import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class ReadFile {

	public ArrayList<ArrayList<Character>> getBigAL() throws FileNotFoundException, IOException {
		String filepath="c:/Users/ourie/Downloads/test-kopie.txt";
		
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();

		ArrayList<String> data = new ArrayList<>();
		ArrayList<ArrayList<Character>> bigAL =  new ArrayList<>(lines); 
		
		File f = new File(filepath);
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			data.add(sc.nextLine());
		}
		sc.close();
		
		char[] puzzlechars = {};
		for (int i = 0; i < data.size(); i++) {
			puzzlechars = data.get(i).toCharArray();
			ArrayList<Character> smallAL = new ArrayList<>();
			
			for (int j = 0; j < puzzlechars.length/2; j++) {
				smallAL.add(puzzlechars[j]);
				
			}
			bigAL.add(smallAL);
			smallAL = new ArrayList<>();
			for (int j = puzzlechars.length/2; j < puzzlechars.length; j++) {
				smallAL.add(puzzlechars[j]);
				
			}
			bigAL.add(smallAL);
		}
		
		return bigAL;
	}
}
