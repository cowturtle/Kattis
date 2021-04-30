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

class GuessingGame {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] nums = new boolean[10 + 1];
        int guess = 0;
        while ((guess = sc.getInt()) != 0) {
            sc.getWord();
            String response = sc.getWord();
            if (response.equals("on")) {
                sb.append(nums[guess] ? "Stan is dishonest" : "Stan may be honest").append("\n");
                nums = new boolean[10 + 1];
            } else {
                if (response.equals("low")) {
                    for (int i = guess; i > 0; i--)
                        nums[i] = true;
                } else if (response.equals("high")) {
                    for (int i = guess; i < 10 + 1; i++)
                        nums[i] = true;
                }
            }
        }   
        System.out.print(sb.toString());
        sc.close();
    }
    
}
