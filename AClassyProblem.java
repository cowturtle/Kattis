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

class AClassyProblem {
    
    public static void main(String[] args) {
        new AClassyProblem();
    }

    AClassyProblem() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            ArrayList<Human> people = new ArrayList<>();
            while (n-- > 0) {
                String name = sc.getWord();
                name = name.substring(0, name.length() - 1);
                int[] rank = Human.stringToIntArray(sc.getWord());
                sc.getWord();
                people.add(new Human(name, rank));
            }
            Collections.sort(people);
            for (Human h : people) 
                sb.append(h).append("\n");
            sb.append("==============================").append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

}

class Human implements Comparable<Human>{
    private final String name;
    private final int[] ranking;

    private final static int MAX_RANK_SIZE = 10;

    Human(String name, int[] ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Human other) {
        for (int i = 0; i < MAX_RANK_SIZE; i++) {
            int a = this.ranking[i], b = other.ranking[i];
            if (a > b) {
                return -1;
            } else if (b > a) {
                return 1;
            }
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    static int[] stringToIntArray(String s) {
        int[] arr = Arrays.stream(s.split("-")).mapToInt(x -> {
                        if (x.equals("upper")) {
                            return 2;
                        } else if (x.equals("middle")) {
                            return 1;
                        }
                        return 0;
                    })
                    .toArray();
        return IntStream.range(0, MAX_RANK_SIZE)
                .map(x -> arr.length - 1 - x < 0 ? 1 : arr[arr.length - 1 - x])
                .toArray();
    }
}
