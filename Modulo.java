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

class Modulo {
    public static void main(String[] args) {
        new Modulo();
    }

    Modulo() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        ArrayList<Integer> al = new ArrayList<>();
        while (n > 0) {
            n--;
            int x = Integer.parseInt(sc.nextLine()) % 42;
            if (!al.contains(x)) {
                al.add(x);
            }
        }
        sc.close();
        System.out.println(al.size());
    }
    
}
