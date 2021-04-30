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

class FireFly {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]), h = Integer.parseInt(tmp[1]);
        long[] bottomHeights = new long[h], topHeights = new long[h];
        // Order of the spikes don't matter as the fly will crash into it either way
        // Count the num of spikes for varying heights
        /**
            0  1  2  3  4  5  6  0  1  2  3  4  5  6
            ________________________________________
                                 |  |  |  |  |  |  |  
            |  |                       |  |  |  |  |  
            |  |  |  |                       |  |  |  
            |  |  |  |  |  |                       |  
            |__|__|__|__|__|__|_____________________
         */

        for (int i = 0; i < n; i++) { 
            int x = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                bottomHeights[x - 1]++;
            } else {
                topHeights[h - x]++;
            }
        }
        // Summing can be viwed as crashing into a pillar.
        // For each consecutive sum, we are taking into account
        // the levels that contains these pillars and we choose to crash into them
        // incidently, the sums also cater for the pillars which are not of height, thus
        // not crashing into them.

        // We sum it backwards as it is akin to viewing it as the
        // longest spike in front while the shortest behind

        // We can see from the image that there is a clear solution
        // for a minimum number of crashes
        long carry = 0L;
        for (int i = h - 1; i >= 0; i--) 
            bottomHeights[i] = carry += bottomHeights[i];
        carry = 0L;
        for (int i = 0; i < h; i++) 
            topHeights[i] = carry += topHeights[i];
        System.out.println(best(bottomHeights, topHeights, h));
        br.close();
    }

    static String best(long[] bottomHeights, long[] topHeights, int h) {
        TreeMap<Long, Long> hmap = new TreeMap<>();
        for (int i = 0; i < h; i++) {
            long x = bottomHeights[i] + topHeights[i]; // Following previous explanation and image
            hmap.put(x, (hmap.containsKey(x) ? hmap.get(x) : 0) + 1);            
        }
        Entry<Long, Long> e = (Entry<Long, Long>) hmap.entrySet().iterator().next();
        return e.getKey() + " " + e.getValue();
    }

}
