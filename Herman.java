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

class Herman {
    
    public static void main(String[] args) {
        new Herman();
    }

    Herman() {
        answer();
    }

    void answer() { 
        double r = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.printf("%f\n%f", getEuclideanArea(r), getTaxicobArea(r));
    }

    double getEuclideanArea(double r) {
        return Math.PI * r * r;
    }

    double getTaxicobArea(double r) {
        return Math.pow(Math.sqrt(Math.pow(r, 2) * 2), 2);
    }

}
