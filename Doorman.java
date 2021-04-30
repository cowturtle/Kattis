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

class Doorman {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt(), men = 0, women = 0;
        sc.nextLine();
        char[] arr = sc.nextLine().toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        for (char c : arr)
            al.add(c);
        while (true) {
            boolean stuck = true;
            if (Math.abs(men + 1 - women) <= diff) {
                if (!al.isEmpty()) {
                    if (al.get(0) == 'M') {
                        al.remove(0);
                        stuck = false;
                        men++;
                    } else if (al.size() > 1 && al.get(1) == 'M') {
                        al.remove(1);
                        stuck = false;
                        men++;
                    }
                }
            }   
            if (stuck && Math.abs(men - women - 1) <= diff) {
                if (!al.isEmpty()) {
                    if (al.get(0) == 'W') {
                        al.remove(0);
                        stuck = false;
                        women++;
                    } else if (al.size() > 1 && al.get(1) == 'W') {
                        al.remove(1);
                        stuck = false;
                        women++;
                    }
                }
            }
            if (stuck || al.isEmpty()) break;
        }
        System.out.println(men + women);
    }
    
}
