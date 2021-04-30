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

class Beehives {
    
    public static void main(String[] args) {

        class Hive {    
            double x, y;

            Hive(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Hive h) {
                return Math.sqrt(Math.pow(this.y - h.y, 2) + Math.pow(this.x - h.x, 2));
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double d = 0.0;
        int n = 0;
        while ((d = sc.getDouble()) != 0.0 && (n = sc.getInt()) != 0) {
            Hive[] hives = new Hive[n];
            int sour = 0, sweet = 0;
            for (int i = 0; i < n; i++)
                hives[i] = new Hive(sc.getDouble(), sc.getDouble());
            for (int i = 0; i < n; i++) {
                boolean sourFlag = false;
                for (int j = 0; j < n; j++) {
                    if (i != j && hives[i].distanceTo(hives[j]) <= d) {
                        sourFlag = true;
                        break;
                    }
                }
                if (sourFlag) {
                    sour++;
                } else {
                    sweet++;
                }
            }
            sb.append(sour).append(" sour, ").append(sweet).append(" sweet").append("\n");
        } 
        System.out.print(sb.toString());
        sc.close();
    }
    
}
