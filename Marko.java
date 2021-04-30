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

class Marko {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Integer, String> hmap = new HashMap<>();
        String two = "abc",
                three = "def",
                four = "ghi",
                five = "jkl",
                six = "mno",
                seven = "pqrs",
                eight = "tuv",
                nine = "wxyz";
        hmap.put(2, two);
        hmap.put(3 , three);
        hmap.put(4 , four);
        hmap.put(5 , five);
        hmap.put(6 , six);
        hmap.put(7 , seven);
        hmap.put(8 , eight);
        hmap.put(9 , nine);
        int n = sc.getInt();
        String[] dict = new String[n];
        for (int i = 0; i < n; i++)
            dict[i] = sc.getWord();
        char[] nums = sc.getWord().toCharArray();
        boolean[] check = new boolean[10];
        for (int i = 0; i < nums.length; i++) {
            int digit = Character.getNumericValue(nums[i]);
            check[digit] = true;
        }
        String checker = "";
        for (int i = 2; i < 10; i++)
            if (check[i]) checker += hmap.get(i); 
        Pattern p = Pattern.compile("[" + checker + "]+");
        int count = 0;
        for (String s : dict) {
            if (s.length() != nums.length) continue;
            Matcher m = p.matcher(s);
            if (m.matches()) count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}
