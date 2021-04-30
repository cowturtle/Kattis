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
// REFERENCED http://pc.fdi.ucm.es/swerc/SWERC-sols.pdf
// java's priority queue too slow, alternative could try guava? havent tried
class DistributingBallotBoxes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cities = new int[500000];
        while (true) {
            String s = br.readLine();
            if (s.equals("-1 -1")) break;
            String[] tmp = s.split(" ");
            int n = Integer.parseInt(tmp[0]), boxes = Integer.parseInt(tmp[1]);
            int min = 0, max = 0; // min and max people assigned to one box.
            for (int i = 0; i < n; i++) {
                cities[i] = Integer.parseInt(br.readLine());
                max = Math.max(max, cities[i]);
            }  
            br.readLine();
            while (min < max) {
                int avg = (min + max) / 2; // additional people per city
                int tmpBoxes = 0;
                for (int i = 0; i < n; i++)
                    tmpBoxes += (avg + cities[i] - 1) / avg;
                if (tmpBoxes > boxes) { // if there are too many boxes, it means we need to assign more people per box
                    min = avg + 1;
                } else { // Likewise, too little boxes, we assign less people overall
                    max = avg;
                }
            }
            System.out.println(min);
        }
        br.close();
    }

}
