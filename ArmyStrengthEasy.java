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

class ArmyStrengthEasy {
    
    public static void main(String[] args) {
        new ArmyStrengthEasy();
    }

    ArmyStrengthEasy() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int g = sc.getInt(), m = sc.getInt();
            ArrayList<Integer> gArmy = new ArrayList<>();
            ArrayList<Integer> mArmy = new ArrayList<>();

            for (int i = 0; i < g; i++)
                gArmy.add(sc.getInt());

            for (int i = 0; i < m; i++)
                mArmy.add(sc.getInt());

            Collections.sort(gArmy);
            Collections.sort(mArmy);

            while (gArmy.size() > 0 && mArmy.size() > 0) {
                int gWeak = gArmy.get(0), mWeak = mArmy.get(0);
                if (gWeak > mWeak) {
                    mArmy.remove(0);
                } else if (mWeak > gWeak) {
                    gArmy.remove(0);
                } else {
                    mArmy.remove(0);
                }
            }

            if (gArmy.size() == 0) {
                sb.append("MechaGodzilla");
            } else sb.append("Godzilla");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
