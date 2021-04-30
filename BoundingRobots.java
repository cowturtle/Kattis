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

class BoundingRobots {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int w = 0, l = 0;
        while ((w = sc.getInt()) != 0 && (l = sc.getInt()) != 0) {
            int n = sc.getInt();
            int thinkx = 0, thinky = 0, actualx = 0, actualy = 0;
            while (n-- > 0) {
                char direction = sc.getWord().charAt(0);
                int steps = sc.getInt();
                if (direction == 'u') {
                    thinky += steps;
                    if (actualy + steps > l - 1) {
                        actualy = l - 1;
                    } else actualy += steps;
                } else if (direction == 'd') {
                    thinky -= steps;
                    if (actualy - steps < 0) {
                        actualy = 0;
                    } else actualy -= steps;
                } else if (direction == 'l') {
                    thinkx -= steps;
                    if (actualx - steps < 0) {
                        actualx = 0;
                    } else actualx -= steps;
                } else if (direction == 'r') {
                    thinkx += steps;
                    if (actualx + steps > w - 1) {
                        actualx = w - 1;
                    } else actualx += steps;
                }
            }
            sb.append("Robot thinks ").append(thinkx).append(" ").append(thinky).append("\n");
            sb.append("Actually at ").append(actualx).append(" ").append(actualy).append("\n\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
