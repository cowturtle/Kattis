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

class IveBeenEverywhereMan {
    public static void main(String[] args) {
        new IveBeenEverywhereMan();
    }

    IveBeenEverywhereMan() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int n = Integer.parseInt(sc.nextLine());
            HashSet<String> set = new HashSet<>();
            while (n > 0) {
                set.add(sc.nextLine());                
                n--;
            }
            System.out.println(set.size());
            t--;
        }
        sc.close();
    }
}
