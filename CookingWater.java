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

class CookingWater {
    
    public static void main(String[] args) {
        // Edward: "A watched pot never boils", 
        // The moment he looks away, anytime between a and b, the
        // water can start to boil.
        // We know for sure it is boiling at b.
        // find intersection between each boiling process
        // if all the boiling proccesses intersect, gunilla has a point
        // if not edward is right

        // if the latest A point is later than the earliest B point
        // it shows that edward is right as the water still has
        // not started boiling even after some other B's timing!
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        int maxA = sc.getInt(), minB = sc.getInt();
        while (n-- > 0) {
            maxA = Math.max(maxA, sc.getInt());
            minB = Math.min(minB, sc.getInt());
        }
        System.out.println(maxA - minB > 0 ? "edward is right" : "gunilla has a point"); 
        sc.close();
    }
    
}
