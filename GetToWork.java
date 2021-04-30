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

class GetToWork {
    
    public static void main(String[] args) {

        class Town {
            int people;
            int carsUsed;
            ArrayList<Integer> cars = new ArrayList<>();

            public void calculateCarsUsed() {
                Collections.sort(this.cars, Collections.reverseOrder());
                for (Integer i : cars) {
                    this.people -= i;
                    this.carsUsed++;
                    if (this.people <= 0) break;
                }
            }

            @Override
            public String toString() {
                return this.carsUsed + "";
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        for (int i = 1; i <= c; i++) {
            int n = sc.getInt(), t = sc.getInt(), e = sc.getInt();
            boolean impossible = false;
            Town[] towns = new Town[n];      
            for (int j = 0; j < n; j++)
                towns[j] = new Town();      
            for (int j = 0; j < e; j++) {
                int h = sc.getInt(), p = sc.getInt();
                if (h != t) {
                    towns[h - 1].cars.add(p);
                    towns[h - 1].people++;
                }
            }
            for (Town town : towns) {
                town.calculateCarsUsed();
                if (town.people > 0) {
                    impossible = true;
                    break;
                }
            }
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");    
            sb.append(impossible ? "IMPOSSIBLE" : Arrays.toString(towns).replaceAll("[\\[\\],]", ""));
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
