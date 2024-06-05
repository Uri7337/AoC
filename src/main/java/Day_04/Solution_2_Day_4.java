package Day_4;
//
import Shared.ReadFile;
import java.util.ArrayList;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//
public class Solution_2_Day_4 {
    int solution = 0;
//
     public int getSolution() {
       ReadFile rf = new ReadFile();
       ArrayList<String> file = new ArrayList<String>();
//       String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_4_2019.txt";
       String filepath = "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_4_test_2019.txt";
       file = rf.getInput(filepath);
       
       String s = file.get(0);
       
       int i = 0;
       while(true){
           String hash = getMd5(s+i);
           
//           System.out.println("i:" + i + " h: " + hash);
           
           if (hash.startsWith("000000")){
               solution = i;
               System.out.println("FINAL = "+"i:" + i + " h: " + hash);
               break;
           }
           
           
        i++;   
       }
       
        
       
       
       
       return solution;
    }
     
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
}
