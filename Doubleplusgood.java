import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */

class Doubleplusgood {

    public static void main(String[] args) {
        // Nodes are the numbers
        // Each branch represents either + or "+"
        long[] nums = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\+")).mapToLong(Long::parseLong).toArray();
        int numlen = nums.length;
        int totalCombinations = (1 << (numlen - 1)); // Get the total number of leaves with relation to the height
        HashSet<Long> sums = new HashSet<>();
        for (int i = 0; i < totalCombinations; i++) { // Going through leaf by leaf
            long sum = 0, currNum = 0;
            String path = Integer.toBinaryString(i);
            path = "0".repeat(numlen - path.length() - 1) + path;
            // Generating combinations as binary sequence e.g. 0000, 0001, 0010, 0011 ... 
            // These represent the path to the result. 
            // A 0 means left / +, and 1 means right / "+"
            currNum = nums[0]; // first num;
            for (int j = 1; j < numlen; j++) { // operators
                if (path.charAt(j - 1) == '1') { // String
                    long pow = 10;
                    while (nums[j] % pow != nums[j])
                        pow *= 10;
                    currNum *= pow;
                    currNum += nums[j];
                } else { // Integer
                    sum += currNum;
                    currNum = nums[j];
                }
            }
            sum += currNum; // last num
            sums.add(sum);
        }
        System.out.println(sums.size());
    }

}
