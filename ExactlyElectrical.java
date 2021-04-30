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

class ExactlyElectrical {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int startx = sc.getInt(), starty = sc.getInt();
        int endx = sc.getInt(), endy = sc.getInt();
        int charge = sc.getInt();
        int mindist = Math.abs(startx - endx) + Math.abs(starty - endy);
        String out = "";
        
        // 1. Charge needs to be 0
        // 2. Additionally, if the distance is lesser and its difference to the charge is mod 2 == 0
        // Why mod 2 is because assuming the vehicle reached its destination, if its mod 2, it can do
        // a stupid move up and down to drain its battery to get to 0
        if (mindist <= charge && (charge - mindist) % 2 == 0) {
            out = "Y";
        } else {
            out = "N";
        }
        
        System.out.println(out);
        sc.close();
    }
    
}
