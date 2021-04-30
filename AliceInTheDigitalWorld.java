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

class AliceInTheDigitalWorld {
    
    public static void main(String[] args) {
        new AliceInTheDigitalWorld();
    }

    AliceInTheDigitalWorld() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int datasets = sc.getInt();
        while (datasets-- > 0) { // Iterate datasets
            int n = sc.getInt(), m = sc.getInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++)
                data[i] = sc.getInt();

            int max = 0, index = 0;
            while (index < n) { // Iterate the dataset
                int local_max = 0, mCount = 0, nextStartIndex = 0; 

                while (index < n)  { 
                    if (data[index] < m) { // minimum m condition
                        if (mCount == 0) local_max = 0; // In scenario where first index is m
                        index++;
                        break;
                    }
                    local_max += data[index];
                    if (data[index] == m) {
                        mCount++;
                        if (mCount == 1) {
                            nextStartIndex = index + 1; // The will be our next start point
                        } else if (mCount == 2) {
                            local_max -= m;
                            index = nextStartIndex; // We have seen 2 m, that means we restart from our prev recorded
                            break;
                        }
                    }
                    index++;
                }
                max = Math.max(local_max, max);
            }
            System.out.println(max);
        }

    }

}
