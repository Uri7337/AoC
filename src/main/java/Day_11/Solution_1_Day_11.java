package Day_11;

import shared.EasyPrint;
import shared.ReadFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_1_Day_11 {

    int solution = 0;
    EasyPrint ep = new EasyPrint();

    public Object getSolution(String filepath) {
        solution = 0;
        ReadFile rf = new ReadFile();
        ArrayList<String> data = new ArrayList<String>();

        data = rf.getInput(filepath);
        String[] numbers = data.get(0).split(" ");

        List<Integer> nums = new ArrayList<>();
        for (String snum : numbers) {
            nums.add(Integer.parseInt(snum));
        }

        int blinks = 6; // 6

        for (int i = 0; i < blinks; i++) {
            nums = checkRules(nums);
        }

        return nums.size();
    }

    List<Integer> checkRules(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int number = nums.get(i);
            if (number == 0) {
                nums.set(i, 1);
            } else if (((int) (Math.log10(number) + 1) % 2) == 0) {
                // ep.p(nums);
                int[] sn = splitNum(number);
                nums.remove(i);
                nums.add(i, sn[1]);
                nums.add(i, sn[0]);
                i++;
                // ep.p(nums);
            } else {
                nums.set(i, number * 2024);
            }
        }
        ep.p(nums);
        return nums;
    }

    int[] splitNum(int n) {
        StringBuilder strb = new StringBuilder();
        int[] snum = new int[2];

        strb.append(n);

        snum[0] = Integer.parseInt(strb.substring(0, (strb.length() / 2)));
        snum[1] = Integer.parseInt(strb.substring((strb.length() / 2), (strb.length())));

        return snum;
    }

    int[] splitNum2(int n) {
        StringBuilder strb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        int[] snum = new int[2];

        while (n > 0) {
            s.push(n % 10);
            n /= 10;

        }

        for (int i = 0; i < (s.size() / 2); i++) {
            strb.append(s.pop());
            snum[0] = Integer.parseInt(strb.toString());
        }
        strb = new StringBuilder();
        for (int i = (s.size() / 2); i < s.size(); i++) {
            strb.append(s.pop());
            snum[1] = Integer.parseInt(strb.toString());
        }

        return snum;
    }
}