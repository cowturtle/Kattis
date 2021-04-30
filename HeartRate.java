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

class HeartRate {
    public static void main(String[] args) {
        new HeartRate();
    }

    HeartRate() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            n--;
            double[] bp = java.util.Arrays.stream(
                            sc.nextLine()
                            .split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();
            System.out.printf("%.4f %.4f %.4f \n", minABPM(bp[0], bp[1]), BPM(bp[0], bp[1]), maxABPM(bp[0], bp[1]));
        }        
        sc.close();
    }

    double minABPM(double b, double p) {
        return BPM(b, p) - 60 / p;
    }

    double BPM(double b, double p) {
        return 60 * b / p;
    }

    double maxABPM(double b, double p) {
        return BPM(b, p) + 60 / p;
    }

}
