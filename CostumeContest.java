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

class CostumeContest {
    
    public static void main(String[] args) {

        class Costume implements Comparable<Costume> {
            private String name;
            private int count;

            Costume(String name) {
                this.name = name;
                this.count = 1;
            }

            void addCount() {
                this.count += 1;
            }

            boolean sameCount(Costume c) {
                return this.count == c.count;
            }

            @Override
            public int compareTo(Costume c) {
                return this.count == c.count ? this.name.compareTo(c.name) : this.count - c.count;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Costume) {
                    return ((Costume) obj).name.equals(this.name);
                }
                return false;
            }

            @Override
            public String toString() {
                return this.name;
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Costume> al = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.getWord();
            Costume c = new Costume(name);
            if (al.contains(c)) {
                al.get(al.indexOf(c)).addCount();
            } else {
                al.add(c);
            }
        }   
        Collections.sort(al);
        Costume c = al.get(0);
        for (Costume cc : al)
            if (c.sameCount(cc)) {
                System.out.println(cc);
            } else break;

    }
    
}
