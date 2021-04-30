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

class ASCIIAddition {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        HashMap<Integer, String> hmap2 = new HashMap<>();
        String zero = "xxxxxx...xx...xx...xx...xx...xxxxxx";
        String one = "....x....x....x....x....x....x....x";
        String two = "xxxxx....x....xxxxxxx....x....xxxxx";
        String three = "xxxxx....x....xxxxxx....x....xxxxxx";
        String four = "x...xx...xx...xxxxxx....x....x....x";
        String five = "xxxxxx....x....xxxxx....x....xxxxxx";
        String six = "xxxxxx....x....xxxxxx...xx...xxxxxx";
        String seven = "xxxxx....x....x....x....x....x....x";
        String eight = "xxxxxx...xx...xxxxxxx...xx...xxxxxx";
        String nine = "xxxxxx...xx...xxxxxx....x....xxxxxx";
        String plus = ".......x....x..xxxxx..x....x.......";
        hmap.put(zero, 0);
        hmap.put(one, 1);
        hmap.put(two, 2);
        hmap.put(three, 3);
        hmap.put(four, 4);
        hmap.put(five, 5);
        hmap.put(six, 6);
        hmap.put(seven, 7);
        hmap.put(eight, 8);
        hmap.put(nine, 9);
        hmap.put(plus, -1);
        
        hmap2.put(0, zero);
        hmap2.put(1, one);
        hmap2.put(2, two);
        hmap2.put(3, three);
        hmap2.put(4, four);
        hmap2.put(5, five);
        hmap2.put(6, six);
        hmap2.put(7, seven);
        hmap2.put(8, eight);
        hmap2.put(9, nine);
        hmap2.put(-1, plus);

        char[][] arr = new char[7][];
        String s = "";
        for (int i = 0; i < 7; i++)
            arr[i] = sc.getWord().toCharArray();
        for (int i = 0; i < arr[0].length; i += 5) {
            if (i != 0) i++;
            String tmp = "";
            for (int j = 0; j < 7; j++) {
                tmp += arr[j][i];
                tmp += arr[j][i + 1];
                tmp += arr[j][i + 2];
                tmp += arr[j][i + 3];
                tmp += arr[j][i + 4];
            }
            s += hmap.get(tmp);
        }
        String sum = String.valueOf(Arrays.stream(s.split("-1")).mapToInt(Integer::parseInt).sum());

        String[] print = new String[] {"", "", "", "", "", "", ""};
        for (char c : sum.toCharArray()) {
            String p = hmap2.get(Character.getNumericValue(c));
            print[0] += p.substring(0, 5) + ".";
            print[1] += p.substring(5, 10) + ".";
            print[2] += p.substring(10, 15) + ".";
            print[3] += p.substring(15, 20) + ".";
            print[4] += p.substring(20, 25) + ".";
            print[5] += p.substring(25, 30) + ".";
            print[6] += p.substring(30, 35) + ".";
        }
        
        for (String a : print) 
            System.out.println(a.substring(0, a.length() - 1));
        sc.close();     
    }
    
}
