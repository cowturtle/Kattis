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

class GrassSeedInc {
    public static void main(String[] args) {
        new GrassSeedInc();
    }

    GrassSeedInc() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        double c = Double.parseDouble(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        double cost = 0;
        while (l > 0) {
            l--;
            cost += Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToDouble(Double::parseDouble)
                        .reduce((x,y) -> x * y)
                        .getAsDouble() * c;
        }
        System.out.println(cost);
        sc.close();
    }

}
