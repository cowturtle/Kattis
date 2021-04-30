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

class Beavergnaw {
    
    public static void main(String[] args) {
        new Beavergnaw();
    }

    Beavergnaw() {
        answer();
    }

    void answer() {
        /*
        1. Convert the cylinders to a square base

        2. Total area, obvious D^3
           V -> Unit of square / unit of circle
             -> 4 / PI
             -> IMPT* imagine a circle of rad 1, the a square surrounding it
                will have length of 2. Therefore their area ratio will be 4 : PI
                NOTE: r^2 is irrelevant here as it is just 1^2 = 1;
           V = V * 4 / PI

        3. D^3 - (V * 1 / pi) = d^3 + 2 frustum

        4. Frustum = Big pyramid - small pyramid
           Big Pyramid = D^2 * D/2 * 1/3 = D^3 / 6
           Small Pyramid = d^2 * d/2 * 1/3 = d^3 / 6
           1 Frustum = (D^3 - d^3) / 6

        5. D^3 - (V * 4 / PI) = d^3 + (D^3 - d^3) / 3
           d^3 = D^3 - (V * 4 / PI) - (D^3 / 3) + (d^3 / 3)
           (2d^3 / 3) = (2D^3 / 3) - (V * 4 / PI)
           d^3 = D^3 - (12V / 2PI)
           d^3 = D^3 - (6V / PI)
        */
        Kattio sc = new Kattio(System.in);
        while (true) {
            double D = sc.getDouble(), V = sc.getDouble();
            if (D == 0 && V == 0) break;
            System.out.printf("%.9f\n", Math.cbrt(Math.pow(D, 3) - (6 * V / Math.PI)));
        }
    }
}
