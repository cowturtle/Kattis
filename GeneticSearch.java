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

class GeneticSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            String[] tmp = br.readLine().split(" ");
            if (tmp.length == 1) break;

            String s = tmp[0], l = tmp[1];
            out.printf("%d %d %d\n", findOne(s, l), findTwo(s, l), findThree(s, l));
        }
        out.close();
        br.close();
    }

    static int findOne(String s, String l) {
        return findMatch(s, l);
    }

    static int findTwo(String s, String l) {
        int count = 0;
        HashSet<String> uniques = new HashSet<>();
        int slen = s.length();
        for (int i = 0; i < slen; i++) {
            String deleted = s.substring(0, i) + s.substring(i + 1, slen);
            if (!uniques.contains(deleted)) count += findMatch(deleted, l);                
            uniques.add(deleted);
        }
        return count;
    }

    static int findThree(String s, String l) {
        int count = 0;
        HashSet<String> uniques = new HashSet<>();
        char[] agct = new char[] {'A', 'G', 'C', 'T'};
        int slen = s.length(), agctlen = agct.length;
        for (int i = 0; i < slen + 1; i++) 
            for (int j = 0; j < agctlen; j++) {
                String inserted = s.substring(0, i) + agct[j] + s.substring(i, slen);
                if (!uniques.contains(inserted)) count += findMatch(inserted, l);
                uniques.add(inserted);
            }            
        return count;
    }

    static int findMatch(String s, String l) {
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(l);
        int count = 0;
        boolean first = true;
        while (m.find(first ? 0 : m.start() + 1)) {
            count++;
            first = false;
        }            
        return count;
    }

}
