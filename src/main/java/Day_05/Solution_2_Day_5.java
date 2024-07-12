package Day_05;

import Shared.ReadFile;
import Shared.EasyPrint;

import java.util.ArrayList;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Solution_2_Day_5 {
	EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		/* String filepath = "./src/main/resources/Day_05_test_2016.txt"; */
		String filepath = "./src/main/resources/Day_05_2016.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			solution = generatePassword(line);
		}

		return solution;
	}

	public String generatePassword(String doorID){
		int incIndex = 0;
		StringBuilder password = new StringBuilder("________");
		while(password.indexOf("_") != -1){
			String[] possiblePassword = testFiveZeroes(getMd5(doorID+incIndex), password.toString());
			if(possiblePassword[0].equals("1")){
				int replaceAt =  Integer.parseInt(possiblePassword[1]);
				password.replace(replaceAt, (replaceAt+1), possiblePassword[2]);
			}
			incIndex++;
		} 
		return password.toString();
	}

	public String[] testFiveZeroes(String testMD5,String password){
		String[] answerAnd6thCharAnd7thChar = {"0","",""};
		if(testMD5.startsWith("00000")){
			String sixthCharacter = testMD5.substring(5, 6); //gets us sixth character
			if(sixthCharacter.matches("[0-7]")){
				if(password.charAt(Integer.parseInt(sixthCharacter))=='_'){
					String seventhCharacter = testMD5.substring(6, 7); //gets us sixth character
					answerAnd6thCharAnd7thChar[0] = "1";
					answerAnd6thCharAnd7thChar[1] = sixthCharacter;
					answerAnd6thCharAnd7thChar[2] = seventhCharacter;
					return answerAnd6thCharAnd7thChar;
				}
			}
			
			
			
		};

		return answerAnd6thCharAnd7thChar;
	}



	/* ==== Used from https://www.geeksforgeeks.org/md5-hash-in-java/ ==== */
	public static String getMd5(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
	/* ------------------------------------------------------------------- */
 
  

	// ----debug zone----
}
