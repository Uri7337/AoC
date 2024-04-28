package Shared;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class ReadFile {

    public ArrayList<String> getInput(String filepath) {
        String input = "";
        
        ArrayList<String> data = new ArrayList<String>();

        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        return data;
    }
	
	public void writeinFile(String filepath, String content){
		try {
		 FileWriter myWriter = new FileWriter(filepath,true);
		 myWriter.write(content);
		 myWriter.close();
//		 System.out.println("Successfully wrote to the file.");
	   } catch (IOException e) {
		 System.out.println("Writing in file... An error occurred. :(");
		 e.printStackTrace();
	   }
	}

}
