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

class Timebomb {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        String zero = "*****\n*   *\n*****";
        String one = "     \n     \n*****";
        String two = "* ***\n* * *\n*** *";
        String three = "* * *\n* * *\n*****";
        String four = "***  \n  *  \n*****";
        String five = "*** *\n* * *\n* ***";
        String six = "*****\n* * *\n* ***";
        String seven = "*    \n*    \n*****";
        String eight = "*****\n* * *\n*****";
        String nine = "*** *\n* * *\n*****";
        Scanner sc = new Scanner(System.in);
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
        int r = 5, sum = 0;
        char[][] arr = new char[r][];
        for (int i = 0; i < r; i++)
            arr[i] = sc.nextLine().toCharArray();
        for (int j = 0; j < arr[0].length; j += 4) {
            String s = "";
            for (int i = 0; i < r; i++) 
                s += arr[i][j];
            s += "\n";
            for (int i = 0; i < r; i++) 
                s += arr[i][j + 1];
            s += "\n";
            for (int i = 0; i < r; i++) 
                s += arr[i][j + 2];
            if (hmap.containsKey(s)) {
                sum *= 10;
                sum += hmap.get(s);
            } else {
                sum = 1;
                break;
            }
        }
        System.out.println(sum % 6 == 0 ? "BEER!!" : "BOOM!!");
        sc.close();
    }
    
}
