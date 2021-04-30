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

class ArmyStrengthHard {
    
    public static void main(String[] args) {
        new ArmyStrengthHard();
    }

    ArmyStrengthHard() {
        answer();
    }

    // 0.63s
    // void answer() { 
    //     Kattio sc = new Kattio(System.in);
    //     StringBuilder sb = new StringBuilder();
    //     int t = sc.getInt();
    //     while (t-- > 0) {
    //         int g = sc.getInt(), m = sc.getInt();
    //         Queue<Integer> gArmy = new PriorityQueue<>();
    //         Queue<Integer> mArmy = new PriorityQueue<>();

    //         for (int i = 0; i < g; i++)
    //             gArmy.add(sc.getInt());

    //         for (int i = 0; i < m; i++)
    //             mArmy.add(sc.getInt());
            
    //         while (gArmy.size() > 0 && mArmy.size() > 0) {
    //             int gWeak = gArmy.poll(), mWeak = mArmy.poll();
    //             if (gWeak > mWeak) {
    //                 gArmy.add(gWeak);
    //             } else if (mWeak > gWeak) {
    //                 mArmy.add(mWeak);
    //             } else {
    //                 gArmy.add(gWeak);
    //             }
    //         }

    //         if (gArmy.size() == 0) {
    //             sb.append("MechaGodzilla");
    //         } else sb.append("Godzilla");
    //         sb.append("\n");
    //     }
    //     System.out.println(sb.toString());
    //     sc.close();
    // }

    // 0.30
    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int g = sc.getInt(), m = sc.getInt();
            int gMax = 0, mMax = 0;

            for (int i = 0; i < g; i++)
                gMax = Math.max(gMax, sc.getInt());

            for (int i = 0; i < m; i++)
                mMax = Math.max(mMax, sc.getInt());
            
            if (mMax > gMax) {
                sb.append("MechaGodzilla");
            } else sb.append("Godzilla");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
