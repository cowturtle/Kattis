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

class TheMailboxManufacturersProblem {
    
    public static void main(String[] args) {
        new TheMailboxManufacturersProblem();
    }

    TheMailboxManufacturersProblem() {
        answer();
    }

    static final int MAX_CRACKERS = 100;
    static final int MAX_MAILBOXES = 10;   

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int[] memoized = new int[MAX_CRACKERS * 100 + 
                                    MAX_CRACKERS * 100000 
                                    + MAX_MAILBOXES + 1];
        Arrays.fill(memoized, -1);
        int n = sc.getInt();
        while (n-- > 0) {
            int mailBoxes = sc.getInt(), crackerLimit = sc.getInt();
            sb.append(solve(mailBoxes, 0, crackerLimit, memoized)).append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }

    int solve(int mailBoxes, int lower, int upper, int[] memoized) {

        // Every mailbox blows up at a certain number of crackers.
        // e.g. first mail box we try with some number of crackers (some c)
        // A. It blows up, so we know the min num for it to blow is between 1 and c (not inclusive)
        //    also we are left with mailBoxes - 1
        // B. It doesnt, then we know at least c + 1 crackers are needed to blow it
        //    we still got the same num of mailBoxes

        int index = lower * 100 + upper * 100000 + mailBoxes;
        
        if (memoized[index] != -1) return memoized[index];
        if (mailBoxes == 1) return crackerSum(lower, upper);
        if (upper <= lower) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = lower + 1; i < upper + 1; i++) {
            int destroyed = solve(mailBoxes - 1, lower, i - 1, memoized); // A
            int pass = solve(mailBoxes, i, upper, memoized); // B
            double max = i + Math.max(destroyed, pass); 
            min = (int) Math.min(max, min);
        }
        
        return memoized[index] = min;
    }

    int crackerSum(int lower, int upper) {
        // basically sum of upper bound minus sum of lower bound
        // bit shift 1 divides by 2
        return ((upper * (upper + 1)) - (lower * (lower + 1))) >> 1;
    }
    
}
