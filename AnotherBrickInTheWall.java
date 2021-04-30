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

class AnotherBrickInTheWall {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int h = sc.getInt(), w = sc.getInt(), n = sc.getInt(), currw = 0;
        boolean completed = false;
        while (n-- > 0) {
            int brick = sc.getInt();
            currw += brick;
            if (currw > w || completed) {
                break;
            } else if (currw == w) {
                currw = 0;
                h--;
            } 
            if (h == 0 && currw == 0) {
                completed = true;
            }
        }
        System.out.println(completed ? "YES" : "NO");
    }
    
}
