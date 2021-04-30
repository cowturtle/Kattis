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

class QuickBrownFox {
    public static void main(String[] args) {
        new QuickBrownFox();
    }

    QuickBrownFox() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            String print = "missing ";
            boolean[] tr = new boolean[26];
            char[] carr = sc.nextLine().toLowerCase().replaceAll("[\\W\\s0-9]", "").toCharArray();
            for (int i = 0; i < carr.length; i++) {
                tr[carr[i] - 97] = true;
            }
            for (int i = 0; i < tr.length; i++) {
                if (!tr[i]) print += (char) (i + 97);
            }
            if (print.equals("missing ")) print = "pangram";
            al.add(print);
            n--;
        }
        al.stream().forEach(System.out::println);
        sc.close();
    }
    
}
