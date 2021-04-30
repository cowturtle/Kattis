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

class StackingCups {
    
    public static void main(String[] args) {
        new StackingCups();
    }

    StackingCups() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Cupies> al = new ArrayList<>();
        Pattern p = Pattern.compile("^[a-z]*");
        while (n-- > 0) {
            String s = sc.getWord();
            String s2 = sc.getWord();
            Matcher m = p.matcher(s);
            if (m.matches()) {
                al.add(new Cupies(s, Double.parseDouble(s2)));
            } else {
                al.add(new Cupies(s2, Double.parseDouble(s) / 2));
            }
        }
        Collections.sort(al);
        al.stream().forEach(System.out::println);
        // sc.close();
    }

}

class Cupies implements Comparable<Cupies> {
    double rad;
    String color;

    Cupies(String color, double rad) {
        this.rad = rad;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }

    @Override
    public int compareTo(Cupies c) {
        return (int) (this.rad - c.rad);
    }
}
