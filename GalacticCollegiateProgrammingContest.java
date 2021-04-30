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

class GalacticCollegiateProgrammingContest {

    public static void main(String[] args) {

        class Team implements Comparable<Team> {
            int a, b;

            Team() {
                this.a = 0;
                this.b = 0;
            }

            void addA() {
                this.a += 1;
            }

            void addB(int b) {
                this.b += b;
            }


            @Override
            public int compareTo(Team t) {
                return this.a == t.a ? t.b - this.b : this.a - t.a;
            }

            @Override
            public String toString() {
                return a + " " + b; 
            }

        }

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt(), m = sc.getInt();
        Team[] teams = new Team[n];
        HashSet<Integer> greaterThanOne = new HashSet<>();
        for (int i = 0; i < n; i++)
            teams[i] = new Team();
        Team favourite = teams[0];
        while (m-- > 0) {
            int t = sc.getInt() - 1, p = sc.getInt();
            teams[t].addA();
            teams[t].addB(p);
            // System.out.println(Arrays.toString(teams));
            if (t == 0) {
                greaterThanOne.removeIf(i -> favourite.compareTo(teams[i]) >= 0);
            } else if (favourite.compareTo(teams[t]) < 0) {
                greaterThanOne.add(t);
            }
            // System.out.println(greaterThanOne);
            out.println(greaterThanOne.size() + 1);
        }
        out.close();
        sc.close();
    }

}
