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

class RoamingRomans {
    
    public static void main(String[] args) {
        new RoamingRomans();
    }

    RoamingRomans() {
        answer();
    }

    void answer() {
        System.out.println(
            Math.round(
                romanMileToPaces(
                    feetToRomanMile(
                        englishMilesToFeet(
                            Double.parseDouble(new java.util.Scanner(System.in).nextLine()))))));
    }

    double englishMilesToFeet(double d) {
        return d * 5280;
    }

    double feetToRomanMile(double d) {
        return d / 4854;
    }

    double romanMileToPaces(double d) {
        return d * 1000;
    }

}
