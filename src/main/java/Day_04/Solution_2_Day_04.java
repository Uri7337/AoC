package Day_04;

import Shared.EasyPrint;
import Shared.ReadFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;

public class Solution_2_Day_04 {
    EasyPrint ep = new EasyPrint();

	Object solution = "Nothing yet!";

	public Object getSolution() {
        ReadFile rf = new ReadFile();
        ArrayList<String> file = new ArrayList<String>();
        /* String filepath = "./src/main/resources/Day_04_test_2016.txt"; */
        String filepath = "./src/main/resources/Day_04_2016.txt";
        file = rf.getInput(filepath);

        // Insert Solution Here:
        for (int i = 0; i < file.size(); i++) {
            String[] lineParts = file.get(i).split("-");
            
            int roomID =  Integer.parseInt(lineParts[lineParts.length-1].substring(0, 3));
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < lineParts.length-1; j++) {
                sb.append(encrypt(lineParts[j],roomID)+" ");
                
            }
            sb.append(roomID);

            if(sb.toString().startsWith("north")){
                ep.p(sb);
                solution = sb.toString();
            }
        }


        return solution;
    }

    /* from https://www.geeksforgeeks.org/caesar-cipher-in-cryptography/ */
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
   

    // ----debug zone----

}