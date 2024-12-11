package Day_11;

import shared.EasyPrint;
import shared.ReadFile;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_1_Day_11 {

    EasyPrint ep = new EasyPrint();

    public Object getSolution(String filepath) {
        
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        data = rf.getInput(filepath);
        String[] numbers = data.get(0).split(" ");

        List<BigInteger> nums = new ArrayList<>();
        for (String snum : numbers) {
            nums.add(new BigInteger(snum));
        }

        int blinks = 75; // 6

        for (int i = 0; i < blinks; i++) {
            nums = checkRules(nums);
        }

        return nums.size();
    }

    List<BigInteger> checkRules(List<BigInteger> nums) {
        for (int i = 0; i < nums.size(); i++) {
            BigInteger number = nums.get(i);
            if (number.equals(BigInteger.ZERO)) {
                nums.set(i, BigInteger.ONE);
            } else if (((int) (Math.log10(number.doubleValue()) + 1) % 2) == 0) {
                // ep.p(nums);
                BigInteger[] sn = splitNum(number);
                nums.remove(i);
                nums.add(i, sn[1]);
                nums.add(i, sn[0]);
                i++;
                // ep.p(nums);
            } else {
                
                nums.set(i, number.multiply(BigInteger.valueOf(2024)));
            }
        }
        //ep.p(nums);
        return nums;
    }

    BigInteger[] splitNum(BigInteger n) {
        StringBuilder strb = new StringBuilder();
        BigInteger[] snum = new BigInteger[2];

        strb.append(n);
        
        snum[0] = new BigInteger(strb.substring(0, (strb.length() / 2)));
        snum[1] = new BigInteger(strb.substring((strb.length() / 2), (strb.length())));

        return snum;
    }

}