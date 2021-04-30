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

class BestRelayTeam {
    
    public static void main(String[] args) {

        class Runner implements Comparable<Runner> {
            String name;
            double first, other;

            public Runner(String name, double first, double other) {
                this.name = name;
                this.first = first;
                this.other = other;
            }
            
            @Override
            public String toString() {
                return this.name;
            }

            @Override
            public int compareTo(Runner r) {
                return (int) ((this.other - r.other) * 10000);
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        double bestTime = Double.MAX_VALUE;
        Runner[] runners = new Runner[n];
        Runner[] coolestTeam = new Runner[4];
        for (int i = 0; i < n; i++)
            runners[i] = new Runner(sc.getWord(), sc.getDouble(), sc.getDouble());
        Arrays.sort(runners);
        for (int i = 0; i < n; i++) {
            double time = runners[i].first;
            Runner[] tmp = new Runner[4];
            tmp[0] = runners[i];
            int l = 1;
            for (int j = 0; j < n && l < 4; j++) {
                if (j == i) continue;
                time += runners[j].other;
                tmp[l] = runners[j];
                l++;
            }
            if (bestTime > time) {
                bestTime = time;
                coolestTeam = Arrays.copyOf(tmp, 4);
            }
        }
        System.out.println(bestTime);
        Arrays.stream(coolestTeam).forEach(System.out::println);
        sc.close();
    }
    
}
