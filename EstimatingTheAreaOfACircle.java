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

class EstimatingTheAreaOfACircle {
    
    public static void main(String[] args) {
        new EstimatingTheAreaOfACircle();
    }

    EstimatingTheAreaOfACircle() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double r = 0, m = 0, c = 0;
        while ((r = sc.getDouble()) != 0 
                && (m = sc.getDouble()) != 0
                && (c = sc.getDouble()) != 0) {
                    
                    sb.append(Math.PI * Math.pow(r, 2));
                    sb.append(" ");
                    sb.append((c / m) * Math.pow(r * 2, 2));
                    sb.append("\n");
                }
        System.out.println(sb.toString().trim());        
        sc.close();
    }
    
}
